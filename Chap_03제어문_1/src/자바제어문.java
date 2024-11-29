/*
 *  자바에서 지원하는 제어문(54페이지 - 83페이지)
 *  ** 변수 / 연산자 / 제어문 >> 기본
 *  ** 메소드 /  객체지향 프로그램
 *  ** 라이브러리 >> 조립
 *  
 *  제어문 >> 연산자가 응용
 *  ----- 배열
 *         --- 메소드
 *             ----- 클래스
 *  1. 제어문
 *     - 조건 : 사용자 요청에 맞게 처리 >> 필요시 문장 수행 / 불필요시 건너뛴다
 *             ================
 *             검색, 상세보기, 로그인, 아이디중복체크
 *        = 단일조건문 : 독립문장으로 실행 (54페이지)
 *          형식)
 *             IF(조건)  >> 조건문에 사용되는 연산자 : 부정(!), 비교(==,!=),논리(&&, ||) >> 값 : true, false
 *             { 조건문이 true일 때 실행
 *             }
 *               >>>>>>>> 조건이 true > 실행 / false > 미실행
 *            (55페이지) 중첩 if문   
 *            if(조건)  >> 조건문이 모두 true일 때 실행
 *            { 
 *             if(조건)
 *             { 조건문이 true일 때 실행
 *             }
 *            }
 *            중첩 조건문 대신 사용 >> && (소스를 줄일 수 있다)
 *            >> 특별한 경우에 사용
 *              --------- 메뉴 조절
 *                 if(로그인이 되어 있다면)
 *                 { if(사용자라면)
 *                   { 마이페이지
 *                   }
 *                   if(관리자자라면)
 *                   { 관리자메뉴
 *                   }
 *                 }  
 *            >>> if (조건 && 조건)
 *            {
 *            }
 *        = 선택조건문 : true, false 을 나눠서 따로 처리 (56페이지)
 *             >>> 가장 많이 사용되는 조건문
 *             >>> 웹 : 모든 내용이 브라우저롤 전송
 *                     ========true, false
 *                     아이디 중복체크, 검색, 에러발생-미발생
 *          형식)
 *           if(조건)
 *           { 조건문이 true일 때 실행
 *           }
 *           else
 *           { 조건문이 false일 때 실행
 *           }
 *        = 다중조건문 : 메뉴처리, 키보드 처리, 별점  
 *          *** 여러개의 조건문을 사용하지만 한 개의 조건만 수행 
 *          형식)
 *           if(조건)
 *           { 조건문이 true일 때 실행  ==> 종료
 *             조건문이 false일 때 ==> 밑의 조건으로 이동
 *           }
 *           else if(조건)
 *           { 조건문이 true일 때 실행  ==> 종료
 *             조건문이 false일 때 ==> 밑의 조건으로 이동
 *           }
 *           else if(조건)
 *           { 조건문이 true일 때 실행  ==> 종료
 *             조건문이 false일 때 ==> 밑의 조건으로 이동
 *           } 
 *           else (조건)
 *           { 생략가능
 *             조건문이 모두 false일 때 무조건 수행
 *           }
 *           
 *           연산자 입력
 *           if(o=='+')
 *           {
 *           }
 *           else if(o=='-')
 *           {
 *           }
 *           else if(o=='*')
 *           {
 *           }
 *           else if(o=='/')
 *           {
 *           }
 *           else 
 *           { 없는 연산자입니다 >> 잘못된 입력
 *           }
 *     - 선택문
 *     - 반복문
 *     - 반복제어문           
 *             
 */
// 다중조건문
// 사용자로부터 정수 2개 연산자 (+ - * /)    -->중첩조건문 : /값 0 여부확인
// 프로그램은 비정산종료가 없는 프로그램 >> 사전에 오류를 방지
// 웹 >> 비정상 종료를 방지 >> 에러가 발생 >> 건너뛴다 (다음문장으로 이동)
// --> 8장 예외처리
import java.util.Scanner;
// 자바에서 지원하는 라이브러리 클래스를 가지고 올때 사용 (import)
public class 자바제어문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 키보드 입력을 받아 변수 저장 > Scanner
		Scanner scan=new Scanner(System.in);
		// 자방세서 클래스를 저장할 때 > new 를 동적 메모리 할당
		// malloc(클래스의 크기) > 메모리를 만들어준다
		// -------    승격 : new
		// free() > delete : 자바에서 자동메모리 회수 : 가비지컬렉션(GC)
		System.out.print("첫번째 정수입력:");
		int num1=scan.nextInt();
		
		System.out.print("두번째 정수입력:");
		int num2=scan.nextInt();
		
		System.out.print("연산자 입력(+,-,*,/):");
		char op=scan.next().charAt(0);
		// 맨처음 문자를 읽는 경우 사용 : charAt()
		// 문자열은 0번부터 시작
		System.out.println("num1="+num1);
		System.out.println("num2="+num2);
		System.out.println("op="+op);
		
		// 연산처리 > 4개의 경우수 > 한 번만 실행 >> 다중조건문
		if(op=='+')
			System.out.println(num1+"+"+num2+"="+(num1+num2));
		// 종료
		else if(op=='-')
			System.out.println(num1+"-"+num2+"="+(num1-num2));
		else if(op=='*')
			System.out.println(num1+"*"+num2+"="+(num1*num2));
		else if(op=='/')
		{
			if(num2==0)
			System.out.println("0으로 나눌 수 없습니다.");
			else
				System.out.println(num1+"/"+num2+"="+(num1/num2));	
		}
		else
			System.out.println("사용하지 않는 연산자를 입력했습니다");
		
		
		

	}

}
