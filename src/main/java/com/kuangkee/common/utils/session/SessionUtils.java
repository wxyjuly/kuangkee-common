package com.kuangkee.common.utils.session ;

import javax.servlet.http.HttpServletRequest;

/**
 * 
 * session 工具类
 *
 */
public final class SessionUtils {
	
	public static Object getSessionValue(HttpServletRequest request, String sessionName) {
		return request.getSession().getAttribute(sessionName) ;
	}

	public static void setSessionValue(HttpServletRequest request, String sessionName,Object sessionVal) {
		request.getSession().setAttribute(sessionName,sessionVal) ;
	} 


}
