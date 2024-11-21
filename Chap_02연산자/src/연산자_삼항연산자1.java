/*
 *   삼항연산자  >> 웹/게임   :  소스를 간결하게 만드는 경우
 *    ----------  If ~ else
 *    
 *   => 삼항연산자
 *    (조건)? 값1:값2
 *    조건 > true : 값1
 *        > false : 값2
 *        
 *    char sex='W'
 *    sex=='W'? "여자":"남자"
 *            > true = 여자
 *            
 *                 
 *   
 *   
 *   
 *   
 *   
 *   
 *   
 *   
 */
public class 연산자_삼항연산자1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c='A';
		System.out.println(c>='A' && c<='Z'?"대문자":"소문자");
		
		char d='a';
		System.out.println(d>='a' && d<='Z'?"대문자":"소문자");
		
		int a=(int)(Math.random()*100)+1;
		System.out.println(a%2==0?" 짝수":"홀수");
		
		c='A';
		System.out.println(c>='a' && c<='z'?"소문자":"대문자");
		
		/*
		 *     조  건
		 * true  |  false
		 *   --------
		 *   |      |
		 *  값1     값2 
		 */
		
		
		
		
	}

}
