
public class 문자열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Helo Java";
		String s2="Helo java";
		String s3=new String("Hello Java");
		// equalsIgnoreCase => 대소문자 구분없이 비교
		// 나머지 String 모든 메소드는 대소문자를 구분
		if(s1.equals(s2)) // == 메모리주소비교
		{	// equals는 저장되어있는 문자열이 같냐
			// 메모리 주소비교보다는 문자열 자체를 비교할 때
			System.out.println("s1==s2");
		}
		else
		{
			System.out.println("s1!=s2");
		}
		
		
		
		
		
	}

}
