/*
 *  대입연산자
 *  ------- => int a=10   >> 뒤에서부터 처리
 *               : 10을 a에 대입해라
 *  
 *  복합대입연산자(41페이지)
 *  ----------
 *   *** +=    >>  여러개 증가
 *   *** -=    >>  여러개 감소
 *            int a=10;
 *            a-5=;  : a-5
 *            > a=a-5  >> a=5
 *       *=
 *       /=
 *       %=
 *       
 *       int a=10;
 *        5씩 증가하라
 *  방법1. a++
 *        a++
 *        a++
 *        a++
 *        a++
 *        
 *  방법2. a+=5    >> a=a+5
 *        a-=5    >> a=a-5
 *        
 *        a++ ++a a+=1 a=a+1
 *        ------------------
 *        
 *        1~100까지 홀수만 출력
 *          >  +=2
 *  
 *                 
 *               
 */
public class 연산자_이항연산자_대입 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		a++;
		a++;
		a++;
		a++;
		a++;
		System.out.println(a);
		
		int b=10;
		b+=5;  // 누적 >> 합
		System.out.println(b);
		
		int c=10;
		c=c+5;
		System.out.println(c);
		
		// 여러번 증가할 때는 복합대입연산자사용
		// 1씩 증가할 때는 증감연산자 사용
		
		
		
		
		
		
		}

}
