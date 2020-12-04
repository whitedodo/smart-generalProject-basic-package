/*
 * 	프로젝트명(Project name): Dodo - SmartPortal
 * 	버전(Version): 0.1 (시작년도:0 / 시작번호: 1)
 * 	패키지명: com.single.web.controller
 * 	파일명(Filename): FrontController.java
 * 	제작일자(Create date): 2020-12-04
 * 	작성자(Author): Dodo (rabbit.white at daum dot net)
 * 	비고(Description)
 * 	1. 신규 작성, 도도(Dodo), 2020-12-04
 * 
 */
package com.single.web.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@Override
	public void init(ServletConfig config) throws ServletException {

	}

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doAction(req, res, "GET");	
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doAction(req, res, "POST");
	}
	
	protected void doAction(HttpServletRequest req, HttpServletResponse res, String path)throws ServletException, IOException {
		
		String uri = req.getRequestURI();
		String contextPath = req.getContextPath();
		
		String command = uri.substring(contextPath.length());
		
		System.out.println(command);
		
		/*Controller subController = list.get(command);
		subController.execute(req, res);*/
		
	}

}
