// 정수 =>0~9 사이의 난수 발생 > 30개 빈도수 구한다
public class 배열_생성_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []aa=new int[10];
		// 아이디마다 장바구니에 추가한 갯수
		for(int i=1;i<=30;i++)
		{
			int num=(int)(Math.random()*10);
			System.out.print(num+" ");
			aa[num]++; //갯수
		}
		System.out.println();
		for(int i=0;i<aa.length;i++)
		{
			System.out.println("aa["+i+"]="+aa[i]);
		}
		
		
		
		
		
		

	}

}
