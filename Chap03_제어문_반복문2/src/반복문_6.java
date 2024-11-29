/*
 * 
 *                |컴포넌트 : 클래스   =>> 재사용의 장점이 있음 > 기업용
 *    ---------------------------
 *    |                         |
 *  데이터관리 -> 데이터가공 -> 가공된 데이터 출력
 *  ======    =========  ==============요청값 출력
 *   데이터를 묶어 사용    |
 *   ---------     요청에 맞게 가공
 *    1. 배열        ==========
 *    2. 클래스          | 연산자 / 제어문
 *    3. 파일              ====명령문===
 *    4. RDBMS (오라클)          |묶어 사용 : 메소드
 *    
 *    데이터베이스
 *    -------- 데이터를 모아서 관리하는 곳
 *    | 변수
 *    | char > string
 *    
 *    while > 1차
 *    동작순서 / 형식 / 사용처
 *    형식)
 *    	초기식-----------1 : 1번만 사용
 *    	while(조건식)----2 :
 *    	{
 *    		실행문장------3
 *    		증감식-------4  : 2로 이동
 *                           -------> 참일 때 3으로 이동
 *                           -------> 거짓일 때 종료
 *    	}
 *    
 */

public class 반복문_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1~100사이 난수 발생 >5개
		// 최대값, 최소값
	/*	int a=(int)(Math.random()*100)+1;
		int b=(int)(Math.random()*100)+1;
		int c=(int)(Math.random()*100)+1;
		int d=(int)(Math.random()*100)+1;
		int e=(int)(Math.random()*100)+1;
		
		int max=a;
		int min=a;

		if(max<a)
			max=a;
		if(max<b)
			max=b;
		if(max<c)
			max=c;
		if(max<d)
			max=d;
		if(max<e)
			max=e;
		
		if(min>a)
			min=a;
		if(min>b)
			min=b;
		if(min>c)
			min=c;
		if(min>d)
			min=d;
		if(min>e)
			min=e;
	
		System.out.printf("%d,%d,%d,%d,%d\n",a,b,c,d,e);
		System.out.println("최대값:"+max);
		System.out.println("최소값:"+min); */
		
		int i=1;
		int max=1;
		int min=100;
		while(i<=10) // 수정이 편리하다 > 유지보수가 편하다
		{
			int a=(int)(Math.random()*100)+1;
			System.out.print(a+" ");
			if(max<a)
				max=a;
			if(min>a)
				min=a;
			
			i++;
		}
		System.out.println();
		System.out.println("최대값:"+max);
		System.out.println("최소값:"+min);
		// 반복문은 중복코딩을 제거할 경우 사용
		
		
		
		
		
		
		
		
		
		
		

	}

}
