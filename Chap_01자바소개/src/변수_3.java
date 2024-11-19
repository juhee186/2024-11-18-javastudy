// 수정 > 다시 저장
public class 변수_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100;
		System.out.println(a);
		a=200;
		System.out.println(a);
		
		a=1000;
		System.out.println(a);
		// 수정시 int 중복 작성하지 않는다
		// 같은 블럭 안에서는 같은 변수명을 사용할 수 없다
		
		/*
		 * 학생1명
		 * 국어점수 : 90
		 * 수학점수 : 90
		 * 영어점수 : 90
		 * 총점 : 270
		 * 평균 : 90.0
		 * 학점 : A
		 * 등수 : 2
		 * 
		 * 
		 * int k,e,m;
		 * k=e=m=90;
		 * int k=90, m=90,e=90
		 * 
		 * */
		int k=90;
		int m=90;
		int e=90;
		int s=270;
		double f= 90.0;
		char q = 'A';
		int r = 2;
		System.out.println("국어점수:"+k);
		System.out.println("평균:"+f);
		System.out.println("학점:"+q);
		
		
				
		
	}

}
