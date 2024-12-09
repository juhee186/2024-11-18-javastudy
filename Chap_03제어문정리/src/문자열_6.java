/*
 *  문자 자르기
 *  *****
 *  
 *  substring : 문자열을 자르는 기능
 *  | 지정된 위치부터 마지막까지 자르기  / substring(6) : 6번부터 마지막까지 자르기
 *   Hello java
 *   0123456789
 *   
 *  | 중간에서 자르기 / substring(1,4) : 1번부터 3번까지 자르기 ==> ell
 *  									---endIndex-1 마지막꺼 하나 제외됨
 *  ----------------------------------------------------- 자바스크립트 동일
 *  Trim : 공백제거
 */
public class 문자열_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String da="Hello.Hello.java";
		//System.out.println(da.substring(da.lastIndexOf(".")+1));
		// 원본은 그대로 유지
		String da="ID:admin,PWD:1234";
		String id=da.substring(da.indexOf(":")+1,da.indexOf(",")); //: ~ ,앞까지 가져와라
		System.out.println(id);
		String pwd=da.substring(da.lastIndexOf(":")+1);
		System.out.println(pwd);
		
		
		String add="서울 동대문구 회기동 346-14[새주소] 서울 동대문구 경희대로4길 76";
		String old=add.substring(add.indexOf("3"),add.indexOf("["));//(0,add.indexOf("["));
		System.out.println(old);
		String old1=add.substring(add.indexOf("]")+2);
		System.out.println(old1);
		System.out.println(old1.trim()); //  trim()  > 좌우의 공백 제거
		System.out.println(add);
		
		String s="hello java";
		s=s.substring(s.indexOf(" ")+1); //변수로 원본 변경
		String ss=s.substring(s.indexOf(" ")+1); // 자른 문장 따로, 원본 따로 저장되어있음
		System.out.println(s);
		System.out.println(ss);
		
		
		
		
		
		
		
	}

}
