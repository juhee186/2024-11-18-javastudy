/*
 *    break  => 반복문, 선택문에서 사용 가능
 *              조건문(if문)에서 사용 불가능
 *              --------
 *              if문 단독 사용불가/ for문 안 if 사용시 사용할 수 있다
 *              
 *              >>>> 반복문이 선택문을 종료할 때 사용하는 제어문
 *    continue => 반복문에서만 사용 가능
 *     			  조건문/ 선택문에서 사용 불가능
 *      		>> 특정부분을 제외할 때 사용
 *      		>> for 문에서는 증가식으로 이동
 *      		>> while 문에서는 조건식으로 이동
 *      *** break, continue 가 있는 경우에는 다음에 소스 코딩할 수 없다
 *         for()
 *         {
 *         	if()
 *        	 {  소스코딩가능
 *        	 break;    >>종료, 밑의 문장은 수행하지 않는다
 *         		소스코딩 불가능
 *        	 }
 *         }
 */
public class 반복제어문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{	System.out.print(i+" "); // 5까지 출력하고 싶다면 문장을 위로
			if(i==5 || i==7)
				// break; // 4에서 종료 아래의 문장을 실행하지않는다.
				continue;  //i++이동 : 6부터 출력 (제외하는 문장, 즉 5만 제외)
			System.out.print(i+" ");
		}

	}

}
