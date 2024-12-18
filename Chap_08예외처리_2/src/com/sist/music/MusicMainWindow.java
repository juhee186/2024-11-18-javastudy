package com.sist.music;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;
public class MusicMainWindow extends JFrame
implements ActionListener
{
	String[] names= {"top50","가요","pop","ost","트롯","zazz","classic"};
	JButton[] btns=new JButton[7];
	JTable table;
	DefaultTableModel model;
	
	public MusicMainWindow()
	{
		JPanel p=new JPanel();
		p.setLayout(new GridLayout(1,7));
		for(int i=0;i<btns.length;i++)
		{
			btns[i]=new JButton(names[i]);
			p.add(btns[i]);
			btns[i].addActionListener(this);
		}
		
		add("North",p);
		
		String[] col= {"곡명","가수명","앨범"};
		String[][] row=new String[0][3];
		model=new DefaultTableModel(row,col);
		table=new JTable(model);
		JScrollPane js=new JScrollPane(table);
		
		table.setRowHeight(35);
		table.getTableHeader().setBackground(Color.orange);
		table.setShowVerticalLines(false);
		table.setShowHorizontalLines(true);
		
		add("Center",js);
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
//		String[] temp= {"aaaaa","bbbbb","ccccc"};
//		model.addRow(temp);
//		model.addRow(temp);
//		model.addRow(temp);
//		display(1);
		
	}
	public void display(int type)
	{	
		for(int i=model.getRowCount()-1;i>=0;i--)
		{
			model.removeRow(i);
		}
		MusicSystem ms=new MusicSystem();
		MusicVO[] music= ms.musicData(type);
		for(MusicVO vo:music)
		{
			String[] data= {
					vo.getTitle(),
					vo.getSinger(),
					vo.getAlbum()
							};
			model.addRow(data);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MusicMainWindow();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		for(int i=0;i<btns.length;i++)
		{
			if(e.getSource()==btns[i])
			{
				display(i+1);
				break;
			}
		}
	}

}
