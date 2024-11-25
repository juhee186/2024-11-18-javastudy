/*
 *   중첩조건문
 *     3개의 점수를 받아 총점 , 평균 , 학점
 *         => 97이상 A+   94이상 A0  90  A-
 *            87이상 B+   84이상 B0  80  B-
 *            77이상 C+   74이상 C0  70  C-
 *         
 */
import java.util.Scanner;

public class 제어문_조건문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("국어 점수 입력:");
		int kor=scan.nextInt();
		
		System.out.print("영어 점수 입력:");
		int eng=scan.nextInt();
		
		System.out.print("수학 점수 입력:");
		int math=scan.nextInt();
		
		//총점
		int tot=kor+eng+math;
		//평균
		double avg=tot/3.0;
		// 학점
		char score='A',opt='+';  //초기
		//  -->  A~F    --> + 0 -
		int avg2=(int)avg;
		// avg2는 0~100 사이값
		if(avg2>=90 && avg<=100)
		{
			score='A';
			if(avg2>=97 && avg2<=100)
				opt='+';
			if(avg2>=94 && avg2<97)
				opt='0';
			if(avg2<94)
				opt='-';	
		}
		if(avg2>=80 && avg<90)
		{
			score='B';
			if(avg2>=87 && avg2<90)
				opt='+';
			if(avg2>=84 && avg2<87)
				opt='0';
			if(avg2<84)
				opt='-';	
		}
		
		System.out.println("==== 결 과 ====");
		System.out.println("국어점수:"+kor);
		System.out.println("영어점수:"+eng);
		System.out.println("수학점수:"+math);
		System.out.println("총점:"+tot);
		System.out.printf("평균:%.2f\n",+avg);
		System.out.println("학점:"+score+""+opt);
		
		

	}

}
