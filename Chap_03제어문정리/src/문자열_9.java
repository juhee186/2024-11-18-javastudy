// replaceAll("","")
//			---  ---
//			변경전 변경후

public class 문자열_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String da="Hello 자바 1234";
		// 한글을 제외한 나머지를 공백으로
		System.out.println(da.replaceAll("[^가-힣]",""));
		// 영어를 제외한 나머지를 공백으로
		System.out.println(da.replaceAll("[^A-Za-z]",""));
		// 숫자를 제외한 나머지를 공백으로
		System.out.println(da.replaceAll("[^0-9]",""));
		
		
		
	}

}
