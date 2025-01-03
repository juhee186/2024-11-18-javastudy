package com.sist.client;
import java.util.*;
import java.net.*;
import java.awt.*;
import java.io.*;
import javax.swing.*;
import java.awt.event.*;
import com.sist.commns.*;


public class ChatMain extends JFrame
implements ActionListener,Runnable,MouseListener
{
	Login login=new Login();
	WaitRoom wr=new WaitRoom();
	CardLayout card=new CardLayout();
	
	// 네트워크 관련 클래스
	Socket s;
	OutputStream out;
	BufferedReader in;
	// 본인 여부 확인
	String myId;
	
	int selRow=-1;
	
	public ChatMain()
	{
		setLayout(card);
		add("LOG",login);
		add("WR",wr);
		
		setSize(800,600);
		setVisible(true);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		
		login.b1.addActionListener(this);
		login.b2.addActionListener(this);
		
		wr.tf.addActionListener(this);
		wr.b6.addActionListener(this);
		
		wr.ta2.addMouseListener(this);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ChatMain();
	}
	
	// 서버 => 수신 => 화면출력 => 쓰레드
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try
		{
			while(true)
			{
				String msg=in.readLine();
				StringTokenizer st=
						new StringTokenizer(msg,"|");
				int protocol=Integer.parseInt(st.nextToken());
				switch(protocol)
				{
				case Function.LOGIN:
				{
					String[] data= {
						st.nextToken(),
						st.nextToken(),
						st.nextToken(),
						st.nextToken()
					};
					wr.mo2.addRow(data);
				}
				break;
				case Function.MYLOG:
				{
					card.show(getContentPane(), "WR");
					myId=st.nextToken();
					setTitle(myId);
				}
				break;
				case Function.WAITCHAT:
				{
					wr.ta.append(st.nextToken()+"\n");
					wr.bar.setValue(wr.bar.getMaximum());
				}
					break;
				case Function.EXIT: //남아있는 사람처리
				{
					String yid=st.nextToken();
					for(int i=0;i<wr.mo2.getRowCount();i++)
					{
						String id=wr.mo2.getValueAt(i, 0).toString();
						if(yid.equals(id))
						{
							wr.mo2.removeRow(i);
							break;
						}
					}
				}
				break;
				case Function.MYEXIT: //실제 나간 사람
				{
					dispose();
					System.exit(0);
				}
				break;
				case Function.INFO:
				{
					String data="아이디 "+st.nextToken()+"\n"
							+"이름 "+st.nextToken()+"\n"
							+"성별 "+st.nextToken()+"\n"
							+"방위치 "+st.nextToken();
					JOptionPane.showMessageDialog(this, data);
				}
				break;
				}
			}
		}catch (Exception ex) {}
	}
	
	// 서버로 요청값 전송 => 사용자
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==login.b2)
		{	
			dispose();
			System.exit(0);
		}
		else if(e.getSource()==login.b1)
		{
			// 1.입력값 읽기
			String id=login.tf1.getText();
			if(id.trim().length()<1)
			{
				JOptionPane.showConfirmDialog(this,
						"아이디를 입력하세요");
				login.tf1.requestFocus();
				return;
			}
			String name=login.tf2.getText();
			if(id.trim().length()<1)
			{
				JOptionPane.showConfirmDialog(this,
						"이름은 입력하세요");
				login.tf2.requestFocus();
				return;
			}
			String sex="남자";
			if(login.rb1.isSelected())
			{
				sex="남자";
			}
			else 
			{
				sex="여자";
			}
			connection(id,name,sex);
		}
		else if(e.getSource()==wr.tf)
		{
			String msg=wr.tf.getText();
			if(msg.trim().length()<1)
			{
				wr.tf.requestFocus();
				return;
			}
			try
			{
				out.write((Function.WAITCHAT+"|"
							+msg+"\n").getBytes());
			}catch(Exception ex) {}
			wr.tf.setText(" ");
		}
		else if(e.getSource()==wr.b6)
		{
			//나가기
			try
			{
				out.write((Function.EXIT+"|\n").getBytes());
			}catch(Exception ex) {}
		}
	}
	public void connection(String id,String name,String sex)
	{
		try
		{
			s=new Socket("192.168.10.116",1212);
			out=s.getOutputStream();
			in=new BufferedReader(
					new InputStreamReader(
							s.getInputStream()));
			
			out.write((Function.LOGIN+"|"
							+id+"|"+name+"|"+sex+"\n").getBytes());
		}catch (Exception ex) {}
		new Thread(this).start();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==wr.ta2)
		{
			if(e.getClickCount()==2)
			{
				int row=wr.ta2.getSelectedRow();
				String id=wr.mo2.getValueAt(row, 0).toString();
				try
				{
					out.write((Function.INFO+"|"+id+"\n").getBytes());
				}catch(Exception ex) {}
			}
		}
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
