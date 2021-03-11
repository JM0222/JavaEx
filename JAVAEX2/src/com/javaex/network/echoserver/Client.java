package com.javaex.network.echoserver;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		Socket socket = null;
		try {
			// 소켓 객체 생성
			socket = new Socket();
			
			// 시작 메시지
			System.out.println("<클라이언트 시작>");
			System.out.println("CLIENT: [연결을 요청하는중]");
			
			// 접속 시도                                   (서버주소)
			InetSocketAddress remote = new InetSocketAddress("127.0.0.1",10000);
			// 127.0.0.1 << local loop back 자기자신일경우
			socket.connect(remote);
			System.out.println("CLIENT: [서버에 연결되었습니다]");
			
			// 메세지 전송 //  소켓에서 출력 스트림 획득
			OutputStream os = socket.getOutputStream();
			Writer osw = new OutputStreamWriter(os, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw); // 보조스트림 연결
			
			String msg = "테스트 메세지";
			bw.write(msg);
			System.out.println("CLIENT: [전송 메세지]: " + msg);
			
			bw.close();
			
			// 후처리
			System.out.println("CLIENT: [클라이언트 종료]");
			
		}catch (ConnectException e) {
			System.err.println("[접속거부]");
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				socket.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}