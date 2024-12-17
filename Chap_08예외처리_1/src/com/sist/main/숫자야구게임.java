package com.sist.main;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/*
 * 	1. 이벤트 처리
 * 	  ---------
 * 	  제공하는 메소드 => 구현이 안됨
 * 					--------인터페이스
 * 	  => ActionListener
 * 		:버튼클릭, 메뉴클릭, text에서 엔터
 * 		=>ActionPerforned() => 구현해서 사용
 * 	  => MouseListener / MouseMotionListener
 * 	  => KeyListener
 * 
 * => 문제 발생
 * 	=> 입력창에 정수 입력
 * 			--------예외처리
 */
public class 숫자야구게임 extends JFrame
implements ActionListener
{
	JTextArea ta; //힌트
	JTextField tf;
	JButton b1,b2;
	// 멤버변수
	// 초기화 => 생성자, 초기화블럭
	int[] com=new int[3];
	int[] user=new int[3];
	public 숫자야구게임()
	{
		//pane(word) Area(메모장)
		ta=new JTextArea();
		JScrollPane js=new JScrollPane(ta);
		ta.setEditable(false); //편집 방지
		tf=new JTextField(10);
		tf.setEnabled(false); //비활성화
		b1=new JButton("시작");
		b2=new JButton("종료");
		
		//배치
		JPanel p=new JPanel();
		p.add(tf);
		p.add(b1);
		p.add(b2);
		
		add("Center",js);
		add("South",p);
		
		setSize(350,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//이벤트 등록
		b1.addActionListener(this);
		// 자신이 갖고있는 actionPerformed()
		// 마우스 => addMouseListener()
		b2.addActionListener(this);
		tf.addActionListener(this);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new 숫자야구게임();
	}
	//난수발생 => 3자리 => 중복없는
	public void getRand()
	{
		for(int i=0;i<com.length;i++)
		{
			com[i]=(int)(Math.random()*9)+1;
			for(int j=0;j<i;j++)
			{
				if(com[i]==com[j])
				{
					i--; //원래 인덱스로 돌려준다
					break;
				}
			}
		}
	}
	//버튼처리
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b2) //b2클릭
		{
			int sel=JOptionPane.showConfirmDialog(this,"종료할까요?",
					"종료",JOptionPane.YES_NO_OPTION);
			if(sel==JOptionPane.YES_OPTION)
			{
				System.exit(0);
			}
			
		}
		else if(e.getSource()==b1)
		{
			getRand(); // 난수발생
			tf.setEnabled(true);
			tf.requestFocus();
			b1.setEnabled(false);
		}
		else if(e.getSource()==tf)
		{
			try
			{
				// 입력된 데이터 읽어오기
				String str=tf.getText();
				int input=Integer.parseInt(str);
				
				user[0]=input/100;
				user[1]=(input%100)/10;
				user[0]=input%10;
				
				if(input<100 || input>999)
				{
					JOptionPane.showMessageDialog(this, 
							"세자리 정수만 입력하세요");
					tf.setText("");
					tf.requestFocus();
					return; 
				}
				
				if(user[0]==user[1] || user[1]==user[2] || user[0]==user[2])
				{
					JOptionPane.showMessageDialog(this, 
							"중복된 수는 사용할 수 없습니다.");
					tf.setText("");
					tf.requestFocus();
					return; //메소드 종료
				}
				
				if(user[0]==0 || user[1]==0 || user[2]==0)
				{
					JOptionPane.showMessageDialog(this, 
							"0은 사용할 수 없습니다");
					tf.setText("");
					tf.requestFocus();
					return; 
				}
				int s=0,b=0;
				for(int i=0;i<3;i++) 
				{
					for(int j=0;j<3;j++)
					{
						if(com[i]==user[j]) //같은 수가 있냐
						{
							if(i==j)
								s++;
							else
								b++;
						}
					}
				}
				String hint="Input Number: "+input+"."+"Result: "+s+"S-"+b+"B\n";
				ta.append(hint);
				
				if(s==3)
				{
					JOptionPane.showMessageDialog(this,"프로그램을 종료합니다");
					System.exit(0);
				}
				
				tf.setText("");
				tf.requestFocus();
				
			}catch(NumberFormatException ex)
			{
				JOptionPane.showMessageDialog(this,
						"세 자리 정수만 입력하세요");
				tf.setText("");
				tf.requestFocus();
				// 예외복구 => RunTimeException
				// 예외처리가 없어도 가능(UnCheck)
				// 필요에 의해 처리
				// => UnCheckException
				
			}
		}
	}

}
