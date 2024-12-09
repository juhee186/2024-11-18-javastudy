/*
 *  사용자로부터 단을 입력 받아 해당 구구단을 출력하라
 *  ---------------		--------
 *     매개변수			  리턴형  ==> 자체 void
 *     					  리턴형  ==> String
 */
import java.util.Scanner;
public class 메소드_4 {
//	static void gugu(int dan)
//	{
//		for(int i=1;i<=9;i++)
//		{
//			System.out.println(dan+"*"+i+"="+(dan*i));
//		}
//	}
	static String gugu(int dan)
	{
		String re="";
		for(int i=1;i<=9;i++)
		{
			re+=dan+"*"+i+"="+(dan*i)+"\n";
		}
		return re;
	}
	static void process()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("단 입력 : ");
		int dan=scan.nextInt();
		
		String gu=gugu(dan);
		//System.out.println(dan+"*"+i+"="+(dan*i));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();

	}

}
