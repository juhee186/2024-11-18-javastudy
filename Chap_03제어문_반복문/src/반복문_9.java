// 10개의 알파벳을 추출 > 대문자, 소문자 갯수
public class 반복문_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aa=0, ss=0;
		for(int i=1;i<=10;i++)
		{
			char c='A';
			int no=(int)(Math.random()*2);
			if(no==0)
				c=(char)((Math.random()*26)+65); // 대문자 추출
			else
				c=(char)((Math.random()*26)+97);
				
			System.out.print(c+" ");
			if(c>='A' && c<='Z') // 대문자라면
				aa++;
			else
				ss++;
		}
		    System.out.println();
			System.out.println("소문자 수:"+ss);
			System.out.println("대문자 수:"+aa);
		
		
		
	}

}
