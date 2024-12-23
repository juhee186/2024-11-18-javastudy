package com.sist.lib;
// finalize() => 소멸자 함수 => 객체가 메모리에서 해제 => 자동호출
class sawon
{
	private int sabun;
	private String name;
	
	public sawon()
	{
		sabun=1;
		name="홍길동";
		System.out.println("초기화완료");
	}
	public void print()
	{
		System.out.println(sabun);
		System.out.println(name);
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("사원 객체 소멸: 힙에서 사라진다");
	}
	
}
public class 라이브러리_Object_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//객체의 생명주기 (생성-활용-해제)
		sawon sa=new sawon(); //객체생성
		sa.print(); // 객체활용
		sa=null; // 주소값 지우기
		//직접회수
		System.gc(); // 가비지컬렉션 호출 => null, 사용하지 않는 데이터 회수
		
//		Object o=10; => autobox => 일반데이터형과 동일 취급
//		int i=(int)o; => unbox

	}

}
