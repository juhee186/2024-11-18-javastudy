/*
 *  문자열 정보
 *   => length() : 문자의 갯수
 *     - 비밀번호는 8자리 이상...
 *   =>  
 */
import java.util.Scanner;
// 사용자가 입력한 문자의 갯수 확인 > 공백포함
// Hello java > 공백포함 10글자
public class 문자열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.print("문자열 입력: ");
		String str1=scan.next(); 
		String str2=scan.next(); 
		String str3=scan.next(); 
		// nextLine() 공백포함 글자수 출력 
		// next()는 공백 앞까지의 글자수만 출력
		System.out.println("====결과====");
		System.out.println("문자 갯수: "+str1.length());
		System.out.println("문자 갯수: "+str2.length());
		System.out.println("문자 갯수: "+str3.length());
		
		
		
		
		
		
		
		
		
		
	}

}
