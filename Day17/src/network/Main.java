package network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {
	public static void main(String[] args) {
		String hostname = "www.naver.com";
		try {
			InetAddress address = InetAddress.getByName(hostname);
			System.out.println(address.getHostAddress()); // ip 주소를 String 타입으로 변환
		} catch (UnknownHostException e) {
			System.out.println("ip를 찾을 수 없습니다.");
		}
	}
}
