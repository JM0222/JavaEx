package com.javaex.network.echoserver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ServerThread extends Thread{
		// 실제 통신 담당 Thread
	private Socket socket;
	
	
	// 생성자
	
	public ServerThread(Socket socket) {
		this.socket = socket;
	}

	// 쓰레드 로직
	@Override
	public void run() {
		try {
			InetSocketAddress socketAddress = 
					(InetSocketAddress)socket.getRemoteSocketAddress(); 
			System.out.println("SERVER: [클라이언트 연결]");
			System.out.println("     클라이언트: " + socketAddress.getAddress()+" : "
			+ socketAddress.getPort());
			
			// 메세지 수신 socket 으로부터 IS열어야한다
			InputStream is = socket.getInputStream();
			Reader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr); // 한줄 단위로 읽기가능
			
			// echo back 을위한 outputstream
			OutputStream os = socket.getOutputStream();
			Writer osw = new OutputStreamWriter(os, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
			
			
			
			// 메세지 읽어오기
			String msg;
			while (true) {
				msg = br.readLine();
				if (msg == null) {
					// 더이상 읽을 메세지 없을 경우
					System.out.println("SERVER: [더이상 메세지가 없다.접속종료!]");
					break;
				}
				System.out.println("SERVER: [수신메세지]" + msg);
				
				// Echo Back 메시지 전송
				msg = "Echo back - " + msg;
				System.out.println("SERVER: [Echo Back]: "+ msg);
				bw.write(msg); // stream에 저장
				bw.newLine();
				bw.flush();
			}
			bw.close();
			br.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
		//----------------------WORKING THREAD END---------------------
		super.run();
	}
	
	
}
