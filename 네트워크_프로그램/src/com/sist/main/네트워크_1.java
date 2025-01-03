package com.sist.main;
/*
 * 
 */
class MyThread extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			try
			{
				Thread.sleep(100);
			}catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println(Thread.currentThread()+":"+i);
		}
	}
}
public class 네트워크_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread m1=new MyThread();
		MyThread m2=new MyThread();
		MyThread m3=new MyThread();
		MyThread m4=new MyThread();
		MyThread m5=new MyThread();
		
		m1.setName("홍길동");
		m2.setName("2홍길동");
		m3.setName("3홍길동");
		m4.setName("4홍길동");
		m5.setName("5홍길동");
		
		m1.setPriority(Thread.MIN_PRIORITY);
		m2.setPriority(Thread.MIN_PRIORITY);
		m3.setPriority(Thread.MAX_PRIORITY);
		m4.setPriority(Thread.MIN_PRIORITY);
		m5.setPriority(Thread.MIN_PRIORITY);
		
		m1.start();
		m2.start();
		m3.start();
		m4.start();
		m5.start();
	}

}
