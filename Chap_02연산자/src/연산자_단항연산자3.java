/*
 *  형변환 연산자
 *  ====== long >> int    /    char >> int    /  byte >> int   /   int  >> double  /   double  >>  int
 *  
 *  숫자/문자 (정수인식)  >>> boolean 제외
 *  
 *  
 *    <=========                      ==========>
 *     DownCasting                     UpCasting
 *    : 데이터형을 작게                  : 데이터형을 크게
 *      > 강제                           > 자동
 *  byte < short < int  <  long  <  float  <  double
 *         char
 *         
 *         
 *   byte b=10;
 *   int i=b;
 *         ------- int로 변경
 *         
 *   int a=10;
 *   double d=a;
 *         ------- double로 변경  
 *           >>>>>>10.0      
 *           
 *    10  + 10.5    >>>>    20.5   ==>  연산은 같은 데이터형만 처리 가능
 *   int   double
 *    ㅣ 
 *   10.0 자동으로 변경   
 *   
 *   *** 가장 큰 데이터형으로 변경
 *   *** int 이하 데이터형(byte, short, char)의 연산결과는 int로   
 *   *** 필요시에 강제로 변환
 *         =================== 형변환 연산자
 *         
 *       (int)10.5 + (int)20.3  
 *       ---------    --------
 *             10        20            >>>>>>>>>30   
 *             
 *       (int)(10.5+20.5) >>>>31
 *              --------
 *    ****       ()최우선 
 *        
 *         
 *     (데이터형)변수
 *     > 10/3  >> 3 (정수/정수 = 정수) 
 *     > 10/(double)3  >>  3.333..          
 *   
 *                        
 */
public class 연산자_단항연산자3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		double d=a;
		System.out.println(d);
		System.out.println(d);
		
		char c='A';
		int e=c;
		System.out.println(e);
		
	
	
	
	}
	
}