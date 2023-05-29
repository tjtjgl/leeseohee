package network;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class ServerSocketMain {

	public static void main(String[] args) {

		ServerSocket ss1 = null;
		ServerSocket ss2 = null;

		try {

			ss1 = new ServerSocket();
			ss2 = new ServerSocket(20000);

			ss1.bind(new InetSocketAddress("127.0.0.1", 10000));
		} catch (IOException e) {
		}
		// @bind
		System.out.println(ss1.isBound());// false
		System.out.println(ss2.isBound());// true

		System.out.println();

		int i = 0;
		for (; i < 65536; i++) {
			try {

				ServerSocket ss = new ServerSocket(i);
			} catch (IOException e) {
				System.err.println(i + "번 포트 사용 중");
			}
		}

		try {
			ss1.setSoTimeout(0);
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			Socket socket = ss1.accept();
		} catch (IOException e) {
			try {
				System.out.println(ss1.getSoTimeout() + "초 시간 초과");
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
	}
}
