package com.sist.main;
/*
 * 	예외처리
 *  -----
 *   => 개발자 실수, 사용자 입력이 잘못된 경우, 시스템...
 *   => 소스상에서 수정이 가능한 에러
 *   	----------------------
 *   
 *   형식)
 *   	try
 *   	{
 *   		정상 실행 문장
 *   		=> 오류 발생
 *   	}catch(예상되는 예외클래스) => 순서가 존재
 *   	{
 *   		오류에 대한 확인
 *   		-----------
 *   		sysout(e.getMessage())
 *   		=> 에러메세지만 출력
 *   		e.printStackTrace()
 *   		=> 실행하는 순서 => 에러위치 확인(권장)
 *   	}
 *   	}catch(예상되는 예외클래스)
 *   	{
 *   		=> 에러복구 => return;
 *   	}
 *   	}catch(예상되는 예외클래스)
 *   	{
 *   		
 *   	}
 *   	finally
 *   	{
 *   		=> try/catch => 상관없이 수행
 *   		=> 파일 닫기
 *   		=> 오라클 연결 해제
 *   		=> 서버 연결 종료
 *   	}
 *   
 *   	종료하는 프로그램
 *   
 *   	=> try~catch~finally
 *   
 */
// CheckException

public class 예외처리_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
