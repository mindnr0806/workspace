package com.kh.practice.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String ip ="192.168.10.5";
		int prot = 3000;
		
		Socket socket = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		
		try {
		socket = new Socket(ip, prot);
		if(socket !=null) {
			System.out.println("서버" + ip +":"+ prot +"로 연결 성공!");
			
			//입력용 스트림
			br =new BufferedReader(new InputStreamReader(socket.getInputStream() ));
			
			pw = new PrintWriter( socket.getOutputStream() );
			
			while(true) {
				System.out.print("메세지 입력 :");
				String message = sc.nextLine();
			
			pw.println(message); pw.flush();
			
			String receive = br.readLine();
			System.out.println("서버 응답 : " + receive);
			}	
		}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(br != null) br.close();
				if(pw != null) br.close();
				
				if(socket !=null) socket.close();
				
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
}
}
