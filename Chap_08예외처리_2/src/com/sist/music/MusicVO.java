package com.sist.music;

import lombok.Data;

//캡슐화 => 데이터보호 (데이터를 모아서 전송할 목적)
@Data
public class MusicVO {
	private String title;
	private String singer;
	private String album;
	// 사용자연결
	

}
