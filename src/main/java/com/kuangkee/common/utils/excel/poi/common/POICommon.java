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
	
}

