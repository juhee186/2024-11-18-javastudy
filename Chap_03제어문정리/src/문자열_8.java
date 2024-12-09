/*
 * toUpperCase() :
 * toLowerCase() : 
 *  = replace() : 
 *  = replaceAll() : 
 *  
 *   함수 : function
 *   메소드 : method
 *   =============== 기능상 동일
 *   class종속 여부에 따라
 *   C/C++/python => function 
 *   java/kotlin => method
 *   
 *   String data="java"
 *   data.replace('a','b') => jbvb
 *   replace(문자,문자)
 *   		 --- ---
 *   
 *    String data="hello java"
 *    data.replace("java","oracle") => hello oracle
 *   replace(문자열,문자열)
 *   		 ----  ----
 */
import java.util.Scanner;

public class 문자열_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String name="Hong Gil Dong";
		//System.out.println(name.toUpperCase()); //대문자
		//System.out.println(name.toLowerCase()); //소문자
		// Upper / Lower  =>오라클 함수
		// 데이터관리 => 자바+오라클 => JSP 에서 HTML로 변환
		
			String da="Hello java";
			System.out.println(da.replace('a', 'k'));
			System.out.println(da.replace("java", "oracle"));  // 대소문자 구분
		// 오라클 연동할 때 많이 사용	
		//이미지, 줄거리, 내용
		// | , & , '' => 오라클에서 첨부하지 못한다
		// & => replace
		// & => Scanner
		// || => 문자열 결합
		// 문자열 => ''	
		// Scanner scan= new Scanner(System.in);

		
		
		
	}

}
