package com.test.sb.vo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
@Data
public class UserVO {
	
	private String uiname;
	private String uiId;
	private String uiPwd;
	private Integer uiAge;
	
	public static void main(String[] ages) {
		UserVO u = new UserVO();
		System.out.println(u);
	}
	
}
