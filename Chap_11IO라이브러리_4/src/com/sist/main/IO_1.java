package com.sist.main;
import java.io.Serializable;
/*
 * 	객체 단위로 저장
 *  ------------
 *  네트워크 / 일반 프로그램 설정
 *  -----
 *  1. 값 형식 데이터
 *  	int / float / char ... 스택에 저장 직접 접근 가능
 *  2. 참조 형식 데이터
 *  	객체 => 주소만 저장 => 실제 데이터는 Heap에 저장
 *  => 네트워크 전송
 *  	값 자체를 저장 후 전송
 *  	=> 실제값을 저장 후 전송
 *  => 다른 프로그램 : CVS / JSON => 자체에서 값을 저장된 상태에서 전송
 *  
 *  참조형 => 값형식 : 시리얼라이즈(직렬화)
 *  	=> implements Serialize
 *  => 값을 받을 경우 다시 객체단위로(참조형)으로 저장 (역직렬화)
 *  	=> ObjectOutputStream / ObjectintputStream 사용
 *  	=> 항상 복귀 가능
 *  => 초창기에는 많이 사용 => 오라클
 *  
 *  직렬화
 */
import java.util.*;
import java.io.*;
// 객체의 실제값을 스택(실제 저장값)에 저장 후 다른컴퓨터로 전송
// 직렬화 => 빅데이터 분석 => 하둡 => 파이썬(넘파일, 판다스)
//							 ---------------------
// => 지하철 혼잡도, 날씨예측, 범죄예측, 자동차 리필
// => data.go.kr : 공공포털
/*
 * 	Heap => 병렬형식
 * 			-----
 * 			-----
 * 			-----
 * 			-----객체의 실제값 저장
 * 
 * Stack =>	직렬
 * 			--------------
 * 			|  |  |  |  |
 * 			--------------
 * 
 * 			병렬 => 직렬 (직렬화)
 * 			직렬 => 병렬 (역직렬화)
 * 
 * 		100|id|pwd|name|sex
 * 
 */
class sawon implements Serializable
{
	private int sabun;
	private String name;
	private String dept;
	private String job;
	private int  pay;
	
	public int getSabun() {
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDpt() {
		return dept;
	}
	public void setDpt(String dpt) {
		this.dept = dpt;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	//메모리 저장
	public sawon(int sabun, String name, String dept, String job, int pay) {
		this.sabun = sabun;
		this.name = name;
		this.dept = dept;
		this.job = job;
		this.pay = pay;
	}
	//default 생성자 => 생성자가 이미 존재 => 자동생성x
	public sawon()
	{
		
	}
	
}
public class IO_1 {
public static void main(String[] args) {
	List<sawon> list=new ArrayList<sawon>();
	list.add(new sawon(1,"홍길동","개발부","사원",3200));
	list.add(new sawon(2,"심청이","총무부","과장",4200));
	list.add(new sawon(3,"이순신","영업부","대리",3600));
	list.add(new sawon(4,"강감찬","자재부","부장",5200));
	list.add(new sawon(5,"박문수","기획부","차장",3900));
	
	ObjectOutputStream oos=null;
	try
	{
		File file=new File("c:\\java_data\\sawon_info.txt");
		if(!file.exists()) //파일이 없다면
		{	
			file.createNewFile(); // 파일을 만들어라
		}
		FileOutputStream fos=
				new FileOutputStream(file);
		oos=new ObjectOutputStream(fos);
		
		//저장
		oos.writeObject(list);
		System.out.println("저장!!");
	}catch(Exception ex)
	{
		ex.printStackTrace();
	}
	finally
	{
		try
		{
			oos.close();
		}catch(Exception ex) {}
	}
	}
}
