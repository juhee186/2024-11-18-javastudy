package com.sist.vo;
import java.util.*;

import lombok.Data;
/*
 * 	오라클에 있는 데이터를 모아서 => 윈도우, 브라우저 전송할 목적
 * 	=> 한 명에 대한 데이터를 가지고 있다
 * 	=> 멤버변수는 컬럼명과 동일하게 만든다
 * 	   -----   ----
 * 	=> 데이터형 일치
 * 	   ---------
 * 		오라클
 * 		문자형
 * 		char
 * 		vachar2
 * 		clob =====> String
 * 		날짜형
 * 		date =====>java.util.date
 * 		숫자형
 * 		number(4) ===> 정수
 * 		number(7,2) ==> 실수
 * 		----------------------int,double
 * 		
 */
@Data
public class EmpVO {
	private int empno; //중복없는 데이터
	private String ename;
	private String job;
	private int mgr;
	private Date hiredate;
	private int sal;
	private int comm;
	private int deptno;
}
