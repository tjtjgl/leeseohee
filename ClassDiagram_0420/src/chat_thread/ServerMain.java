package chat_thread;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Server {

	// 여러개의 스레드를 관리하는 pool
	// 병렬 작업 시 여러개 작업을 효율적으로 처리하기 위해서 자바에서 제공되는 라이브러리
	// 관리 안하면 스레드에 생성되고 삭제되는 작업을 손수 해야 함
	public static ExecutorService threadPool = null;
	public static Vector<Client> clientList = new Vector<>();

	ServerSocket sS;
	String ip = "127.0.0.1";
	int port = 19876;

	public Server() {
		startServer(ip, port);
	}

	public void startServer(String ip, int port) {
		this.ip = ip;
		this.port = port;

		try {
			sS = new ServerSocket();
			sS.bind(new InetSocketAddress(ip, port));

			String msg = "";

			// 문자열 연결 함수:
			msg += "[서버시작]" + ip + " : " + port + "\n";
			System.out.println(msg);

		} catch (IOException e) {
		}

		Runnable thread = new Runnable() {

			@Override
			public void run() {
				while (true) {
					try {
						Socket s = sS.accept();
						clientList.add(new Client(s));
						System.out
								.println("[클라이언트 접속]" + s.getRemoteSocketAddress() + Thread.currentThread().getName());

					} catch (IOException e) {
					}

				}
			}
		};

		// 스레드를 관리하는 풀을 만들려면 생성해야 함
		threadPool = Executors.newCachedThreadPool();
		// 스레드를 관리할 수 있도록 풀에 추가
		threadPool.submit(thread);

	}// 메소드 끝
}
	public class ServerMain {
		public static void main(String[] args) {
			new Server();
		}

	}

