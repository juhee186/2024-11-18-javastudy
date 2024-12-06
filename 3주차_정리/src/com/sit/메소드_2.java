package com.sit;
import java.util.Scanner;
import java.io.*; // 파일,네트워크 전송 : 읽기/쓰기 > IO : 반드시 예외처리
public class 메소드_2 {
	static String seouldata;
	static 
	{
		try
		{
			FileReader fr=new FileReader("c:\\javadev\\seoul_location.txt");
			int i=0;
			StringBuffer sb=new StringBuffer();
			while((i=fr.read())!=-1)
			{
				sb.append((char)i);
			}
			seouldata=sb.toString();
			fr.close();
		}catch(Exception ex) {}
	}
	static void menu()
	{ 
		System.out.println("========menu===========");
		System.out.println("1. 명소 목록");
		System.out.println("2. 명소 상세보기");
		System.out.println("3. 명소 검색(명소명)");
		System.out.println("4. 명소 검색(주소)");
		System.out.println("5. 프로그램 종료");
		System.out.println("=======================");
	}
	static void place(int page)
	{
		String[] seoul=seouldata.split("\n");
		int i=0;
		int j=0;
		final int rowsize=20;
		int pagecnt=(page*rowsize)-rowsize;
		for(String s:seoul)
		{
			// System.out.println(s);
			if(j<20 && i>=pagecnt)
			{
				String[] sd=s.split("\\|");
				System.out.println(sd[0]+"."+sd[1]);
				j++;
			}
			i++;
		}
	}
	static void placedetail(int placeno)
	{
		String[] place=seouldata.split("\n");
		for(String p:place)
		{
			String[] info=p.split("\\|");
			if(info[0].equals(String.valueOf(placeno)))
			{
				System.out.println("명소: "+info[1]);
				System.out.println("소개: "+info[2]);
				System.out.println("주소: "+info[3]);
				break;
			}
		}
	}
	static String[] find(int type,String finddata)
	{
		String[] datas=seouldata.split("\n");
		int count=0;
		for(String seoul:datas)
		{
			String[]sd=seoul.split("\\|");
			String ss="";
			if(type==1)
			{
				ss=sd[1];
			}
			else
			{
				ss=sd[3];
			}
			if(ss.contains(finddata))
			{
				count++;
			}
		}
		String[] data=new String[count];
		int i=0;
		for(String seoul:datas)
		{
			String[]sd=seoul.split("\\|");
			String ss="";
			if(type==1)
			{
				ss=sd[1];
			}
			else
			{
				ss=sd[3];
			}
			if(ss.contains(finddata))
			{
				data[i]=sd[1]+"--"+sd[3];
				i++;
			}
		}
		return data;
	}
	
	static void process()
	{
		Scanner scan=new Scanner(System.in);
		while(true) {
			menu();
			System.out.print("메뉴 선택: ");
			int m=scan.nextInt();
			switch(m)
			{
			case 5:
				System.out.println("프로그램 종료");
				System.exit(0); //0 정상종료
			case 1: 
				System.out.print("페이지 입력: ");
				int page=scan.nextInt();
				place(page);
				break;
			case 2:
				System.out.print("상세보기: ");
				int no=scan.nextInt();
				placedetail(no);
				break;
			case 3: case 4:
				System.out.print("명소(1),주소(2) :");
				int type=scan.nextInt();
				System.out.print("검색어 입력: ");
				String fd=scan.next();
				String[] ss=find(type,fd);
				for(String s:ss)
				{
					System.out.println(s);
				}
				break;
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();

	}

}
