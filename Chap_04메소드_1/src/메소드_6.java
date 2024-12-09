/*
 *  메소드 호출 => 매개변수
 *  1) call by value
 *  	=> 값만 전송
 *  2) call by reference ( 메모리 주소 => 주소 전송 => 동시에 변경 )
 *     -----------------
 *     주소 :  배열 / 클래스
 *     ----------------
 *      클래스 중 제외 : String (일반 데이터형)
 *  	=> 주소값 전송
 */
public class 메소드_6 {
	// call by value => 값만 전송 => 복사본
	static void swap(int a, int b)
	{
		System.out.println("swap메소드 집입..=> 2");
		System.out.println("사용자 요청값: => 3");
		System.out.println("변경전 : ");
		System.out.println("a="+a); //4
		System.out.println("b="+b); //5
		int temp=a;
		a=b;
		b=temp;
		System.out.println("변경후 : ");
		System.out.println("a="+a); //4
		System.out.println("b="+b); //5
		System.out.println("swap메소드 요청처리 완료..=> 6");
	}
	//				main=> 시작 = 종료 = 자동호출
	// 사용자 정의는 자동호출 안 된다
	//trace => 다보강 모드 => F6
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main시작=> 1");
		int a=10;
		int b=20;
		System.out.println("main 변경전:");
		System.out.println("a="+a); //4
		System.out.println("b="+b); //5
		swap(a,b);
		System.out.println("main 변경후:");
		System.out.println("a="+a); //4
		System.out.println("b="+b); //5
		System.out.println("main종료> 프로그램 종료 => 7");
	}

}
