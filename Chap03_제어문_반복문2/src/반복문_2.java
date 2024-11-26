/*
 *  2*1=2 3*1=3 4*1=4...9*1=9
 *  ..
 *  ..
 *  ..
 *  ..
 *  2*9=18 3*9=27  ...9*9=81
 *  
 *  가로 1~9 : 9바퀴
 *  세로 1~9 : 8바퀴
 */
public class 반복문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=9;i++) //줄수
		{
			for(int a=2;a<=9;a++) //가로
			{System.out.printf("%2d*%2d=%2d\t",a,i,a*i);
		}
			System.out.println();
	}

}
}