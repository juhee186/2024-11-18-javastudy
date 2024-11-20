/*
 *  >> 임의로 변수 초기화
 *   난수  >>  Math.random()
 *   
 *   Math.random()  >>>> double
 *                       0.0 ~ 0.99
 *   1~100
 *    Math.random()*100
 *    =====================
 *    > 0.0 ~ 99.0
 *    > (int) 로 바꾸면 0~99
 *    > (int)(Math.random()*100)+1
 *    > 1 ~ 100                    
 */
public class 연산자_이항연산자_산술_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=(int)(Math.random()*100)+1;
		int b=(int)(Math.random()*100)+1;
		System.out.println(a+b);
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println(a+b);

	}

}
