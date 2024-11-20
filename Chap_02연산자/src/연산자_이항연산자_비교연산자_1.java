/*
 *  비교연산자 > 숫자나 논리만 비교
 *          > ""=="" > equals()
 *  
 *      == : 같다
 *      !  : 같지않다
 *      ===================== 오라클 : =, <> > javaScript : ===,!==
 *      ---왼쪽기준
 *      <  : 작다
 *      >  : 크다
 *      <= : 작거나 같다
 *      >= : 크거나 같다     
 *      
 *      ==> 결과값은 true/false   >> 조건문
 *      
 *      
 */
public class 연산자_이항연산자_비교연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(6==7);
		System.out.println(6!=7);
		System.out.println(6<=7);
		System.out.println(6>7);
		System.out.println(6<=6);
		System.out.println(6>=6);
		
		
		char c='A';
		int a=65;
		System.out.println(a==c);
		
		// 문자형 수사 '0', '1' ==> '1'-'0'
		c='0';
		a=0;
		System.out.println((int)'A');
		System.out.println((int)'0');
		System.out.println(c==a);
		System.out.println((int)'+');
		System.out.println((int)'*');
		System.out.println((int)'/');
		System.out.println((int)'-');
		
		boolean bCheck1=false;
		boolean bCheck2=true;
		
		System.out.println(bCheck1==bCheck2);
		System.out.println(bCheck1!=bCheck2);
		
		String s1=new String("hello");
		String s2=new String("hello");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		int x=10;
		int y=9;
		System.out.println(x==y++);  // y비교후 증가 
		System.out.println(x==++y);  // 증가후 비교
		
		// 비교연산자  >>> 조건문 , 반복문
		// ========로그인, 아이디 중복, 우편번호 검색, 검색처리
		
		
		
		


	}

}
