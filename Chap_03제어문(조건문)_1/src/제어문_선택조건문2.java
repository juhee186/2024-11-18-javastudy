/*
 * 정수를 입력받아 홀수 짝수
 * random(1) 1~100
 * random(2) 1~100
 *   > 최대값 최소값 출력
 */
public class 제어문_선택조건문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 임의 숫자
		/* int num=(int)(Math.random()*100)+1;
		if(num%2==0)
			System.out.println(num+"은 짝수");
		else
			System.out.println(num+"은 홀수"); */
		
		int num1=(int)(Math.random()*100)+1;
		int num2=(int)(Math.random()*100)+1;
		System.out.println("num1="+num1+",num2="+num2);
		
		/*
		 * int max=0,min=0;
		 
		if(num1>num2)
		{
			max=num1;
			min=num2;
		}
		else
		{
			max=num2;
			min=num1;
		} 
		
		System.out.println("==========");
		System.out.println("최대값:"+max);
		System.out.println("최소값:"+min); */
		
		System.out.println("==================");
		System.out.println("최대값:"+Math.max(num1, num2));
		System.out.println("최소값:"+Math.min(num1, num2));
		
	
		
}
}