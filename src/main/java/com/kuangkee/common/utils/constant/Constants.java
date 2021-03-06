package com.kuangkee.common.utils.constant;

/**
 * 系统常量
 * ClassName: Constants <br/>
 * date: 2018年1月7日 下午9:08:49 <br/>
 * @author Leon Xi
 * @version v1.0
 */
public class Constants {
	
	public static final class KuangKeeResultConst {
		
		public static final Integer SUC_CODE = 000000 ; //成功
		
		public static final Integer ERROR_CODE = 999999 ; //失败
		
		public static final Integer PARAM_ERROR_CODE = 111111 ; //
		
		public static final String DB_INSERT_ERROR_MSG = "数据库插入失败!" ; 
		
		public static final String DB_UPDATE_ERROR_MSG = "数据库更新失败!" ;
		
		public static final String DB_QUERY_ERROR_MSG = "数据库查询失败!" ;
		
		public static final String DB_QUERY_EMPTY_MSG = "数据库查询无数据!" ;

		public static final String INPUT_PARAM_ERROR = "入参有误!" ;
		
		public static final String USER_LOGGING_ERROR = "用户登陆信息有误!" ;
	}

	public static final class SysConstant {
		public static final String ACOUNT = "account" ; //session中的user值
	}
	
	
}
