/*
 *    &&       ||
 *   (조건) && (조건)    >> 범위, 기간 안에 있는 경우
 *   -----    -----           a>1 && a<100          >>>>>직렬연산자
 *    ㅣ        ㅣ 
 *    -----------
 *         ㅣ
 *        결과값 true . false
 *        
 *   (조건) ㅣㅣ (조건)    >> 범위 밖에 있는 경우
 *   -----    -----           a<1 ㅣㅣ a>100         >>>>>병렬연산자
 *    ㅣ        ㅣ 
 *    -----------
 *         ㅣ
 *        결과값 true . false
 *        
 *        
 *    조건  &&  조건
 *    -----------------
 *    true     true            >>> true
 *    -----------------
 *    true     false              false 
 *    ------------------
 *    false    true               false
 *    ------------------
 *    false    false              false
 *    
 *    조건  ||   조건
 *    -----------------
 *    true     true            >>> true
 *    -----------------
 *    true     false               true
 *    ------------------
 *    false    true                true
 *    ------------------
 *    false    false              false
 *    
 *    
 *    int x=10;
 *    int y=9;
 *    
 *    x<y  $$  x==++y        >> false
 *           ----------- 앞의 조건이 거짓일 때 뒤의 연산을 처리 하지않는다 : 효율적인 연산
 *           x=10 / y=9
 *    
 *    
 *    int x=10;
 *    int y=9;
 *    
 *    x<y  ㅣㅣ  x==++y        >> true
 *           ------------ 연산 0
 *           x=10 / y=10
 *    
 *    산술연산자 38페이지
 *    증감연산자 40페이지-43페이지
 *    비교연산자 44페이지
 *    논리연산자 45페이지-47페이지
 *    
 *    
 *    
 *     
 *           
 */
public class 연산자_이항연산자_논리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		int y=9;
		
		/*boolean bCheck= x<y && x==++y;
		System.out.println(bCheck);
		System.out.println(x);
		System.out.println(y);
		
		boolean cCheck= x>y && x==++y;
		System.out.println(bCheck);
		System.out.println(x);
		System.out.println(y);
		*/
		
		boolean bCheck= x<y || x==++y;
		System.out.println(bCheck);
		System.out.println(x);
		System.out.println(y);
		// && > 예약일, 체크인
		// || > 유효성 검사
		
		
		
		
		
		

	}

}
