package chat_thread;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientMain {
	private Socket socket;
	private DataInputStream dis;
	private DataOutputStream dos;
	String ip = "127.0.0.1";
	int port = 19876;

	public ClientMain() {
		startServer(ip, port);
	}

	public void startServer(String ip, int port) {
		try {
			socket = new Socket(ip, port);

			dis = new DataInputStream(socket.getInputStream());
			dos = new DataOutputStream(socket.getOutputStream());

			receive();
			send();

		} catch (Exception e) {
		}
	}

	public void receive() {
		new Thread(new Runnable() {
			boolean isThread = true;

			@Override
			public void run() {
				while (isThread) {
					try {
						String revData;
						revData = dis.readUTF();
						if (revData.equals("/quit")) {
							isThread = false;
						} else {
							System.out.println("[메세지]");
						}
					} catch (IOException e) {}
				}
			}
		}).start();
	}

	public void send() {
	}

	public static void main(String[] args) {
		new ClientMain();
	}

}
