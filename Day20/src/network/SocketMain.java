package network;

import java.net.InetAddress;
import java.net.Socket;

public class SocketMain {

	public static void main(String[] args) {

		Socket s1 = new Socket();
		Socket s2 = null;
		Socket s3 = null;
		Socket s4 = null;
		Socket s5 = null;

		try {

			// 원격지 IP, Port(문자열)에 연결하는 소켓 생성, 응답받는 용
			s3 = new Socket("www.naver.com", 80, InetAddress.getLocalHost(), 10000);
			s4 = new Socket("www.naver.com", 80);
			s5 = new Socket(InetAddress.getByName("www.naver.com"), 80);

			System.out.println(s1.getInetAddress() + ", " + s1.getPort());

			System.out.println();

			// ====로컬 주소 정보 (지정 여부)====
			// 지정 안했을 때
			s2 = new Socket("www.naver.com", 80);
			System.out.println(s2.getLocalAddress() + ":" + s2.getLocalPort());
			// 지정 했을 때
			System.out.println(s3.getLocalAddress() + ":" + s3.getLocalPort());

			// send/receive 버퍼사이즈
			System.out.println(s2.getSendBufferSize());
			System.out.println(s3.getReceiveBufferSize());

		} catch (Exception e) {
		}

	}

}
