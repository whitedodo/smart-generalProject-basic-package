/*
 * 	프로젝트명(Project name): Dodo_SmileAction
 * 	버전(Version): 0.1 (시작년도:0 / 시작번호: 1)
 * 	패키지명: com.dodo.framework.util
 * 	파일명(Filename): DodoSmileAction.java
 * 	제작일자(Create date): 2020-12-04
 * 	작성자(Author): Dodo (rabbit.white at daum dot net)
 * 	비고(Description)
 * 	1. 신규 작성, 도도(Dodo), 2020-12-04
 * 
 */
package com.dodo.framework.util;

import java.util.HashMap;
import java.util.Map;

public class DodoSmileAction {

	public static Map<String, Integer> getUrlMap(){

		Map<String, Integer> list = new HashMap<String, Integer>();
		
		list.put("/index.do", DodoGlobal.DODO_INDEX );
		list.put("/sso/login.do", DodoGlobal.DODO_SSO_LOGIN );
		list.put("/sso/logout.do", DodoGlobal.DODO_SSO_LOGOUT  );
		list.put("/sso/process.do", DodoGlobal.DODO_SSO_PROCESS );
		
		return list;
	}

	public static HashMap<String, Integer> getMemberFilter() {

		HashMap<String, Integer> allowUrlList = new HashMap<String, Integer>();
    	String res = DodoGlobal.resDirection;
		
    	// 허용 URL List
    	allowUrlList.put("/", 1);
    	allowUrlList.put("/sso/login.do", 1);
    	allowUrlList.put("/sso/logout.do", 1);
    	allowUrlList.put("/sso/process.do", 1);	
    	allowUrlList.put(res, 1);
		
    	return allowUrlList;
    	
	}
	
}