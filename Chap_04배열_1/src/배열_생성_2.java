import java.util.Arrays;

public class 배열_생성_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[]al= {'A','B','C','D','E'};
		for(char a:al)
		{
			System.out.print(a+"");
		}
		
		System.out.println();
		al[1]='K'; //변수와 동일하게 사용
		al[4]='M';
		System.out.println(Arrays.toString(al));
		// 배열안에 있는 모든 데이터를 한번에 읽어 출력
		
		
		
		
		
		

	}

}
