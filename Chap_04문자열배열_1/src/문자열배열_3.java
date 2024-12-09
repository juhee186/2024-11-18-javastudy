
import java.util.*;
import com.sist.data.ArrayData;
public class 문자열배열_3 {

	/*
	 * 클래스 => 한개에 대한 정보
	 * class music
	 * {
	 *  String tit,sin,al,sta;
	 *  int mod
	 * }
	 */
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] tit=ArrayData.title;
		String[] sin=ArrayData.singer;
		String[] al=ArrayData.album;
		String[] sta=ArrayData.state;
		int[] mod=ArrayData.modify;
		// String[][] music=new String[50][5];
		// Music[] music=new Music[50];  > 사용자 정의 데이터형
		//목록
		System.out.println("music top50 ");
		for(int i=0;i<tit.length;i++)
		{
			String s=sta[i];
			String m="";
			if(s.equals("유지")) {
				m="-";
				
			}
			else if(s.equals("상승"))
			{
				m="▲ "+mod[i];
			}
			else if(s.equals("하강"))
			{
				m="▼ "+mod[i];
			}
			System.out.println((i+1)+"."+m+" "+tit[i]+" "+ " "+sin[i]+" "+al[i]+" ");
		}
		
		System.out.println("=========================================");
		
		
//		Scanner scan=new Scanner(System.in);
//		System.out.print("카테고리 선택(곡명(1),가수명(2)) : ");
//		int menu=scan.nextInt();
//		int count=0;
//		
//		if(menu==1) //제목
//		{
//			System.out.print("제목 입력 : ");
//			String name=scan.next();
//			for(int i=0;i<tit.length;i++)
//			{
//				if(tit[i].contains(name))
//				{
//					System.out.println("노래명: "+tit[i]);
//					System.out.println("가수명: "+sin[i]);
//					System.out.println("앨범: "+al[i]);
//					System.out.println("등폭: "+(sta[i].equals("유지")?"유지":sta[i]+" "+mod[i]));
//					count++;
//					System.out.println("====================================");
//				}
//			}
//			System.out.println("총 "+count+" 건 검색");
//		}
//		else if(menu==2) //가수
//		{
//			System.out.print("가수 입력 : ");
//			String sing=scan.next();
//			for(int i=0;i<sin.length;i++)
//			{
//				if(sin[i].contains(sing))
//				{
//					System.out.println("노래명: "+tit[i]);
//					System.out.println("가수명: "+sin[i]);
//					System.out.println("앨범: "+al[i]);
//					System.out.println("등폭: "+(sta[i].equals("유지")?"유지":sta[i]+" "+mod[i]));
//					count++;
//					System.out.println("====================================");
//				}
//			}
//			System.out.println("총 "+count+" 건 검색");
//		}
		
		// 등폭이 가장 많은 노래명과 , 가수명 출력
//		int max=0;
//		for(int i=0;i<50;i++)
//		{
//			if(max<mod[i])
//				max=mod[i];
//		}
//		System.out.println("max= "+max);
//		
//		int count=0;
//		for(int i=0;i<50;i++)
//		{
//			if(max==mod[i])
//			{
//				count++;
//			}
//		}
//		
		int min=100;
		for(int i=0;i<50;i++)
		{
			if(min>mod[i] && mod[i]!=0)
				min=mod[i];
		}
		System.out.println("min= "+min);
		
		int count=0;
		for(int i=0;i<50;i++)
		{
			if(min==mod[i])
			{
				count++;
			}
		}
		System.out.println("배열 갯수 : "+count);
		//동적 배열 생성
		int[] arr=new int[count];
		
		int j=0;
		for(int i=0;i<50;i++)
		{
			if(min==mod[i])
			{
				arr[j]=i;
				j++;
			}
		}
		for(int i:arr)
		{
			System.out.println(tit[i]+ " "+sin[i]);
		}
		
		
		
		
		
		
		

	}

}
