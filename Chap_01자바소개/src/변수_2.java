// 초기값  > 데이터를 저장하는 방법
/*
 * 자바에서 사용하는 표현법
 * 
 * 1. 정수
 *   byte / short / int  > 숫자 사용 (범위만 초과하지 않는다)
 *   숫자표현
 *   - 10 > 10진법
 *   ** - 012 > 8진법
 *    날짜 / 시간
 *   > 2024-09-20 >> 9가 7보다 커서 에러발생 / 숫자앞 0 주의
 *   - 0x12 > 16진법
 *   
 *   long표현
 *   - 10L , 10l
 *   
 *   실수형
 *   - 10.5 > double
 *   - 10.5f
 *   
 *   문자형
 *   - 한 글자만 저장 가능
 *   'A' "" > 문자열  > 여러개 문자 사용가능
 *   
 *   논리형
 *   - true, false
 *   
 *   데이터 저장 방법
 *  1) 명시적 초기화
 *   int a = 10;
 *  2) 입력을 받아 초기화
 *  3) 난수발생
 *  
 *  변수 선언
 *   선언과 동시에 값을 저장
 *    -데이터형 변수명=값 (사용빈도가 많다)
 *   
 *   선언
 *    -데이터형 변수명;
 *    값 저장
 *     변수명=값
 *   
 *   *** 변수 선언만 하고 사용하면 오류가 발생한다
 * */

public class 변수_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//정수
		byte byteval=127;
		// byteval이 저장소 이름
		
		short shortval=32767;
		// shortval이 저장소 이름 
		//shortval=30000; 저장소 이름을 수정할 수 있음
		
		int intval=21400000;
		// int = 4바이트 메모리 공간을 만들어라 명령
		// 21400000을 저장해라
		// 이 메모리를 사용한다면 intval 이용
		// 수정가능
		
		long longval=3000000000L; //숫자 뒤 L 붙여야 long 표현임
		// 8바이트 메모리 공간을 만들어라
		// 300000000 저장 명령
		// 사용시 longval 사용
		
		// 변수
		// 1)저장
		// 2)값읽기
		// 3)수정
		
		//수정
		longval=100L;
		//값읽기
		System.out.println(longval);
		//큰데이형에는 작은 값 저장 가능
		long a=100; // 100L
		System.out.println(a);
		
		int b='A';
		System.out.println(b);
		int c='a';
		System.out.println(c);
		
		char d=65;
		System.out.println(d);
		// 'A'=65 , 'a'=97 , '0'=48
		
		//System.out.println((int)'홍');
		
		boolean boo=false;
		System.out.println(boo); //조건문 > 제어문
		
		float f=10.5f;
		System.out.println(f);
		
		double h=10.5f;
		System.out.println(h);
		// 왼쪽에 있는 데이터형이 크거나 같아야 저장이 가능함
		// 데이터는 선언된 데이터형을 따라간다
		// byte = byte
		// short = byte , short
		// int = byte, short, char ,int
		
		// long = byte, short, char ,int , long
		// float = byte, short, char ,int , long , float
		// double = byte, short, char ,int , long , float , double
		
		// 자동 형변환
		
		// (int)10.5 > 10
		// (double) 10 > 10.0
		// (int)'A' > 65
		// (char)65 > 'A'
		// (double)'A' > 65.0
		// (float)'A' > 65.0F
		
		// 10/3 =3  /   10/(double)3 = 3.33333
		
		System.out.println(10/3);
		System.out.println(10/(double)3);
		
		// int** / long / double** / char / boolean
	
		
	}

}
