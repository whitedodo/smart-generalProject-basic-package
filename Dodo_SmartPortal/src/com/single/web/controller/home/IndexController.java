/*
 * 	프로젝트명(Project name): Dodo - SmartPortal
 * 	버전(Version): 0.1 (시작년도:0 / 시작번호: 1)
 * 	패키지명: com.single.web.controller.index
 * 	파일명(Filename): IndexController.java
 * 	제작일자(Create date): 2020-12-04
 * 	작성자(Author): Dodo (rabbit.white at daum dot net)
 * 	비고(Description)
 * 	1. 신규 작성, 도도(Dodo), 2020-12-04
 * 
 */
package com.single.web.controller.home;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.single.web.controller.Controller;

public class IndexController implements Controller {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		//HttpUtil.forward(req, res, "/WEB-INF/views/index.jsp");
		
	}

}
