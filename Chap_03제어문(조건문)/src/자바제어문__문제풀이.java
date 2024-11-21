import java.util.Scanner;

public class 자바제어문__문제풀이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/* 1번문제
	 * > 연산: 같은 데이터형만 연산처리 가능/ 큰데이터형으로 변경해서 연산
	 * > 작은데이터형->큰데이형 (자동) 큰데이터형-> 작은데이터형 (강제) / int이하 데이터의 연산 결과는 int
	 * 		int a,b;
			a=6;
			b=2;
			System.out.printf("결과%d \n",a-b);
			System.out.printf("결과%d \n",a*b);
			System.out.printf("결과%d \n",a/b);
			System.out.printf("결과%d \n",a%b);
			System.out.printf("결과%d \n",a+b); */
		
		/* 2번문제
		 *int num1, num2;   
          num1 = 10/3;
          // '몫' 출력   
         num2 = 10%3;
         // '나머지' 출력
         System.out.printf("몫:%d\n",num1);   
         System.out.printf("나머지:%d\n",num2); 
		 */
		
		/* 3번문제
		 *  int num1=1, num2=2, num3=3, num4=4, num5=5;     
            num1 = num1 +    num2;
     	    num2 = num2 - 2;     
     		num3 = num3 * 2;     
     		num4 = num4 / 2;     
     		num5 = num5 % 2;     
     		System.out.printf("%d,%d,%d,%d,%d\n",num1,num2,num3,num4,num5);   

		 */
		
		/* 4번문제
		 * int num1=10;   
      		System.out.printf("%d \n", num1); >10
      		num1++; 1+
      		System.out.printf("%d \n", num1); >11
      		++num1; 1+
      		System.out.printf("%d \n", num1); >12
      		--num1; 1-
      		System.out.printf("%d \n", num1); >11
      		num1--; 1-
      		System.out.printf("%d \n", num1); >10

		 */
		
		/*5번문제
		 * 	int num1=10, num2=10;   
       		int a, b;   
       		a = ++num1;  >a=11
       		b = num2++;  >b=11

        System.out.printf("%d, %d \n", b, num2);*/
		
		/*6번문제
		 * int num1=10, num2=10;   
        int a, b;   
        num1 = num1 + 1;  > num1+=1   = int a=++num1
        a = num1;
        System.out.printf("%d, %d \n", a, num1);
        b = num2;    >10    = int b=num2++
        num2 = num2 + 1;
        System.out.printf("%d, %d \n", b, num2);

		 */
		
		/*7번문제
		 *     int num1=10, num2=10;
    System.out.printf("%d \n", ++num1);  > 11   : 증가후 출력 
    System.out.printf("%d \n", num1); > 11
    System.out.printf("%d \n", num2++); >10 : 출력후 증가
    System.out.printf("%d \n", num2); >11  */
		
		/* 8번문제
		 *   int a = 5;
             int b = 5; 
             System.out.println(a==b);
             System.out.println(a>b);
             System.out.println(a<b);
             System.out.println(a==b && a>3);
		     System.out.println(a!=50); */
		
	/*	9번문제
	 *  Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력");
		int num1=scan.nextInt();
		System.out.println(num1<0?"음수입니다":"양수입니다");
		2.
		if(num1<0)
		{
		System.out.println(num1+"음수입니다");
		}
		if(num1>0)
		{
		System.out.println(num1+"양수입니다");
		}
		*/
				
		
	/* 10번문제
	 *  Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력");
		int num1=scan.nextInt();
		System.out.println(num1%3==0?"3의 배수":"3의 배수가 아닙니다");
		2.
		if(num1%3==0)
		{
		System.out.println(num1+"3의 배수입니다");
		}
		if(num1%3!=0)
		{
		System.out.println(num1+"3의 배수아닙니다");
		}
		*/
		
		/* 11번 문제
		 * Scanner scan=new Scanner(System.in);
		   System.out.print("2자리 정수 입력");
			int num1=scan.nextInt();
			if(num1%11==0)
			System.out.println("10의자리 같음");
			if(num1%11!=0)	
			System.out.println("10의자리 같지않음");*/
		
		
		
		Scanner scan=new Scanner(System.in);
		System.out.print("달을 입력하세요(1~12):");
		int mon=scan.nextInt();
		if(mon>=3 ||mon<=5)
			System.out.print(mon+"월은 봄입니다.");
		if(mon>=6 || mon<=8)
			System.out.print(mon+"월은 여름입니다.");
		if(mon>=9 || mon<=11)
			System.out.print(mon+"월은 가을입니다.");
		if(mon==12||mon==1||mon==2)
			System.out.print(mon+"월은 겨울입니다.");

}
}
