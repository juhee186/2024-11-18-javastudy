// 입력 > 사칙연산
import java.util.Scanner;
public class 자바선택문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 클래스 저장
		Scanner scan=new Scanner(System.in);
		// 지역변수 (stack) > 메모리 , new 생성(heap) 개발용
		// 메소드 : 메소드area...static
		System.out.print("첫 번째 정수 입력:");
		int num1=scan.nextInt();
		// 키보드 이용해서 정수값 받기
		System.out.print("두 번째 정수 입력:");
		int num2=scan.nextInt();// 명령 > 정수 1개를 가져와라
		// 정수 : nextInt();  실수 : nextDouble(); 문자열 :next(); 문자한개 :charAt();
		System.out.print("연산자 입력(+,-,*,/):");

		switch(scan.next())// 문자열
		{
		case "+": // "" > string
			System.out.println(num1+"+"+num2+"="+(num1+num2));
			break;
		case "-": // "" > string
			System.out.println(num1+"-"+num2+"="+(num1-num2));
			break;
		case "*": // "" > string
			System.out.println(num1+"*"+num2+"="+(num1*num2));
			break;	
		case "/": // "" > string
			if(num2==0)
				System.out.println("0으로 나눌수 없다");
			else
				System.out.println(num1+"/"+num2+"="+num1/num2);
			break;
			/*
			 * switch(num2)
			 * {
			 * case 0:
			 * System.out.println("0으로 나눌수 없다");
			 * default:
			 * System.out.println(num1+"/"+num2+"="+num1/num2);
			 * }
			 */
			default:
				System.out.println("잘못된 연산자 입력");
		}
		
		// 다중 조건문과 유사 >> 선택문
		/*
		 *  if(조건문)
		 *  { if(){
		 *   }
		 *  else{
		 *   }
		 *  }
		 *  
		 *  if(조건문)
		 *  { switch()
		 *   {
		 *   }
		 *  }
		 *  
		 *  switch()
		 *  { case 값
		 *   switch()
		 *   {
		 *   }
		 *  }
		 *   switch()
		 *  { case 값
		 *   if()
		 *   {
		 *   }
		 *   else
		 *   {
		 *   }
		 *  }
		 */
		// 제어문은 1개만 사용하는 것이 아닌 여러 개의 다른 제어문을 사용할 수 있다
		/*
		 *  주로사용
		 *  if > 단독으로 사용
		 *  for > if 주로 사용 : 반복문
		 */
		
		
		

	}

}
