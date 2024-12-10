/*
 * 	멤버변수의 초기화
 * 	= 생성자 => 인스턴스 변수, static 변수의 초기화
 * 	 => 반드시 호출
 * 	-----------------------------------------------------
 * 	= 인스턴스 블럭 => 인스턴스 변수, static 변수의 초기화
 *  = static 블럭 => static 변수의 초기화만 가능
 *  -----------------------------------------호출없이 자동처리
 *  --------------> 멤버의 초기화 담당, 시작과 동시에 처리하는 기능
 *  				구현이 가능, 상속은 예외
 *  
 *  								| static 변수 초기화
 *  => 기본 초기화 => 명시적 초기화 => static 블럭 => 인스턴스 블럭 => 생성자
 *  				 	  						 |			|
 *   											 ------------
 *   						 : 동시 사용할 수 없다 어떻게 초기화할 것인지 선택해야함
 *   			=> 명시적 초기화 가능한지 먼저 확인
 *   			=> 불가능할 경우 생성자, static 블럭 이용
 *   			  ----------
 *   				구현
 *   			=> int[] arr=new int[5];
 *   			  난수값 5개 초기화(구현)
 */
class movie2
{
	int movieno=1;
	static int id=1;
	//인스턴스 블럭{}
	{
		System.out.println("인스턴스 블럭 진입 : ");
		movieno=2;
		System.out.println("변수 저장 완료");	
	}
	movie2()
	{
		System.out.println("생성자 호출");
		movieno=3;
		System.out.println("생성자 저장완료");
	}
	
	static
	{
		System.out.println("static블럭 진입");
		id=100;
		System.out.println("저장완료");
	}
}
public class 클래스_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		movie2 mo=new movie2();
		System.out.println(mo.movieno);
		System.out.println(movie2.id); 
		//static 메모리 할당이 필요없다 => 생성자 호출이 필요없다
		
		
	}

}
