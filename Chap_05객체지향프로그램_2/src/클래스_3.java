class member1
{
	int no=100; // 멤버변수
	int id=300;
	member1(){
		System.out.println(this);
		int no=200; //지역변수
		System.out.println(no+this.no);
		//1. 지역변수 우선 순위
		// 지역변수,매개변수 > 멤버변수
		// this => 클래스 자신이 가지고 있는 멤버(변수,메소드) 가지고오기
		/*
		 * this => 자신의 객체
		 * ---- 지역변수와 매개변수 == 멤버변수가 동일한 이름을 가지고
		 * ---- 모든 클래스는 this를 가지고 있다
		 * ---- static 변수
		 * 
		 */
		System.out.println(id); //this.id 입력이 맞는데 생략가능(충돌 안 될때)
	}
}
/*
 * 	int a=10;
 * 	static int b=20;
 * 
 * 	static void display() => 공통으로 사용하는 기능
 * 	{
 * 		b만 사용가능
 * 		A a= new A();
 * 		a.b
 * 	}
 * 	void display2()
 * 	{
 * 		a,b 사용 가능
 * 	}
 */
public class 클래스_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		member1 m=new member1();
		System.out.println(m); //static에서는 this 사용할 수 없다 / this는 인스턴스에서만 사용가능
		

	}

}
