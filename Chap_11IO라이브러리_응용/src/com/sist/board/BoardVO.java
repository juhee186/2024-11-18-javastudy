package com.sist.board;
import java.io.Serializable;
import java.util.*;

import lombok.Data;
@Data
public class BoardVO implements Serializable {
	private int no;
	private String name;
	private String subject;
	private String content;
	private String pwd;
	private Date regdate;
	private int hit;
	
}
