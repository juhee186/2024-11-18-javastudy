/*
 *    if(조건)
 *    {   조건 >>> 참
 *    }
 *    else
 *    {   조건 >>> 거짓
 *    }
 *    
 *    if(조건문)
 *    {
 *    }
 *    -------------------- 단일문장
 *    if(조건문)
 *    {
 *    }
 *    else  >> 바로위의 조건만 처리  >  단독사용불가
 *    {
 *    }
 *    ---------------------
 *    
 *    >>>>>> 다중조건문 (58페이지)  > 해당 조건에 맞는 내용 1개만 실행
 *    if(조건) >> +
 *    { 실행문장
 *       조건 참      : 문장을 실행하고 종료
 *          거짓	 	: 밑의 조건으로 이동
 *    }
 *    else if (조건) >> -
 *    { 실행문장
 *       조건 참      : 문장을 실행하고 종료
 *          거짓	 	: 밑의 조건으로 이동
 *    }
 *    else if (조건) >> *
 *    { 실행문장
 *       조건 참      : 문장을 실행하고 종료
 *          거짓	 	: 밑의 조건으로 이동
 *    }
 *    else if (조건) >> /
 *    { 실행문장
 *       조건 참      : 문장을 실행하고 종료
 *          거짓	 	: 밑의 조건으로 이동
 *    }
 *    else if (생략가능)
 *    { 실행문장
 *    }
 *    >>>>> 게임 키선택 사용 :up/down/left/right/enter/space
 *          메뉴 선택
 */
public class 제어문_선택조건문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=15;  // 조건 여러개 수행 >단일   한개만>다중
		if(a%3==0)
			System.out.println(a+"는 3의 배수");
		if(a%5==0)
			System.out.println(a+"는 5의 배수");
		if(a%7==0)
			System.out.println(a+"는 7의 배수");
		/*else
			System.out.println(a+"는 3,5,7의 배수x)");
		*/
		
		
		
		

	}

}
