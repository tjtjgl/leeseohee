package network;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;

public class SocketAddressMain {

	public static void main(String[] args) {
		InetAddress add1 = null;

		
		try {
			add1 = InetAddress.getByName("www.google.com");

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		int port = 20000;
		InetSocketAddress socket1 = new InetSocketAddress(port);
		InetSocketAddress socket2 = new InetSocketAddress(add1,port);

		System.out.println(socket1);
		System.out.println(socket2);
		System.out.println(socket1.getPort());

		
		
		
		
		

	}

}
