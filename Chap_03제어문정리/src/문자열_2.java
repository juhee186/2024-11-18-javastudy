//equals
//contains : 포함된 문자열을 가져온다  >>웹에서 데이터 읽기 > 크롤링
// Jsoup  > 크롤링 라이브러리
// >> 데이터 필요 >> 데이터 읽어오기  >> 자바 기능 (메소드)..
//startsWith()
//endsWith()  

import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 문자열_2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("검색어 입력:");
		String fd=scan.next();
		int k=1;
		for(int i=1;i<=4;i++)
		{
			Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20241127&hh=11&rtm=Y&pg="+i).get();
			//곡명
			Elements title=doc.select("table.list-wrap a.title");
			for(int j=0;j<title.size();j++)
			{	// 데이터가 많이 있어야 프로그램을 만들수있다
				//if(title.get(j).text().Contains(fd)) // 포함된 문자  오라클: %검색어%
				//if(title.get(j).text().startsWith(fd)) // 시작문자  오라클: 검색어%
				if(title.get(j).text().endsWith(fd)) // 끝 검색어     오라클: %검색어
				{
				System.out.println((k)+"."+title.get(j).text());
				//Thread.sleep(2000); // 검색되는 시간 지정
				k++;
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
