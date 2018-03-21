/**
 * Project Name:kuangkee-common
 * File Name:ExcelCommon.java
 * Package Name:com.kuangkee.common.utils.excel
 * Date:2018年3月21日下午4:28:10
 * Copyright (c) 2018, 【Leon Xi】 All Rights Reserved.
 *
*/

package com.kuangkee.common.utils.excel.poi;
/**
 * ClassName:ExcelCommon <br/>
 * @Date:     2018年3月21日 下午4:28:10 <br/>
 * @author   Leon Xi
 * @version  v1.0
 * @see 	 
 */
/**
 * @author Hongten
 * @created 2014-5-21
 */
public class ExcelCommon {

    public static final String OFFICE_EXCEL_2003_POSTFIX = "xls";
    public static final String OFFICE_EXCEL_2010_POSTFIX = "xlsx";

    public static final String EMPTY = "";
    public static final String POINT = ".";
    public static final String LIB_PATH = "lib";
    public static final String STUDENT_INFO_XLS_PATH = LIB_PATH + "/student_info" + POINT + OFFICE_EXCEL_2003_POSTFIX;
    public static final String STUDENT_INFO_XLSX_PATH = LIB_PATH + "/student_info" + POINT + OFFICE_EXCEL_2010_POSTFIX;
    public static final String NOT_EXCEL_FILE = " : Not the Excel file!";
    public static final String PROCESSING = "Processing...";

}