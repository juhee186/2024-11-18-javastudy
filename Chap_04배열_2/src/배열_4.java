// 6개의 난수 발생 => 중복이 없는 데이터 출력(1~45 사이)
/*
 *  클래스의 구성요소
 *  class classname
 *  {
 *  	-----------------
 *  	  변수=> 멤버변수
 *  	       공유변수
 *  	      => 일반변수/배열/클래스(변수)
 *  		  => 변수 보호(데이터 보호)
 *  			 =============== 캡슐화/은닉화
 *  	-----------------
 *  	  메소드 > 기능/재사용
 *  	   > 유지보수 관련(수정,추가) > 오버라이디/오버로딩
 *  	-----------------
 *  	  생성자 > 메모리에 클래스 저장 > 생략가능
 *  	-----------------
 *  }
 */
import java.util.Arrays;

public class 배열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr=new int[6];
		int su=0; //난수 저장 변수
		boolean bCheck=false;
		for(int i=0;i<arr.length;i++)
		{
			bCheck=true;
			while(bCheck) // 중복여부 확인 => 횟수가 지정이 안됨
			{
				su=(int)(Math.random()*45)+1;
				bCheck=false; //while 종료
				//같은 정수가 있는 지 확인
				for(int j=0;j<i;j++)
				{
					if(arr[j]==su) //저장된 데이터 중 난수와 같은 값이 있는지
					{
						bCheck=true;
						break;
					}
				}
				
			}
			arr[i]=su;
		}
		Arrays.sort(arr);; // 정렬
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
		

	}

}
