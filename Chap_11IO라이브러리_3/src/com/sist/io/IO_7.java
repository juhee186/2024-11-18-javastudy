package com.sist.io;
import java.io.*;
import java.net.*;
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
public class IO_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strUrl=
			{"",
			"searchMainDailyBoxOffice.do",
			"searchMainRealTicket.do",
			"searchMainDailySeatTicket.do"};
		try
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("======menu======");
			System.out.println("1. 일일박스오피스");
			System.out.println("2. 실시간 예매율");
			System.out.println("3. 좌석점유율");
			System.out.println("================");
			System.out.print("메뉴선택 : ");
			int menu=scan.nextInt();
			String path="https://www.kobis.or.kr/kobis/business/main/";
			path=path+strUrl[menu];
			
			Document doc=Jsoup.connect(path).get();
			System.out.println(doc.toString());
			
//			URL url=new URL(path);
//			HttpURLConnection conn=
//					(HttpURLConnection)url.openConnection();
//			if(conn!=null)
//			{
//				BufferedReader br=
//					new BufferedReader
//						(new InputStreamReader(conn.getInputStream()));
//				while(true)
//				{
//					String msg=br.readLine();
//					if(msg==null) break;
//					
//					System.out.println(msg);
//				}
//			}
//			conn.disconnect();
		}catch (Exception ex)
		{
			ex.printStackTrace();
		}

	}

}
