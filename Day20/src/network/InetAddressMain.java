package network;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class InetAddressMain {

	public static void main(String[] args) {
		
		try {
			InetAddress add1 = InetAddress.getByName("www.google.com");
			InetAddress add2 = InetAddress.getByAddress(new byte[]{39,(byte)217,(byte)161,(byte)132});
			InetAddress add3 = InetAddress.getByAddress("www.google.com",new byte[]{(byte)172,(byte)217,(byte)161,(byte)132});
			System.out.println(add1);
			System.out.println(add2);
			System.out.println(add3);
			
			//로컬,루프백 IP
			InetAddress add4 = InetAddress.getLocalHost();
			InetAddress add5 = InetAddress.getLoopbackAddress();
			System.out.println(add4);
			System.out.println(add5);

			InetAddress netsoul = InetAddress.getByName("www.netsoultech.com");
			System.out.println(netsoul);
			
			InetAddress[] add6 = InetAddress.getAllByName("www.naver.com");
			System.out.println(Arrays.toString(add6));
			
			//호스트와 IP 알아내기
			byte[] add = add1.getAddress();
			System.out.println(Arrays.toString(add));
			System.out.println(add1.getHostAddress());
			System.out.println(add1.getLoopbackAddress());
			
			System.out.println(add1.isMulticastAddress()); //멀티캐스트 영역인지 확인
			System.out.println(add1.isReachable(1000)); // =ping
			
			
			
			
		
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			System.out.println(e+ " 없는 도메인 입니다.");
		} catch (IOException e) {}
		
		
		

	}

}
