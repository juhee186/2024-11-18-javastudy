// 점수를 입력받아 학점 출력

public class 자바제어문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//난수 발생 > Math.random() >> 0.0~0.99  >0~100 필요
		int score=(int)(Math.random()*100)+1;
		System.out.println("score="+score);
		/*
		 *  변수 선언 > 초기화
		 *  초기화 1. 명시적 초기화
		 *           int a=10;
		 *       2. 난수 발생 : 컴퓨터가 임의의 수를 추출
		 *           Math.random()
		 *       3. 입력을 받아
		 *           scan.nextInt()
		 *          파일읽기/ 데이터베이스 읽기 등 다른 방법도 있음
		 *  자바 >> 기본 문법 /  프로그램의 순서
		 *   최종으로 나올 수 있는 프로그램 : 네트워크, 게임
		 *  59페이지                        **** 데이터베이스 : 웹 >> 조별 프로그램         
		 */
		 if(score>=90)
			 System.out.println(score+"는 A등급");
		 else if(score>=80)
			 System.out.println(score+"는 B등급");
		 else if(score>=70)
			 System.out.println(score+"는 C등급");
		 else if(score>=60)
			 System.out.println(score+"는 D등급");
		 else
			 System.out.println(score+"는 F등급");

		
		
		
	}

}
