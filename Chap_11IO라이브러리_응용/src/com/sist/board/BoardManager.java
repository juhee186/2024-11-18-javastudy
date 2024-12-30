package com.sist.board;
import java.util.*;
import java.io.*;
public class BoardManager {
	// 게시물을 모아 관리
	// 게시물이 모든 사용자에게 공유
	private static List<BoardVO> boardList=
			new ArrayList<BoardVO>();
	
	//초기화
	public BoardManager()
	{
		BoardGetdata();
	}
	//기능설정
	// 목록출력 => 페이지 나누기 => read select
	public List<BoardVO> boardListDate(int page)
	{
		List<BoardVO> list=
				new ArrayList<BoardVO>();
		int j=0;
		int pagecnt=(page*10)-10;
		List<BoardVO> temp=new ArrayList<BoardVO>();
		for(int i=boardList.size()-1;i>=0;i--)
		{
			temp.add(boardList.get(i));
		}
		
		for(int i=0; i<temp.size();i++)
		{
			if(j<10 && i>=pagecnt)
			{
				BoardVO vo=temp.get(i);
				list.add(vo);
				j++;
			}
		}
		return list;
	}
	// 추가 => create insert
	public void boardInsert(BoardVO vo)
	{
		boardList.add(vo);
		boardSave();
	}
	// 상세보기
	public BoardVO boardDetailData(int no)
	{
		BoardVO vo=new BoardVO();
		for(BoardVO dvo:boardList)
		{
			if(dvo.getNo()==no)
			{
				dvo.setHit(dvo.getHit()+1);
				boardSave();
				break;
			}
		}
		
		BoardGetdata();
		for(BoardVO dvo:boardList)
		{
			if(dvo.getNo()==no)
			{
				vo=dvo;
				break;
			}
		}
		return vo;
	}
	// 수정 삭제 => update / delete
	public BoardVO boardUpdateData(int no)
	{
		BoardVO vo=new BoardVO();
		for(BoardVO dvo:boardList)
		{
			if(dvo.getNo()==no)
			{
				vo=dvo;
				break;
			}
		}
		return vo;
	}
	public boolean boardUpdate(BoardVO vo)
	{
		boolean bCheck=false;
		int index=0;
		for(int i=0;i<boardList.size();i++)
		{
			BoardVO dvo=boardList.get(i);
			if(vo.getNo()==dvo.getNo())
			{
				index=i;
				break;
			}
		}
		BoardVO dvo=boardList.get(index);
		if(dvo.getPwd().equals(vo.getPwd()))
		{
			bCheck=true;
			boardList.set(index, vo);
			boardSave();
		}
		else
		{
			bCheck=false;
		}
		
		return bCheck;
		
	}
	public boolean boardDelete(int no,String pwd)
	{
		boolean bCheck=true;
		
		for(BoardVO vo:boardList)
		{
			if(vo.getNo()==no)
			{
				if(!vo.getPwd().equals(pwd))
				{
					bCheck=false;
					return bCheck;
				}
			}
		}
		
		int index=0;
		for(int i=0;i<boardList.size();i++)
		{
			BoardVO vo=boardList.get(i);
			if(vo.getNo()==no)
			{
				index=i;
				break;
			}
		}
		boardList.remove(index);
		boardSave();
		
		return bCheck;
	}
	// 찾기 => 검색
	// 오라클 =>
	// 중복 => 저장 / 읽기 => 별도의 메소드로 제작
	public void BoardGetdata()
	{
			ObjectInputStream ois=null;
			try
			{
				FileInputStream fis=new FileInputStream("c:\\java_data\\board.txt");
				ois=new ObjectInputStream(fis);
				boardList=(List<BoardVO>)ois.readObject();
				
			}catch(Exception ex)
			{
			ex.printStackTrace();	
			}
			finally
			{
				try
				{
					ois.close();
				}catch (Exception ex) {}
			}
	}
	public void boardSave()
	{
		ObjectOutputStream oos=null;
		try
		{
			FileOutputStream fos=
				new FileOutputStream("c:\\java_data\\board.txt");
			oos=new ObjectOutputStream(fos);
			oos.writeObject(boardList);
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				oos.close();
			}catch(Exception ex) {}
		}
	}
	public int boardTotalPage()
	{
		return(int)(Math.ceil(boardList.size()/10.0));
	}
	public int boardSequence()
	{
		int max=0;
		
		try
		{
			for(BoardVO vo:boardList)
			{
				if(vo.getNo()>max)
				{
					max=vo.getNo();
				}
			}
		}catch (Exception ex) {}
		
		return max+1;
	}
	
	
}
