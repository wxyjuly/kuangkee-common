/**
 * Project Name:kuangkee-common
 * File Name:ExcelTest.java
 * Package Name:com.kuangkee.common.utils.excel.poi.test
 * Date:2018年3月21日下午4:31:54
 * Copyright (c) 2018, 【Leon Xi】 All Rights Reserved.
 *
*/

package com.kuangkee.common.utils.excel.poi.test;
/**
 * ClassName:ExcelTest <br/>
 * Date:     2018年3月21日 下午4:31:54 <br/>
 * @author   Leon Xi
 * @version  v1.0
 * @see
 */

import java.io.IOException;
import java.util.List;

import com.kuangkee.common.utils.excel.poi.ExcelCommon;
import com.kuangkee.common.utils.excel.poi.ReadExcel;
import com.kuangkee.common.utils.excel.poi.vo.Student;

/**
 * @author Hongten
 * @created 2014-5-21
 */
public class ExcelBrandTest {

    public static void main(String[] args) throws IOException {
        String excel2003_2007 = ExcelCommon.STUDENT_INFO_XLS_PATH;
        String excel2010 = ExcelCommon.STUDENT_INFO_XLSX_PATH;
        //卡特
        String BRAND_PATH_PRE = "/cat" ;
        String MID = "MID.xlsx";
        String CID = "CID.xlsx";
        String FMI = "FMI.xlsx";
        
        String path1 = ExcelBrandTest.class.getClassLoader().getResource("").getPath();
        String path2 = ExcelBrandTest.class.getClassLoader().getResource(excel2003_2007).getPath();
        System.out.println(path1);
        System.out.println(path2);
        System.exit(0);
        // read the 2003-2007 excel
        List<Student> list = new ReadExcel().readExcel(path1) ;
        if (list != null) {
            for (Student student : list) {
                System.out.println("No. : " + student.getNo() + ", name : " + student.getName() + ", age : " + student.getAge() + ", score : " + student.getScore());
            }
        }
        System.out.println("======================================");
        // read the 2010 excel
        List<Student> list1 = new ReadExcel().readExcel("");
        if (list1 != null) {
            for (Student student : list1) {
                System.out.println("No. : " + student.getNo() + ", name : " + student.getName() + ", age : " + student.getAge() + ", score : " + student.getScore());
            }
        }
    }
}
