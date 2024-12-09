/*
 *  1. String
 *     문자열 저장 클래스 / 일반 데이터형처럼 사용가능
 *     String name="";  ===> 선호
 *                ----**
 *               
 *     String name=new String("초기값");
 *     
 *     클래스 => 문자열을 제어하는 기능을 제공
 *                         --------- 메소드
 *          => 완전 표준화( 확장불가 => 변경해서 사용 불가 )
 *     메소드
 *      = 결과값 (리턴형)
 *      = 어떤 데이터를 첨부 (매개변수)
 *      = 메소드명
 *      
 *      =기능
 *       int  length ()  =>갯수
 *       --- -----   --                    
 *       |     |      |
 *      리턴형  메소드명  매개변수
 *      
 *       boolean equals(String s) => if
 *       String s1="";
 *       String s2="";
 *       // 아이디 중복체크, 로그인...
 *       if(s1.equals(s2)) > 같냐
 *       if(!s1.equals(s2)) > 다르냐
 *              ||
 *       if(2.equals(s1)) > 같냐
 *       if(!s2.equals(s1)) > 다르냐
 *       // 우편번호 검색, 검색
 *       
 *       
 *       boolean contains (String s)  > 포함된 문자를 가지고있느냐
 *       String s1="asfgfgv";
 *       String s2="a";
 *       if(s1.contains(s2))   > 포함 (긴문장,검색어) : 순서 바뀌면 안됨
 *       //서제스트 > 자동완성기
 *       
 *       boolean startsWith(String s)
 *       String s1= "hello java"
 *       String s2= "he"; 
 *       String s3= "java"
 *       if(s1.startsWith(s2))  > 시작하는 문자열이냐
 *       if(s1.endsWith(s3))  > 끝나는 문자열이냐
 *       
 *       
 */
public class 문제정리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
