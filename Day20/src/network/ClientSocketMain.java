package network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ClientSocketMain {

	public static void main(String[] args) {

		try {
			// 클라이언트 소켓 생성
			Socket clientS = new Socket("123.123.123.1", 9999);

			// 소켓으로 데이터를 전송할 입출력 스트림 생성
			//버퍼, 입출력
			//
			BufferedReader in = new BufferedReader
					(new InputStreamReader(clientS.getInputStream()));
			
			//저장, 내보내기
			BufferedWriter out = new BufferedWriter(
					new OutputStreamWriter(clientS.getOutputStream()));
			
			out.write("heelo\n");
			out.flush(); // 스트림 속 데이터 모두 전송
			
			clientS.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
