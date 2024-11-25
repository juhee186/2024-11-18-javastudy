/*
 * 자바에서 지원하는 제어문
 * = 조건문* : 요청에 맞는 문장만 실행  >> 건너뛸수도 있다
 *           >> 오류 방지
 *           ============== if 으로 처리하지 못하는 경우 : 예외처리(8장) 
 *           >> 사전에 방지 > if(조건) > 
 *            
 *   > 단일조건문
 *      형식)   > 부정연산자(!) / 비교연산자 / 논리연산자만 사용가능
 *        if(조건문 >> true / false ) 
 *        {
 *          조건문이 true>> 처리하는 문장
 *        }
 *         false >> 건너뛴다
 *         >>> 독립적으로 수행 >> if 문을 여러개 사용하면 속도가 느려진다
 *         int a=1
 *         if(a==1)    >> 종료
 *         if(a==2)
 *           .
 *           .
 *           .
 *           >>>>> if 문장마다 다른 문장으로 되어있어 모든 if의 조건을 검색한다
 *         ==> 사용처 : 아이디 중복체크 , 검색 , 상세보기 , 예약내용
 *       (55페이지)
 *         중첩 if문 
 *         if(조건)  >> 아이디가 같고
 *         {
 *          if()   >> 비밀번호가 같다면
 *           {
 *           }
 *         }
 *            ====> if( 아이디 같고 && 비밀번호 같다면 )
 *   > 선택조건문 : 나눠서 처리
 *             - true  >> 처리 
 *             - false >> 처리
 *          if(조건)
 *          {
 *            조건이 true  일때 
 *           }
 *          else   
 *          {
 *            조건이 false 일때
 *          }
 *            >> 두 개가 나눠지는 경우
 *            1. 로그인 된 경우 -> 메인화면 이동  =>if
 *                    안 된 경우 -> 로그인화면 이동(back, 회원가입창)  =>else
 *            2. 찜하기 / 좋아요
 *            3. 대-소문자 구분 / 3의배수 / 짝-홀수 / 음-약수        
 *   > 다중조건문
 * = 선택문 - 게임 - 네트워크
 * = 반복문*
 *   > do~while : 무조건 1번이상 수행
 *   > while : 반복횟수 없음 - 데이터베이스 / 파일읽기
 *   > for* : 횟수 지정  >> 코딩테스트 / 정보처리실기 쉬어짐
 * = 반복제어문
 *   > break : 반복 종료
 *   > continue : 특정부분을 제외하고 다시 반복 시작
 * 
 * 1. 중첩 조건문
 *    컴퓨터와 사용자의 가위,바위,보 게임
 *                 ========== 가정  
 *                 가위 (0) 바위 (1) 보 (2)
 *                  
 *    경우의 수 >if
 *    컴퓨터 가위(0)
 *        --> 사용자 가위 (0)
 *                 바위 (1)
 *                 보  (2) 
 *    컴퓨터 바위(1)
 *        --> 사용자 가위 (0)
 *                 바위 (1)
 *                 보  (2) 
 *    컴퓨터 보(2)
 *        --> 사용자 가위 (0)
 *                 바위 (1)
 *                 보  (2)                              
 *                       
 */
// 사용자 입력
import java.util.Scanner;  // 이미 만들어져있는 클래스( 라이브러리) 를 가져온다 
// 클래스 가지고 올 때 import 사용  
//  클래스 전체를 사용하고 싶다면 * 사용 
public class 제어문_조건문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);	// 시스템.인 > 키보드 입력값   C언어 :scanf()
		System.out.print("가위(0),바위(1),보(2):");
		int use=scan.nextInt();
		int com=(int)(Math.random()*3);
		System.out.print("컴퓨터:");
		if(com==0 && use==0);
		if(com==0 && use==1);
		if(com==0 && use==2);
		System.out.println();
			
		/*if(com==0)
			System.out.println("가위");
		if(com==1)
			System.out.println("바위");
		if(com==2)
			System.out.println("보");
		System.out.print("user:");
		if(use==0)
			System.out.println("가위");
		if(use==1)
			System.out.println("바위");
		if(use==2)
			System.out.println("보");
		System.out.println("결과");
		if(com==0)
		{
			if(use==0)
				System.out.println("비김");
			if(use==1)
				System.out.println("user 승");
			if(use==2)
				System.out.println("com 승");
		}
		if(com==1)
		{
			if(use==0)
				System.out.println("com 승");
			if(use==1)
				System.out.println("비김");
			if(use==2)
				System.out.println("user 승");
		}
		if(com==2)
		{
			if(use==0)
				System.out.println("user 승");
			if(use==1)
				System.out.println("com 승");
			if(use==2)
				System.out.println("비김");
		}*/
		    	
		
		

	}

}
