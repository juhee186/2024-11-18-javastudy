package com.sist.server;
import java.io.*;
import java.net.*;
import java.util.*;
import com.sist.commns.*;
public class Server implements Runnable {
	private Vector<Client>waitVc=
			new Vector<Server.Client>();
	// 1.저장공간
	// 2.서버가동
	private ServerSocket ss;
	// 3.접속시 => 연결
	private final int PORT=1212;
	
	// 4. 서버가동 => 소켓 초기화
	public Server()
	{
		try
		{
			ss=new ServerSocket(PORT);
			System.out.println("start");
		}catch (Exception ex) {ex.printStackTrace();}
	}
	// 5. 접속처리
	public void run()
	{
		try
		{
			while(true)
			{
				Socket s=ss.accept();
				Client client=new Client(s);
				client.start();
			}
		}catch (Exception ex) {}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Server server=new Server();
		new Thread(server).start();
	}
	// 클라이언트마다의 통신담당
	class Client extends Thread
	{
		Socket s;
		OutputStream out;
		BufferedReader in;
		
		String id,name,sex,pos;
		
		public Client(Socket s)
		{
			try
			{
				this.s=s;
				out=s.getOutputStream();
				in=new BufferedReader(
						new InputStreamReader(
								s.getInputStream()));
			}catch(Exception ex) {}
		}
		// 실제통신
		public void run()
		{
			try
			{
				while(true)
				{
					String msg=in.readLine();
					System.out.println("client=> "+msg);
					StringTokenizer st=
							new StringTokenizer(msg,"|");
					int protocol=Integer.parseInt(st.nextToken());
					switch(protocol)
					{
						case Function.LOGIN: //로그인요청
						{
							id=st.nextToken();
							name=st.nextToken();
							sex=st.nextToken();
							pos="대기실";
							
							// 1.접속이 된 사람들=>정보전송
							messageAll(Function.LOGIN+"|"
									+id+"|"+name+"|"+sex+"|"+pos);
							
							// 2.입장메시지
							messageAll(Function.WAITCHAT+"|[알림]"
									+name+"님 입장하셨습니다.");
							
							// 3.벡터 저장
							waitVc.add(this);
							// 3-2.화면변경
							messageTo(Function.MYLOG+"|"+id);
							// 4.접속된 모든 정보를 로그인된 사람에게 전송
							for(Client c:waitVc)
							{
								messageTo(Function.LOGIN+"|"
										+c.id+"|"
										+c.name+"|"
										+c.sex+"|"
										+c.pos);
							}
							
						}
						break;
						case Function.WAITCHAT:
						{
							messageAll(Function.WAITCHAT+"|["+name+"]"+st.nextToken());
						}
						break;
						case Function.EXIT:
						{
							messageAll(Function.EXIT+"|"+id);
							messageAll(Function.WAITCHAT+"|[알림]"+name+
										"님 퇴장하셨습니다");
							messageTo(Function.MYEXIT+"|");
							
							for(int i=0;i<waitVc.size();i++)
							{
								Client c=waitVc.get(i);
								if(c.id.equals(id))
								{
									waitVc.remove(i);
									try
									{
										in.close();
										out.close();
									}catch (Exception ex) {}
									break;
								}
							}
						}
						break;
						case Function.INFO:
						{
							String yid=st.nextToken();
							for(Client c:waitVc)
							{
								if(yid.equals(c.id))
								{
									messageTo(Function.INFO+"|"
											+c.id+"|"
											+c.name+"|"
											+c.sex+"|"
											+c.pos);
									break;
								}
							}
						}
						break;
					}
				}
			}catch(Exception ex) {}
		}
		
		public synchronized void messageAll(String msg)
		{
			for(int i=0;i<waitVc.size();i++)
			{
				Client c=waitVc.get(i);
				try
				{
					c.messageTo(msg);
				}catch(Exception ex)
				{
					waitVc.remove(i);
				}
			}
		}
		public synchronized void messageTo(String msg)
		{
			try
			{
				out.write((msg+"\n").getBytes());
			}catch(Exception ex) {}
		}
	}
}
