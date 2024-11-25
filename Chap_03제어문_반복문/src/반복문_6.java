/*
 *   반복문 > for
 *   1. 형식 > (65페이지)
 *     for(초기식;조건식;증감식)
 *     {
 *      반복수행문장
 *     }
 *     
 *     => 향상된 for > for-each : jdk1.5
 *                   --------- 배열 / collection
 *                   --------- 웹에서 주로 사용
 *                   vuejs/reactjs
 *                     |      |
 *                    vuex  redux
 *                            |
 *                          react-query  > 개인프로젝트
 *                          =========== nextjs
 *                            | >msa
 *     프로젝트
 *       1. 자바  => 자바 정리 ( 네트워크, 데이터베이스)
 *       2. 웹 데이터베이스 활용 / jsp 사용 / mvc구조
 *       3. 웹 spring 관련 내용 습득, 데이터베이스 고급과정
 *       4. 웹 (개인프로젝트) => 신기술                       
 *   2. 동작순서 > (66페이지)
 *               | false 종료
 *           1==> 2 <== 4
 *     for(초기식;조건식;증감식)
 *               | true
 *              3 반복 수행문장   > 4로 이동
 *     1 => 초기식은 한 번만 수행
 *     2 => 3 => 4
 *     ...
 *     4번에 증감 > 2번 조건식에 대입 > false 나올때까지 동작         
 *    3. 프로그램 구현방법
 *       순서
 *       1) 변수 설정
 *       2) 변수 초기화 > 난수 / 명시적 / 입력값
 *       3) 제어문 이용하여 사용자 요청값 추출
 *          => 데이터베이스 안에 있는 데이터 추출
 *          --------------------------------------------데이터처리
 *       4) 결과값 출력
 *     for
 *      => 무한루프 : 종료가 없는 상태
 *         ----- for (;;)   >>  while(true)
 *         ** 1~10까지 출력 for/while/do~while
 *         ** 프로그램의 단점 : 정답이 없다 (프로그래머마다 소스양식을 달리해 통일성이 부족함) / 오라클 : sql문장이 다르다  
 */
import java.io.*;
public class 반복문_6 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileReader fr=new FileReader("C\\javadev\\movie.txt");
	//String movie="";
		StringBuffer sb=new StringBuffer();
	int i=0;
	while((i=fr.read())!=-1)
	{
		sb.append((char)i);
		
	}
	fr.close();
	System.out.println(sb.toString());
	
	
	
	}
	
}
