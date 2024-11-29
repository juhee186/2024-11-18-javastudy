// (64페이지) > 계절
// 3~5 봄 / 6~8 여름 / 9~11 가을 12,1,2 겨울
// 난수처리
public class 자바선택문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1~12 임의의 수 추출
		int mon=(int)(Math.random()*12)+1;
		// 사용자 입력 >> 1~12 (X) > 범위를 벗어날 확률 >> default
		// default / else > 다른 값을 입력하거나 잘못된 입력시  >> 생략가능하다
		
		switch(mon)
		{
		case 3: case 4: case 5: // if(mon==3||mon==4||mon==5)
			System.out.println(mon+"월은 봄");
		 break;
		case 6: case 7: case 8: //else if(mon==6||mon==7||mon==8)
			System.out.println(mon+"월은 여름");
		 break;
		case 9: case 10: case 11: //else if(mon==9||mon==10||mon==11)
			System.out.println(mon+"월은 가을");
		 break;
		case 12: case 1: case 2: //else if(mon==12||mon==1||mon==2)
			System.out.println(mon+"월은 겨울");
			//default 은 생략가능
		}
		
		
		

	}

}
