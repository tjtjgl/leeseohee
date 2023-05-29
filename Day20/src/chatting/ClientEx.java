package chatting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		BufferedReader in = null;
		BufferedWriter out = null;

		Socket s = null;

		try {
			//클라이언트 소켓 생성, 서버에 연결
			//둘 중 하나라도 없으면 연결은 안되지만 소켓은 생성 됨
			s = new Socket("localhost", 9999);

			in = new BufferedReader(new InputStreamReader(
					s.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(
					s.getOutputStream()));

			while (true) {
				//클라이언트가 먼저 시작!

				System.out.println("클라이언트> ");
				
				String outputMsg = sc.nextLine();
				if (outputMsg.equalsIgnoreCase("bye")) {
					out.write(outputMsg + "\n");
					out.flush(); // 서버로 보낸 후 종료!
					System.out.println("채팅 종료");
					break;
				}
				//System.out.println(outputMsg + "\n");
				out.flush();
				
				String inputMsg = in.readLine();
				System.out.println("서버> " + inputMsg);


			}

		} catch (IOException e) {
		}

		finally {
			sc.close();
			try {
				if (s != null) {
				s.close(); // 통신용
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
