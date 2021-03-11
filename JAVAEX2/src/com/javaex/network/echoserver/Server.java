package com.javaex.network.echoserver;

import java.io.IOException;
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
			Socket socket = serverSocket.accept();
			
			// 클라이언트 정보 확인 원격지 소켓의 주소 확인
			InetSocketAddress socketAddress = 
					(InetSocketAddress)socket.getRemoteSocketAddress(); 
			System.out.println("SERVER: [클라이언트 연결]");
			System.out.println("     클라이언트: " + socketAddress.getAddress()+" : "
			+ socketAddress.getPort());
			
			// 접속 허용시 후처리
			System.out.println("SERVER: [서버를 종료합니다]");
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
