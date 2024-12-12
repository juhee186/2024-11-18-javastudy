class B
{
	int a;
	int b;
	
}
public class 객체지향_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=a; //주소가 아닌 값을 이용
		B aa=new B();
		aa.a=100;
		aa.b=200;
		
		/*
		 *  사용자 요청 => 요청 값 받는다 ==> 요청처리 ==> 처리완료 ===> 결과값을 받아 브라우저로 보낸다
		 *  		
		 */
		
		B bb=aa; //별칭 > 같은 주소를 가지고 있으면 같은 주소를 제어
		System.out.println(aa);
		System.out.println(bb);
		
		System.out.println(bb.a);
		System.out.println(bb.b);
		
		bb.a=1000;
		bb.b=2000;
		// 주소참조해서 제어 => call by reference
		// 클래스나 배열 => 주소를 넘겨주면 같은 메모리를 제어
		// 클래스에서 제외 => String => 일반 변수 취급
		System.out.println(aa.a);
		System.out.println(aa.b);
		
		String s1="hello";
		String s2=s1;
		System.out.println(s2);
		s2="java";
		System.out.println(s1);
		
		// 같은 주소를 제어 / 다른 메모리 생성 => new / clone

	}

}
