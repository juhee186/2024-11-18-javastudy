/*
 *  문자열 배열
 *  String [] 배열명={"","","","",""}; => 명시적 선언
 *  String [] 배열명=new String[10]; => default =>null
 *  
 *  int[] aa; aa=null ==> 배열 / 클래스  ==> 메모리 주소 참조
 *  => 배열 => [
 *  => 클래스 => 클래스@주소
 *  
 *  
 */
import java.util.*;
public class 문자열_1 {
	/*
	 *  배열도 변수의 일종
	 *  	---------- 여러개의 데이터 저장이 가능
	 *  		=> 한개의 이름으로 제어 가능
	 *  		   -------------- 구분이 가능하게 => 각 변수마다 인덱스 부여
	 *  고정적인 단점 => 한 번 선언하면 변경이 어렵가
	 *  ---- 동적으로 생성(가변형)
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]names= {"홍길동","박문수","강감찬","이순신","김두한"};
		//전체 출력 일반 for , for-each , 라이브러리
		for(int i=0;i<names.length;i++) //for
		{
			System.out.print(names[i]+" ");
		}
		
		System.out.println();
		
		for(String name:names) //for-each
		{
			System.out.print(name+" ");
		}
		
		System.out.println();System.out.println(Arrays.toString(names)); //라이브러리
		
	

	}

}
