package com.sist.main;
import javax.swing.*;
import java.util.*;
import java.util.List;
import com.sist.board.*;
import java.awt.*;
import java.awt.Event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;
public class BoardMainForm extends JFrame 
implements ActionListener,MouseListener
{
	CardLayout card=new CardLayout();
	BoardList bList=new BoardList();
	BoardDetail bdetail=new BoardDetail();
	BoardInsert bInsert=new BoardInsert();
	BoardUpdate bupdate=new BoardUpdate();
	
	BoardManager bm=new BoardManager();
	
	BoardDelete bDelete=new BoardDelete();
	
	int curpage=1;
	int totalpage=0;
	public BoardMainForm()
	{
		setLayout(card);
		
		add("LiST",bList);
		add("DETAIL",bdetail);
		add("INSERT",bInsert);
		add("UPDATE",bupdate);
		add("Delete",bDelete);
		
		setTitle("윈도우 게시판 ver1.0");
		listPrint();
		setSize(640,550);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		bList.inBtn.addActionListener(this);
		bInsert.b1.addActionListener(this);
		bInsert.b2.addActionListener(this);
		
		bList.prevBtn.addActionListener(this);
		bList.nextBtn.addActionListener(this);
		
		bList.table.addMouseListener(this);
		
		bdetail.b3.addActionListener(this);
		bdetail.b1.addActionListener(this);
		bdetail.b2.addActionListener(this);
		
		bDelete.b1.addActionListener(this);
		bDelete.b2.addActionListener(this);
	}
	public void listPrint()
	{
		for(int i=bList.model.getRowCount()-1;i>=0;i--)
		{
			bList.model.removeRow(i);
		}
		List<BoardVO> list=bm.boardListDate(curpage);
		totalpage=bm.boardTotalPage();
		bList.pageLa.setText(curpage+"page/"+totalpage+"pages");
		
		for(int i=0;i<list.size();i++)
		{
			BoardVO vo=list.get(i);
			String[] data= {
				String.valueOf(vo.getNo()),
				vo.getSubject(),
				vo.getName(),
				new SimpleDateFormat("yyyy-mm-dd")
				.format(vo.getRegdate()),
				String.valueOf(vo.getHit())
			};
			bList.model.addRow(data);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BoardMainForm();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(bList.inBtn==e.getSource())
		{
			bInsert.nameTf.setText("");
			bInsert.subTf.setText("");
			bInsert.ta.setText("");
			bInsert.pwdPf.setText("");
			card.show(getContentPane(), "INSERT");
			bInsert.nameTf.requestFocus();
		}
		else if(bInsert.b2==e.getSource())
		{
			card.show(getContentPane(), "LIST");
		}
		else if(bInsert.b1==e.getSource())
		{
			String name=bInsert.nameTf.getText();
			if(name.length()<1)
			{
				bInsert.nameTf.requestFocus();
				return;
			}
			String subject=bInsert.subTf.getText();
			if(subject.length()<1)
				{
					bInsert.subTf.requestFocus();
					return;
				}
			String content=bInsert.ta.getText();
			if(content.length()<1)
				{
					bInsert.ta.requestFocus();
					return;
				}
			String pwd=String.valueOf(bInsert.pwdPf.getPassword());
			if(pwd.length()<1)
				{
					bInsert.pwdPf.requestFocus();
					return;
				}
			BoardVO vo=new BoardVO();
			vo.setName(name);
			vo.setSubject(subject);
			vo.setContent(content);
			vo.setPwd(pwd);
			int no=bm.boardSequence();
			vo.setNo(no);
			vo.setRegdate(new Date());
			
			bm.boardInsert(vo);
			
			card.show(getContentPane(), "LIST");
			listPrint();
			
		}
		else if(e.getSource()==bList.prevBtn)
		{
			if(curpage>1)
			{
				curpage--;
				listPrint();
			}
		}
		else if(e.getSource()==bList.nextBtn)
		{
			if(curpage<totalpage)
			{
				curpage++;
				listPrint();
			}
		}
		else if(e.getSource()==bdetail.b3)
		{
			card.show(getContentPane(), "LIST");
			listPrint();
		}
		else if(e.getSource()==bdetail.b2)
		{
			card.show(getContentPane(), "DELETE");
		}
		else if(e.getSource()==bdetail.b1)
		{
			String no=bdetail.no.getText();
			BoardVO vo=
					bm.boardUpdateData(Integer.parseInt(no));			
			card.show(getContentPane(), "UPDATE");
			bupdate.nameTf.setText(vo.getName());
			bupdate.subTf.setText(vo.getSubject());
			bupdate.ta.setText(vo.getContent());
		}
		else if(e.getSource()==bDelete.b2)
		{
			card.show(getContentPane(), "DETAIL");
		}
		else if(e.getSource()==bDelete.b1)
		{
			String pwd=String.valueOf(bDelete.pf.getPassword());
			if(pwd.length()<1)
			{
				bDelete.pf.requestFocus();
				return;
			}
			String no=bdetail.no.getText();
			boolean bCheck=
				bm.boardDelete(Integer.parseInt(no), pwd);
			if(bCheck==false)
			{
				JOptionPane.showMessageDialog(this, 
						"비밀번호가 틀립니다.");
				bDelete.pf.setText("");
				bDelete.pf.requestFocus();
			}
			else 
			{
				card.show(getContentPane(), "List");
				listPrint();
			}
		}
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==bList.table)
		{
			if(e.getClickCount()==2)
			{
				int row=bList.table.getSelectedRow();
				String no=bList.model.getValueAt(row, 0).toString();
				BoardVO vo=bm.boardDetailData(Integer.parseInt(no));
				
				card.show(getContentPane(), "DETAIL");
				
				bdetail.no.setText(String.valueOf(vo.getNo()));
				bdetail.name.setText(vo.getName());
				bdetail.sub.setText(vo.getSubject());
				bdetail.ta.setText(vo.getContent());
				bdetail.hit.setText(String.valueOf(vo.getHit()));
				bdetail.day.setText(new SimpleDateFormat("yyyy-mm-dd").format(vo.getRegdate()));
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
