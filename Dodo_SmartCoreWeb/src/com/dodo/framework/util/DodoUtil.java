/*
 * 	프로젝트명(Project name): Dodo_SmileAction
 * 	버전(Version): 0.1 (시작년도:0 / 시작번호: 1)
 * 	패키지명: com.dodo.framework.util
 * 	파일명(Filename): DodoUtil.java
 * 	제작일자(Create date): 2020-12-04
 * 	작성자(Author): Dodo (rabbit.white at daum dot net)
 * 	비고(Description)
 * 	1. 신규 작성, 도도(Dodo), 2020-12-04
 * 
 */
package com.dodo.framework.util;

public class DodoUtil {
	
	public static boolean checkResources( String url ) {

		String[] allowResourcesArr = DodoGlobal.allowResourcesArr;
		
		boolean result = false;
		String ext = "";
		int i = 0 ;
		
		//System.out.println(allowResourcesArr.length);
		while ( i < allowResourcesArr.length) {
			
			ext = allowResourcesArr[i];
			
			if ( url.indexOf( ext ) > 1 ) {
				result = true;				
				break;
			}
			
			i++;
		}
			
		return result;
		
	}
	
}
