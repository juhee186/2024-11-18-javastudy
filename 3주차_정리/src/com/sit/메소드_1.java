package com.sit;
/*
 *  메소드 형식
 *  
 *  static 리턴형 메소드명(매개변수) => 선언부
 *  {
 *  	=> 구현부 => 메모리에 저장
 *  }
 *  static 리턴형 메소드명(매개변수); => 메모리에 저장 안된다
 *  	=> 추상 메소드 : 설계단
 */
import java.util.Scanner;
import java.io.*;
public class 메소드_1 {
		// 화면출력 => 결과값이 없기 때문에 void
	static String moviedata="";
	static // 실행시에 자동인식
	{
		try
		{
			FileReader fr=new FileReader("c:\\javadev\\movie.txt");
			int i=0;
			StringBuffer sb=new StringBuffer();
			while((i=fr.read())!=-1)
			{
				sb.append((char) i);
				
			}
			moviedata=sb.toString();
			fr.close();
		}catch(Exception ex)
		{
			
		}
	}
	static void menu()
	{
		System.out.println("======== menu=========");
		System.out.println("1. 영화 목록");
		System.out.println("2. 영화 상세");
		System.out.println("3. 영화 검색(영화명)");
		System.out.println("4. 영화 검색(출연진)");
		System.out.println("5. 종료");
		System.out.println("======================");
	}
	static void movieList(int page)
	{
		String[] movie=moviedata.split("\n");
		int i=0;
		int j=0;
		final int rowsize=20;
		int pagecnt=(page*rowsize)-rowsize;
		for(String s:movie)
		{
			// System.out.println(s);
			if(j<20 && i>=pagecnt)
			{
				String[] md=s.split("\\|");
				System.out.println(md[0]+"."+md[1]);
				j++;
			}
			i++;
		}
	}
	static void moviedetail(int movieno)
	{
		String[] movie=moviedata.split("\n");
		for(String s:movie)
		{
			String[] info=s.split("\\|");
			if(info[0].equals(String.valueOf(movieno)))
			{
				System.out.println("영화명: "+info[1]);
				System.out.println("장르: "+info[2]);
				System.out.println("출연: "+info[4]);
				System.out.println("개봉일: "+info[5]);
				System.out.println("등급: "+info[6]);
				System.out.println("감독: "+info[7]);
				break;
			}
			
		}
	}
	static void find(String mn)
	{
		String[] movie=moviedata.split("\n");
		for(String s:movie)
		{
			String[] info=s.split("\\|");
			if(info[1].contains(mn))
			{
				System.out.println(info[1]+"("+info[4]+")");
			}
		}
	}
	static void find2(String ac)
	{
		String[] movie=moviedata.split("\n");
		for(String s:movie)
		{
			String[] info=s.split("\\|");
			if(info[4].contains(ac))
			{
				System.out.println(info[1]+"("+info[4]+")");
			}
		}
	}
	// 조립 ==> 다른 클래스에서 연결해서 사용 가능
	// 다른 클래스 연결해서 사용 / 재사용
	static void process()
	{
		//System.out.println(moviedata);
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			menu();
			System.out.print("메뉴 선택 : ");
			int m=scan.nextInt();
			if(m==5)
			{
				System.out.println("프로그램 종료");
				break;
			}
			else if(m==1)
			{
				System.out.print("페이지 입력: ");
				int page=scan.nextInt();
				movieList(page);
			}
			else if(m==2)
			{
				System.out.print("영화선택: ");
				int no=scan.nextInt();
				moviedetail(no);
			}
			else if(m==3)
			{
				System.out.print("영화명 입력: ");
				String mn=scan.next();
				find(mn);
			}
			else if(m==4)
			{
				System.out.print("출연진 입력: ");
				String ac=scan.next();
				find2(ac);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		process();  //메인에서 소스 코딩을 사용하지 않는다
		
	}

}
