package com.kh.practice.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServer {
	/*
	 * * TCP :서버와 클라이언트의 1:1 통신 :데이터 교환 전 서버와 클라이언트가 연결되어야 함 (연결 잔에는 서버가 먼저 실행되어 있어야
	 * 함 -->클라이언트가 요철할수있음 ) : 신뢰성 있는 데이털를 전달 가능
	 * 
	 * -소켓 : 네트워크 상 통신할때 텅러 역할 Input / OutputStream 을 가지고 있음 (입출력 시 사용)
	 * *ServerSocket :설정된 포트로 프로그램이 실행되어 외부의 연결 요청을 대기하다 요청ㅇ이 들어오면 수락(통신할 수 있는
	 * socket를 생성)하는 용도
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1) 포트 번호 정의
		int port = 3000;

		ServerSocket server = null;
		BufferedReader Stream = null;
		PrintWriter pw = null;

		try {
			// 2) 서버용 소캣 객체 생성 (ServerSocket)
			server = new ServerSocket(port);

			// --------클라이언트 요청 대기------
			System.out.println("----요청 대기 중------");

			// 3) 연결 요청시 수락 후 해당 클라이언트의 통신 준비 (Socket 객체 생성)
			Socket socket = server.accept();
			System.out.println(socket.getInetAddress().getHostAddress() + "로부터의 연결 요청...");

			// 4)클라이언트와의 입출력을 위한 스트림 생성
			// +입력용 스트림 : 클라이언트로부터 데이터를 입력받는용도
			Stream = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// +출력용 스트림 : 클라이언트으로부터 전달의 데이터를 출력하기 위한 용도
			pw = new PrintWriter(socket.getOutputStream());

			while (true) {

				String message = Stream.readLine();
				System.out.println(socket.getInetAddress().getHostAddress() + ":" + message);

				System.out.print("답변 : ");
				String sendMessage = sc.nextLine();

			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {

				if (pw != null)
					pw.close();
				if (Stream != null)
					Stream.close();

				if (server != null)
					server.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}
}
