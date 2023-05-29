package chat_thread;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {

	private Socket clientSocket;
	private DataInputStream dis;
	private DataOutputStream dos;

	public Client(Socket clientSocket) {
		this.clientSocket = clientSocket;
		try {
			// 서버가 나한테 응답해주는 것
			dis = new DataInputStream(clientSocket.getInputStream());
			// 내가 서버한테 요청하는 것
			dos = new DataOutputStream(clientSocket.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}// 생성자 끝

	public void send(String msg) {

		// 익명클래스(1회용)
		Runnable thread = new Runnable() {
			public void run() {
				try {
					dos.writeUTF(msg);
				} catch (IOException e) {
				}
			}
		};
		// 여러개의 쓰레드를 관리하는 pool
		Server.threadPool.submit(thread);

	}// 메소드 끝

	public void receive() {

		Runnable thread = new Runnable() {

			@Override
			public void run() {
				try {
					// 메세지 수신을 계속 반복적으로 함
					while (true) {
						// utf-8
						String revData = dis.readUTF();
						System.out.println("[메세지 수신 성공]");
						// getRemoteSocketAddress() 연결된 시스템에 대한 주소 반환
						System.out.println(clientSocket.getRemoteSocketAddress() + Thread.currentThread().getName());

						for (Client client : Server.clientList) {
							client.send(Thread.currentThread().getName() + ":" + revData);
						} // for 중괄호
					} // while
				} catch (Exception e) {
				}
			}
		};
		Server.threadPool.submit(thread);
	}

}
