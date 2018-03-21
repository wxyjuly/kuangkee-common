/**
 * Project Name:kuangkee-common
 * File Name:Util.java
 * Package Name:com.kuangkee.common.utils.excel.poi
 * Date:2018年3月21日下午4:32:36
 * Copyright (c) 2018, 【Leon Xi】 All Rights Reserved.
 *
*/

package com.kuangkee.common.utils.excel.poi;
/**
 * ClassName:Util <br/>
 * Date:     2018年3月21日 下午4:32:36 <br/>
 * @author   Leon Xi
 * @version  v1.0
 * @see 	 
 */

public class Util {

    /**
     * get postfix of the path
     * @param path
     * @return
     */
    public static String getPostfix(String path) {
        if (path == null || ExcelCommon.EMPTY.equals(path.trim())) {
            return ExcelCommon.EMPTY;
        }
        if (path.contains(ExcelCommon.POINT)) {
            return path.substring(path.lastIndexOf(ExcelCommon.POINT) + 1, path.length());
        }
        return ExcelCommon.EMPTY;
    }
}