import java.util.*; // 두개이상 사용 > Scanner / calendar
public class 배열응용_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.print("년도 입력 : ");
		int year=scan.nextInt();
		
		System.out.print("월 입력 : ");
		int mon=scan.nextInt();
		
		System.out.print("일 입력 : ");
		int day=scan.nextInt();
			
		Calendar cal=Calendar.getInstance();
		// 추상 클래스 = new를 사용하지 못한다
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, mon-1);
		cal.set(Calendar.DATE,day);
		
		char[] str= {' ','일','월','화','수','목','금','토'};
		// 캘린더에서 week=1부터 시작 , 첫 공백주기
		int week=cal.get(Calendar.DAY_OF_WEEK); //요일구하기
		System.out.println(year+"년"+mon+"월"+day+"일"+str[week]+"요일입니다.");
		
		int last=cal.getActualMaximum(Calendar.DATE); //마지막날
		System.out.println("마지막날 :"+last);
		
		
		
		
		
		
		
		
		

	}

}
