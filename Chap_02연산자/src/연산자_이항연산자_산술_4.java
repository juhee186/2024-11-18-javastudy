/*
 *    키보드 입력
 *     1) BufferedReader  > java.io
 *        > 예외처리
 *     2) Scanner         > java.util
 *         import java.util.Scanner;
 *           > ** import >>>>>> 다른 폴더에 있는 경우 클래스를 읽어온다        
 *           >include / using / from ...
 *      
 */

import java.util.Scanner;

public class 연산자_이항연산자_산술_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 클래스를 메모리에 저장  > new
		Scanner scan=new Scanner(System.in);
		System.out.print("국어 입력:");
		int kor=scan.nextInt();
		System.out.println(kor);
		
		Scanner scan2=new Scanner(System.in);
		System.out.print("영어 입력:");
		int eng=scan2.nextInt();
		System.out.println(eng);
		
		Scanner scan3=new Scanner(System.in);
		System.out.print("수학 입력:");
		int math=scan3.nextInt();
		System.out.println(math);
		
		
		
	
	}

}
