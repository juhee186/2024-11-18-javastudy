package com.sist.main;
/*
 * 	제네릭
 * 	----
 * 	1) 데이터형을 변경해서 사용이 쉽게 만든다
 * 		=> 리턴형 / 매개변수 => object => 원하는 데이터형으로 변경
 * 	2) 한번에 데이터형 통일이 가능하다
 * 	3) 형변환 없이 사용이 가능하다 => 소스간결 / 가독성
 * 	4) Object 단점
 * 		=> 데이터 읽기가 어렵다
 * 		
 */
class Box<T>
{
	T t;;
	public void setT(T t)
	{
		this.t=t;
	}
	public T get()
	{
		return t;
	}
}
public class 제네릭_Collection_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<String> b=new Box<String>();
		b.setT("Hello");
		String s=b.get();
		System.out.println(s);
		
	}

}
