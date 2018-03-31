/**
 * Project Name:kuangkee-common
 * File Name:POICommon.java
 * Package Name:com.kuangkee.common.utils.excel.poi.common
 * Date:2018年3月22日上午9:57:08
 * Copyright (c) 2018, 【Leon Xi】 All Rights Reserved.
 *
*/

package com.kuangkee.common.utils.excel.poi.common;

import com.kuangkee.common.utils.excel.poi.test.ExcelBrandTest;

/**
 * ClassName:POICommon <br/>
 * Date:     2018年3月22日 上午9:57:08 <br/>
 * @author   Leon Xi
 * @version  v1.0
 * @see 	 
 */
public class POICommon {
	//class文件根路径
	public static final String ROOT_PATH = ExcelBrandTest.class.getClassLoader().getResource("").getPath();
	//分隔符
	public static final String SEPARATOR = "@#@" ;
	
	/**
	 * trimNotNoOrAlph: 替换掉除数字，字母以外的值. <br/>
	 * @author Leon Xi
	 * @param str
	 * @return
	 */
	public static String trimNotNoOrAlph(String str) {
		String pattern = "[^0-9a-zA-Z]+" ;  //只保留字母和数字的字符串
		return str.replaceAll(pattern, "") ;
	}
	
	public static void main(String[] args) {
		String str1 = "ABCD@#$+---=-:EEE--==98082" ;
		System.out.println(trimNotNoOrAlph(str1));
	}
	
}

