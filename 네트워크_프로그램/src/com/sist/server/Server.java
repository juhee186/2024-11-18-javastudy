package com.sist.server;
import java.util.*;
import com.sist.commons.*;
import java.io.*;
import java.net.*;
public class Server implements Runnable{
	private ServerSocket ss;
	private final int PORT=1212; 
	
	private Vector<Client> waitVc=
			new Vector<Client>();
	public Server()
	{
		try
		{
			ss=new ServerSocket(PORT);
			
			System.out.println("서버 시작");
			
		}catch(Exception ex){}
	}
	public void run()
	{
		try
		{
			while(true)
			{
				Socket s=ss.accept();
				Client client=
						new Client(s);
				waitVc.add(client);
				client.start(); // 시작해라 명령
			}
		}catch (Exception ex) {}
	}
	// 접속시 처리 => 접속자 정보 저장(ip / port) 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Server server=new Server();
		new Thread(server).start();

	}
	// 클라이언트 정보 => 통신 담당 => 클라이언트마다 따로 작성
	class Client extends Thread
	{
		// 한명하고만 연결
		Socket s;
		OutputStream out;
		BufferedReader in;
		
		public Client(Socket s)
		{
			try
			{
			this.s=s;
			out=s.getOutputStream();
			in=new BufferedReader(
					new InputStreamReader(s.getInputStream()));
			}catch(Exception ex) {}
		}
		// 통신위치
		// 채팅
		public void run()
		{
			try
			{
				while(true)
				{
					// 사용자가 보내준 데이터 받기
					String msg=in.readLine();
					messageAll(msg);
				}
			}catch (Exception ex) {}
		}
		// 전체 전송
		public synchronized void messageAll(String msg)
		{
			try
			{
				for(Client c:waitVc)
				{	
					c.messageTo(msg);
				}
			}catch (Exception ex) {}
		}
		// 한명 전송
		public synchronized void messageTo(String msg)
		{
			try
			{
				out.write((msg+"\n").getBytes());
			}catch (Exception ex) {}
		}
	}
	
	
}
