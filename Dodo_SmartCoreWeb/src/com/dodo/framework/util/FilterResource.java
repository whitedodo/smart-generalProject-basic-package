/*
 * 	프로젝트명(Project name): Dodo_SmileAction
 * 	버전(Version): 0.1 (시작년도:0 / 시작번호: 1)
 * 	패키지명: com.dodo.framework.util
 * 	파일명(Filename): FilterResource.java
 * 	제작일자(Create date): 2020-12-04
 * 	작성자(Author): Dodo (rabbit.white at daum dot net)
 * 	비고(Description)
 * 	1. 신규 작성, 도도(Dodo), 2020-12-04
 * 
 */
package com.dodo.framework.util;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FilterResource {
	
	public static void runActionFilter(HashMap<String, Integer> allowUrlList, 
			ServletRequest req, ServletResponse res, FilterChain chain) 
			throws IOException, ServletException {

		String resDirection = DodoGlobal.resDirection;

		HttpServletRequest hReq = (HttpServletRequest)req;
		HttpServletResponse hRes = (HttpServletResponse)res;
		
		HttpSession session = hReq.getSession();
		
		boolean chkResource = false;
		int retUrl = -1;
		
		String url = hReq.getRequestURI();
		String contextPath = hReq.getContextPath();
//		String path = url.substring(contextPath.length() );
		String cusUrl = url.replace(contextPath, "");
		
		Object loginSession = null;
		
		//System.out.println("p" + cusUrl);
		
		// 유효 필터 주소값 가져오기
		if ( allowUrlList.get(cusUrl) != null ) {
			retUrl = allowUrlList.get(cusUrl);
		}
		if ( cusUrl.indexOf(resDirection) > 1 ) {
			retUrl = allowUrlList.get(cusUrl);
		}
		
		// 세션 정보 읽기
		if ( session != null ) {
			loginSession = session.getAttribute("login");
		}
		
		//System.out.println("retUrl:" + retUrl + "/" + cusUrl);
		//System.out.print("[][" + session + "/" + session.getAttribute("login"));
		//System.out.println("/" + retUrl + "/" + cusUrl.indexOf("login.do"));
		
		// 유효 범위 내에 있을 때
		if ( retUrl == 1 ) {
			
			if ( cusUrl.equals("/") && loginSession == null ) {
				hRes.sendRedirect(contextPath + "/sso/login.do");
			}else {
				req.setAttribute("resources", "false");
				chain.doFilter(req, res);
			}
			
		}else {
			
			if ( loginSession != null ) {
				req.setAttribute("resources", "false");
				chain.doFilter(req, res);
			}else if (cusUrl.indexOf("resources") > -1){
				req.setAttribute("resources", "false");
				chain.doFilter(req, res);
			}else {
				hRes.sendRedirect(contextPath + "/sso/login.do");
			}
			
			// Resource 파일은 예외처리
			chkResource = DodoUtil.checkResources( cusUrl );
			
			if ( chkResource == true ) {
				req.setAttribute("resources", chkResource);
				chain.doFilter(req, res);
			}
			else {
				req.setAttribute("resources", "false");
				chain.doFilter(req, res);
			}
			
		}
		
	} // end of filter
	
}
