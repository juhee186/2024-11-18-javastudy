
public class 문자열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String movie="1|제목|감독|드라마|배우|개봉일|등급|프랭크|다라본트|";
		String []data=movie.split("\\|");
		//정규식 > * , + , . , | , ?
		for(String m:data)// for-each : 향상된 for문
		{
			System.out.println(m);
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
