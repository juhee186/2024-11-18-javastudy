/*
 *  while / do~while
 *    |       | 반드시 1번 이상 수행시 사용
 *    | 반복횟수가 없는경우
 *   반복제어문
 *    |
 *    break : 반복 종료
 *    continue : 특정부분을 제외
 *    ========= for : 증가식으로 이동 / while : 조건식으로 이동    
 *    							   ------ 처음부터 다시 시작		
 *    
 *    형식)
 *    while
 *    초기식--------1
 *    while(조건식)-2
 *    {
 *    	반복실행문장--3
 *    	증가식------4
 *    }
 *    
 *    do~while : while 을 보완 (무조건 1번은 실행)
 *    초기식-------1
 *    do
 *    {
 *    	반복실행문장-2
 *    	증가식 ----3
 *    } while(조건식);	--4			  >> 2번으로 이동(참일때) / 거짓일 때 종료    
 *  
 */
public class 반복문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1~10까지 출력
		System.out.println("=======for=====");
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println("\n========while========");
		int i=1;
		while(i<=10)
		{
			System.out.print(i+" ");
			i++;
		}
		System.out.println("\n========while========");
		i=1;
		do
		{
			System.out.print(i+" ");
			i++;
		}while(i<=10);
		
		
		
		
	}

}
