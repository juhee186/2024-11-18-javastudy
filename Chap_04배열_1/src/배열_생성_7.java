/*
 *   연산자 > 결과값 > 응용 (제어문)
 *   제어문 > 응용 (배열)
 *   배열
 *   
 *   
 *   1) 배열 생성 > 관련된 데이터 (기능이 동일한 역할)
 *   2) 배열 초기화 > for을 주로 이용
 *   3) 배열 출력 > index를 이용/ for-each (데이터 읽기)
 *   			/Arrays.toString()
 *   	제어 : 값을 변경 => index 이용
 *   		  for-each => 화면 출력용
 *   		  =========front
 *   		  사용자 요청=======서버	
 *   						  |			   결과값
 *   						 요청에 대한 처리 ======== 브라우저
 *   							|언어:자바				|for-each
 *   	for-each
 *   		int arr={10,20,30,40,50}
 *   		가급적이면 동일한 데이터형 사용 권장
 *   				----------
 *   				큰 데이터형은 가능
 *   		for(int i:arr)
 *   		{
 *   			i=10
 *   			i=20
 *   			...
 *   			i=50
 *   			종료
 *   		}
 *     		for(데이터형 변수:배열(컬렉션))
 *     					  ---------	
 *     					   | 실제 저장된 데이터 읽기
 *     		{
 *     
 *     		}
 *     
 */
public class 배열_생성_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {10,20,30,40,50};
		for( int i:arr)
		{
			System.out.println("i="+i);
		}
		System.out.println();
		for(long i:arr)
		{
			System.out.println("i="+i);
		}
		System.out.println();
		for(double i:arr)
		{
			System.out.println("i="+i);
		}
		System.out.println();
		//Object > 최상위 데이터
		/*
		 * Object o;
		 * o=10
		 * o="hello"
		 * o='A'
		 * o=10.5
		 * o=100L
		 * o=true
		 * =============javascript
		 */
		// Object[]arr1= {"홍길동",27,180.0,'A',true};
		for(Object i:arr)
		{
			System.out.println("i="+i);
		}
		
		
		
		

	}

}
