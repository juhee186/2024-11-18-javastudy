// A C E G...
public class 반복문_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for(char c='A';c<='Z';c+=2)
			System.out.print(c+" ");*/
		// 증가식은 한개만 증가하는 것이 아니라 경우에 따라 여러개 증가할 수 있다
		for(int i=1;i<=10;i++)
		{
			if(i%2==1)
				System.out.print(i+" ");
		}
		System.out.println();
		for(int i=1;i<=10;i+=2)  // 여러개 동시 증가 > 총알 발사
		
				System.out.print(i+" ");
		System.out.println();
		// 1~100 > 5의 배수 출력
		for(int i=5;i<=100;i+=5)   // 초기식, 증감식 유의
				System.out.print(i+" ");
		
		
		
		
		
		

	}

}
