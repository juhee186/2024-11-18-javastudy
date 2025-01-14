package com.sist.main;
//AcrylLookAndFeel
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import com.sist.dao.*;
import com.sist.vo.*;

public class ClientMain extends JFrame
implements ActionListener
{
	MenuForm mf=new MenuForm();
	ControlPanel cp=new ControlPanel();
	//배치
	public ClientMain()
	{
		setLayout(null);//사용자정의=>직접배치
		mf.setBounds(20, 20, 1250, 50);
		add(mf);
		cp.setBounds(20, 80, 1250, 870);
		add(cp);
		setSize(1300,1000);
		setVisible(true);
		
		cp.b1.addActionListener(this);
		cp.b2.addActionListener(this);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
		}catch(Exception ex) {}
		new ClientMain();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==cp.b2)
		{
			System.exit(0);
		}
		else if(e.getSource()==cp.b1)
		{
			String id=cp.tf.getText();
			if(id.trim().length()<1)
			{
				cp.tf.requestFocus();
				return;
			}
			String pwd=String.valueOf(cp.pf.getPassword());
			if(pwd.trim().length()<1)
			{
				cp.pf.requestFocus();
				return;
			}
			
			MemberDAO dao=MemberDAO.newInstance();
			MemberVO vo=dao.isLogin(id, pwd);
			if(vo.getMsg().equals("NOID"))
			{
				JOptionPane.showMessageDialog(this, "아이디가 존재하지 않습니다");
				cp.tf.setText("");
				cp.pf.setText("");
				cp.tf.requestFocus();
			}
			else if(vo.getMsg().equals("NOPWD"))
			{
				JOptionPane.showMessageDialog(this, "비밀번호가 틀립니다");
				cp.pf.setText("");
				cp.pf.requestFocus();
			}
			else
			{
				String msg=vo.getName()+"님 로그인되었습니다\n"+"메인페이지로 이동합니다";
				JOptionPane.showMessageDialog(this, msg);
			}
		}
	}

}
