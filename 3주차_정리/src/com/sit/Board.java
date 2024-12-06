package com.sit;
import java.lang.reflect.Method;
import java.util.*;
class MyBoard

{
	@ReMapping("write")
	public void write()
	{
		System.out.println("글쓰기 처리");
	}
	@ReMapping("list")
	public void list()
	{
		System.out.println("목록 처리");
	}
	@ReMapping("update")
	public void update()
	{
		System.out.println("수정하기");
	}
	@ReMapping("delete")
	public void delete()
	{
		System.out.println("삭제처리");
	}
	
}
public class Board {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("글쓰기(write),수정(update),목록(list):");
		String cmd=scan.next();	
		
//		MyBoard m=new MyBoard();
//		if(cmd.equals("write"))
//		{
//			m.write();
//		}
//		else if(cmd.equals("update"))
//		{
//			m.update();
//		}
//		else if(cmd.equals("list"))
//		{
//			m.list();
//		}
		
		
//
		Class clsName=Class.forName("com.sist.MyBoard");
        Object obj=clsName.getDeclaredConstructor().newInstance();
        Method[] methods=clsName.getDeclaredMethods();
        for(Method m:methods)
        {
        	ReMapping rm=m.getAnnotation(ReMapping.class);
        	if(rm.value().equals(cmd))
        	{
        		m.invoke(obj, null);
        	}
		}
	}

}
