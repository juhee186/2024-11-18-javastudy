/*
 * 선택문 : 다중조건문을 단순화 시킨 프로그램제어문
 *        > 한개만 수행 가능
 *        > 게임, 네트워크
 *          ---------- 값을 한개만 선택(선택문), 범위(다중조건문)
 *                    **------
 *        > 웹에서 사용 빈도가 거의 없다
 *          if / if ~ else / for / while / break
 *          =====================================
 * 1. 형식)
 *    switch(정수, 문자, 문자열)
 *                    -----
 *   1) 정수  >> 메뉴
 *           no=0
 *            | 0  > 처리문장 0,1,2,3,4까지 처리
 *     switch(no) > 0,1,2..
 *     {
 *     	 case 0:
 *            처리문장1
 *            break; > 종료  : 반드시 주는 것은 아니다.
 *                            같은 내용을 실행할 때가 있다
 *       case 1:
 *            처리문장2
 *            break; >종료
 *       case 2:
 *            처리문장3
 *            break; >종료
 *       default  >> else   :  해당번호가 없는 경우 처리
 *            처리문장4            
 *     }  
 *     예)  90 ~ 100 > A > 90~100/10  >> 케이스 문장을 최대한 줄여 사용
 *         케이스 10 : 
 *         케이스 9 :
 *          break;
 *           if(score==10||score==9)
 *           
 *                          
 *                              
 */
// 다중조건문과 동일> 한 개의 case만 수행
public class 자바선택문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score=(int)(Math.random()*101);
		int avg=score/10;
		/*
		 *  주의점
		 *  1. case 는 동일하면 안된다
		 *  2. 정렬할 필요는 없다
		 *  3. switch 안에 들어갈 수 있는 데이터형
		 *                  >> 정수, 문자, 문자열
		 */
		switch(avg)
		{ 
		case 10: case 9: // 같은 내용을 출력할 경우에는
			// avg==10 || avg==9
			// 다중조건문보다 가독성이 좋다
			// ======= 범위를 지정하기 때문에 다중조건문을 더 많이 사용한다  >> 페이지 나누기
			// 선택문은 범위 지정 불가능
			// 데이터베이스는 10000 단위 저장> 선택문에 적용하기 어렵다
			System.out.println(score+"점은 A등급");
			break;
		case 8:
			System.out.println(score+"점은 B등급");
			break;
		case 7:
			System.out.println(score+"점은 C등급");
			break;
		case 6:
			System.out.println(score+"점은 D등급");
			break;
		default:
			System.out.println(score+"점은 F등급");
		}
		
		
		
		
		
		
	}

}
