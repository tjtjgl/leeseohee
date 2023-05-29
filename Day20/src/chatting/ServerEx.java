package chatting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerEx {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);

		// 서로 번갈아가며 문자열 전송하는 간단한 채팅 프로그램
		// 문자열 끝에 \n, 라인 단위로 수신
		// 클라이언트가 bye 문자열을 보내면 종료되도록

		BufferedReader in = null;
		BufferedWriter out = null;

		ServerSocket listener = null; //서버소켓
		Socket s = null; //클라이언트가 들어올 통신용 소켓

		try {
			listener = new ServerSocket(9999); //서버 생성
			System.out.println("연결 기다리는 증");
			
			s = listener.accept(); //s에서 클라이언트를 무한 대기 중
			
			in = new BufferedReader(new InputStreamReader(
					s.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(
					s.getOutputStream()));
			
			while(true) {
				//클라이언트로부터 한 행씩 읽기!
				String inputMsg = in.readLine();
				
				if (inputMsg.equalsIgnoreCase("bye")) {
					System.out.println("채팅 종료");
					break;
				}
				
				System.out.println("클라이언트> "+inputMsg);
				System.out.println("서버> ");
				String outputMsg = sc.nextLine();
				out.write(outputMsg + "\n");
				out.flush();
			}
		} catch (IOException e) {}
		
		//예외 상관없이 무조건 동작
		finally {
			sc.close();
			try {
				s.close();			//통신용
				listener.close();	//서버용
			} catch (IOException e) {
				e.printStackTrace();
			}			
		}
	}
}
