/*
 * 	프로젝트명(Project name): Dodo_SmartCoreWeb
 * 	버전(Version): 0.1 (시작년도:0 / 시작번호: 1)
 * 	패키지명: com.dodo.framework.util
 * 	파일명(Filename): DodoGlobal.java
 * 	제작일자(Create date): 2020-12-04
 * 	작성자(Author): Dodo (rabbit.white at daum dot net)
 * 	비고(Description)
 * 	1. 신규 작성, 도도(Dodo), 2020-12-04
 * 
 */
package com.dodo.framework.util;

public class DodoGlobal {

	// 허용 확장자
	public final static String[] allowResourcesArr = {".js", ".css", ".jpg", ".gif", ".svg", ".png"};
	
	// 공통 - 자원
	public final static String resDirection = "/resources/";
	
	// 공통 - 함수
	public final static Integer DODO_INDEX = 1;
	public final static Integer DODO_SSO_LOGIN = 2;
	public final static Integer DODO_SSO_LOGOUT = 3;
	public final static Integer DODO_SSO_PROCESS = 4;
	
}