/*
 *  while문 : 반복 횟수가 지정되지 않았을 때
 *  
 *  형식)
 *    초기값        =1
 *      초기값 |
 *         조건식
 *           |  거짓 > 종료
 *    while(조건식) =2
 *    {      |  참  > 수행
 *      반복수행문장  =3
 *      증감식      =4
 *    }
 *    
 *    사용처 : 데이터베이스, 서버(자바서버 => 인터라넷) , 파일읽기
 *                           | 사내메신저
 *                           | 게임
 *          => 무한루프 while(true)
 *              | front
 *    while문은 실행이 안되는 경우도 있다 > 조건식이 거짓일 경우                 
 */
public class 반복문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1~10출력
		int i=1;
		while(i<=10)
		{
			System.out.print(i+" ");//반복수행문장
			i++; //증가식
		}
		
		/*for(int i=1;i<=10;i++)
		{	System.out.print(i+" "); }*/

		
		
		
		
		
		
		
		
		
	}

}
