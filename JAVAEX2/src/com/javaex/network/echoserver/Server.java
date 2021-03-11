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
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket serverSocket = null;
		
		try {
			// 바인드 - IP연결
			serverSocket = new ServerSocket();
			InetSocketAddress ips = new InetSocketAddress("0.0.0.0",10000);
			serverSocket.bind(ips);
			
			// 시작 메시지
			System.out.println("<서버 시작");
			System.out.println("SERVER: [연결을 기다리는중]");
			
			
			// 연결 대기
			while(true) {
				Socket socket = serverSocket.accept();
				Thread thread = new ServerThread(socket);
				thread.start();
			}
			// ---------------WORKING THREAD---------------------
			// 클라이언트 정보 확인 원격지 소켓의 주소 확인
//			InetSocketAddress socketAddress = 
//					(InetSocketAddress)socket.getRemoteSocketAddress(); 
//			System.out.println("SERVER: [클라이언트 연결]");
//			System.out.println("     클라이언트: " + socketAddress.getAddress()+" : "
//			+ socketAddress.getPort());
//			
//			// 메세지 수신 socket 으로부터 IS열어야한다
//			InputStream is = socket.getInputStream();
//			Reader isr = new InputStreamReader(is);
//			BufferedReader br = new BufferedReader(isr); // 한줄 단위로 읽기가능
//			
//			// echo back 을위한 outputstream
//			OutputStream os = socket.getOutputStream();
//			Writer osw = new OutputStreamWriter(os, "UTF-8");
//			BufferedWriter bw = new BufferedWriter(osw);
//			
//			
//			
//			// 메세지 읽어오기
//			String msg;
//			while (true) {
//				msg = br.readLine();
//				if (msg == null) {
//					// 더이상 읽을 메세지 없을 경우
//					System.out.println("SERVER: [더이상 메세지가 없다.접속종료!]");
//					break;
//				}
//				System.out.println("SERVER: [수신메세지]" + msg);
//				
//				// Echo Back 메시지 전송
//				msg = "Echo back - " + msg;
//				System.out.println("SERVER: [Echo Back]: "+ msg);
//				bw.write(msg); // stream에 저장
//				bw.newLine();
//				bw.flush();
//			}
//			bw.close();
//			br.close();
			//----------------------WORKING THREAD END---------------------
			
			
			// 접속 허용시 후처리
//			System.out.println("SERVER: [서버를 종료합니다]");
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				serverSocket.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}
