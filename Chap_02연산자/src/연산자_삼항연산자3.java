//  > 점수입력 > 학점 A~D F
/*
 *  A= score >=90 && score<=100
 *  B= score >=80 && score<90
 *             70          80
 *             60          70
 *      score<60 F        
 */
import java.util.Scanner;
public class 연산자_삼항연산자3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("점수입력(0~100):");
		int score=scan.nextInt();
		//nextDouble : 실수 넥스트불린 : 참트루 넥스트 : 문자열
		// || > 범위에 없을 때 / 다시입력요구     && > 범위에 있을때 / 정상수행
		/*
		 *  알파벳 > 대문자 조건
		 *    c>='A' && c<='Z'   : A~Z 사이에 있냐
		 *         소문자 조건
		 *    c>='a' && c<='z'   : a~z 사이에 있냐     
		 *  알파벳
		 *    c>='A' && c<='Z' || c>='a' && c<='z'
		 */
		System.out.println(score<0 || score>100?"비정상":"정상");
		System.out.println("===== 결과값 =====");
		System.out.print(score>=90 && score<=100?"A학점":"");
		System.out.print(score>=80 && score<90?"B학점":"");
		System.out.print(score>=70 && score<80?"C학점":"");
		System.out.print(score>=60 && score<70?"D학점":"");
		System.out.print(score<60?"F학점":"");
		
		
		
	}

}
