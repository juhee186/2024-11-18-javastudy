// 1~10까지 난수=> 10개를 발생 > 평균출력
public class 반복문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double avg=0.0;
		int sum=0;
		
		int i=0;
		while(i<=10)
		{
			int num=(int)(Math.random()*10)+1;
			System.out.print(num+" ");
			sum+=num;
			i++;
		
		}
		System.out.println("\n난수의 평균: "+(sum/10.0));
		
		
		
		
		
		
		
		
		
		

	}

}
