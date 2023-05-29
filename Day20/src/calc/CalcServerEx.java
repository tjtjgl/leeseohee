package calc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class CalcServerEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		BufferedReader in = null;
		BufferedWriter out = null;
		
		ServerSocket svrSocket = null;
		Socket socket = null;

		try {
			svrSocket = new ServerSocket(9999); //서버 생성
			System.out.println("연결 기다리는 증");
			
			socket = svrSocket.accept(); //s에서 클라이언트를 무한 대기 중
			
			in = new BufferedReader(new InputStreamReader(
					socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(
					socket.getOutputStream()));
			
			while(true) {
				//클라이언트로부터 한 행씩 읽기!
				String inputMsg = in.readLine();
				
				if (inputMsg.equalsIgnoreCase("bye")) {
					System.out.println("채팅 종료");
					break;
				}
				System.out.println("클라이언트> "+inputMsg);
				
				String[] str = inputMsg.split(" ");
				int x = Integer.parseInt(str[0]);
				int y = Integer.parseInt(str[2]);
				int res = 0;
				
				if(str[1].equals("+")) {
					res = x+y;
				}else if(str[1].equals("-")) {
					res = x-y;
				}else if(str[1].equals("*")) {
					res = x*y;
				}else if(str[1].equals("/")) {
					res = x/y;
				}else if(str[1].equals("%")) {
					res = x%y;
				}

				//System.out.println("계산결과: "+ res);
				String outputMsg = "계산결과: "+ res;
				out.write(outputMsg + "\n");
				out.flush();
			}
		} catch (IOException e) {}
		
		//예외 상관없이 무조건 동작
		finally {
			try {
				sc.close();
				socket.close();			//통신용
				svrSocket.close();	//서버용
			} catch (IOException e) {
				e.printStackTrace();
			}			
		}
	}
}
