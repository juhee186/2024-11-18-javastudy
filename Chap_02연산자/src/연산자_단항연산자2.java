/*
 *  부정연산자 : !
 *    > 조건문
 *      > 로그인이 안 된 경우
 *      > 예약기간이 아닌 경우 ...
 *      > 게임 : 턴  
 *    > 무조건 boolean 만 사용가능 
 *       true > !true
 *       
 *      예)
 *      boolean bCheck=false;
 *      !bCheck > true 
 */
public class 연산자_단항연산자2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean bCheck = false;
		System.out.println(bCheck);
		bCheck=!bCheck;
		System.out.println(bCheck);
		
		/*int kor=55;
		if(!(kor>=60))
		{
			
		}*/
		// 연산자 >>> 응용 (제어문)
		// ! 는 반대의 효과
	}

}
