
// 국어 영어 수학 > 입력  .. 총점/평균/학점

import java.util.Scanner;
/*
 *  1. 변수값 채우기 (초기화) > 입력을 받는다
 *  2. 처리  > 기능
 *  3. 결과값
 *  
 */
public class 자바제어문_단일조건문5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("국어 입력:");
		int kor=scan.nextInt();
		
		System.out.print("영어 입력:");
		int eng=scan.nextInt();
		
		System.out.print("수학 입력:");
		int math=scan.nextInt();
		
		int tot=kor+eng+math;
		double avg=tot/3.0;
		
		System.out.println("결과");
		System.out.println("국어:"+kor);
		System.out.println("영어:"+eng);
		System.out.println("수학:"+math);
		System.out.println("총점:"+tot);
		System.out.printf("평균:%.2f\n",avg);
		// \n : 다음줄 출력 \t : 일정간격 \\ : 경로  \" : "출력
		
		char score='A';
		int temp=(tot/3)/10;
		/*if(temp>=9 && temp<=10)
			score='A';
		if(temp>=8 && temp<9)
			score='B';
		if(temp>=7 && temp<8)
			score='C';
		if(temp>=6 && temp<7)
			score='D';
		if(temp>6)
			score='F';
		System.out.println("학점:"+score);*/
		
		if(temp==10 || temp==9)
			score='A';
		if(temp==8)
			score='B';
		if(temp==7)
			score='C';
		if(temp==6)
			score='D';
		if(temp<6)
			score='F';
		System.out.println("학점:"+score);
		
		
		
		
		
	}

}
