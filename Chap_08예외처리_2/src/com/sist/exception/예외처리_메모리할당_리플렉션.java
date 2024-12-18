package com.sist.exception;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Movie
{
	public void dusplay()
	{
		System.out.println("Movie : display()call...");
	}
}
public class 예외처리_메모리할당_리플렉션 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Movie m=new Movie();
//		m.dusplay();
		try
		{
			Class clasName=
					Class.forName("com.sist.exception.Movie");
			Object obj=clasName.getDeclaredConstructor().newInstance();
					
			Method[] me=clasName.getDeclaredMethods();
			
			me[0].invoke(obj,null);
		}catch(Exception e)
		{
			
		}
		

	}

}
