/*
 * 	프로젝트명(Project name): Dodo - SmartPortal
 * 	버전(Version): 0.1 (시작년도:0 / 시작번호: 1)
 * 	패키지명: com.single.web.filter
 * 	파일명(Filename): SSOFilter.java
 * 	제작일자(Create date): 2020-12-04
 * 	작성자(Author): Dodo (rabbit.white at daum dot net)
 * 	비고(Description)
 * 	1. 신규 작성, 도도(Dodo), 2020-12-04
 * 
 */
package com.single.web.filter;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import com.dodo.framework.util.*;

@WebFilter("*")
public class SSOFilter implements Filter {

	private HashMap<String, Integer> allowUrlList = null;
	
    public void init(FilterConfig fConfig) throws ServletException {
    	allowUrlList = DodoSmileAction.getMemberFilter();
		Integer a = allowUrlList.get("/sso/login.do");
		System.out.println( "번호:" + a );
	}
    
	public void destroy() {
	}

	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
		
		Integer a = allowUrlList.get("/sso/login.do");
		com.dodo.framework.util.FilterResource.runActionFilter(allowUrlList, req, res, chain);
		//chain.doFilter(req, res);
	}

}
