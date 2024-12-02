// char 배열 사용법 / double / String
//=> 응용  => 정렬/ 달력... / 중복없는 난수
//=> 지니뮤직,서울여행,맛집...
public class 배열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[]al=new char[26];
		char c='A';
		for(int i=0;i<al.length;i++)
		{
			al[i]=c++; // A~Z까지
		}
		for(char cc:al)
		{
			System.out.print(cc+" ");
		}
		System.out.println();
		
		// => K가 있는 인덱스번호를 출력
		int in=0;
		for(int j=0;j<al.length;j++)
		{
			if(al[j]=='K')
			{
				in=j;
				break;
			}
		}
		System.out.println("K의 위치는"+in);
		
		
		
		
		
		
		

	}

}
