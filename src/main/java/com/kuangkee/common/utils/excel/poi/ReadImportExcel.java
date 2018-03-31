
package com.kuangkee.common.utils.excel.poi;
/**
 * ClassName:ReadImportExcel <br/>
 * Date:     2018年3月21日 下午4:30:17 <br/>
 * @author   Leon Xi
 * @version  v1.0
 * @see 	 http://www.cnblogs.com/hongten/p/java_poi_excel_xls_xlsx.html
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.kuangkee.common.utils.check.MatchUtil;
import com.kuangkee.common.utils.excel.poi.vo.BrandArticleImportBean;

public class ReadImportExcel {
	
	/**
	 * readExcel:. <br/>
	 * read the Excel file
	 * @author Leon Xi
	 * @param path
	 * @param isTrimCode : false：不截取值；true:截取值
	 * @return
	 * @throws IOException
	 */
    public List<BrandArticleImportBean> readExcel(String path, boolean isTrimCode) throws IOException {
        if (path == null || ExcelCommon.EMPTY.equals(path)) {
            return null;
        } else {
            String postfix = Util.getPostfix(path);
            if (!ExcelCommon.EMPTY.equals(postfix)) {
                if (ExcelCommon.OFFICE_EXCEL_2003_POSTFIX.equals(postfix)) {
                    return readXls(path);
                } else if (ExcelCommon.OFFICE_EXCEL_2010_POSTFIX.equals(postfix)) {
                    return readXlsx(path);
                }
            } else {
                System.out.println(path + ExcelCommon.NOT_EXCEL_FILE);
            }
        }
        return null;
    }
    
    /**
     * read the Excel file
     * @param path the path of the Excel file
     * @return
     * @throws IOException
     */
    public List<BrandArticleImportBean> readExcel(String path) throws IOException {
        if (path == null || ExcelCommon.EMPTY.equals(path)) {
            return null;
        } else {
            String postfix = Util.getPostfix(path);
            if (!ExcelCommon.EMPTY.equals(postfix)) {
                if (ExcelCommon.OFFICE_EXCEL_2003_POSTFIX.equals(postfix)) {
                    return readXls(path);
                } else if (ExcelCommon.OFFICE_EXCEL_2010_POSTFIX.equals(postfix)) {
                    return readXlsx(path);
                }
            } else {
                System.out.println(path + ExcelCommon.NOT_EXCEL_FILE);
            }
        }
        return null;
    }

    /**
     * Read the Excel 2010
     * @param path the path of the excel file
     * @return
     * @throws IOException
     */
    public List<BrandArticleImportBean> readXlsx(String path) throws IOException {
        System.out.println(ExcelCommon.PROCESSING + path);
        InputStream is = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(is);
        BrandArticleImportBean bean = null;
        List<BrandArticleImportBean> list = new ArrayList<BrandArticleImportBean>();
        // Read the Sheet
        for (int numSheet = 0; numSheet < xssfWorkbook.getNumberOfSheets(); numSheet++) {
            XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(numSheet);
            if (xssfSheet == null) {
                continue;
            }
            // Read the Row
            for (int rowNum = 1; rowNum <= xssfSheet.getLastRowNum(); rowNum++) {
                XSSFRow xssfRow = xssfSheet.getRow(rowNum);
                if (xssfRow != null) {
                    bean= new BrandArticleImportBean();
                    XSSFCell errorCode = xssfRow.getCell(0);
                    XSSFCell title = xssfRow.getCell(1);
                    
                    bean.setErrorCode(getValue(errorCode));
                    bean.setErrorCodeOriginal(getValue(errorCode));
                    bean.setTitle(getValue(title));
                    
                    list.add(bean);
                }
            }
        }
        return list;
    }

    /**
     * Read the Excel 2003-2007
     * @param path the path of the Excel
     * @return
     * @throws IOException
     */
    public List<BrandArticleImportBean> readXls(String path) throws IOException {
        System.out.println(ExcelCommon.PROCESSING + path);
        InputStream is = new FileInputStream(path);
        HSSFWorkbook hssfWorkbook = new HSSFWorkbook(is);
        BrandArticleImportBean bean = null;
        List<BrandArticleImportBean> list = new ArrayList<BrandArticleImportBean>();
        // Read the Sheet
        for (int numSheet = 0; numSheet < hssfWorkbook.getNumberOfSheets(); numSheet++) {
            HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(numSheet);
            if (hssfSheet == null) {
                continue;
            }
            // Read the Row
            for (int rowNum = 1; rowNum <= hssfSheet.getLastRowNum(); rowNum++) {
                HSSFRow hssfRow = hssfSheet.getRow(rowNum);
                if (hssfRow != null) {
                    bean= new BrandArticleImportBean();
                    HSSFCell errorCode = hssfRow.getCell(0);
                    HSSFCell title = hssfRow.getCell(1);
                    
                    bean.setErrorCode(getValue(errorCode));
                    bean.setErrorCodeOriginal(getValue(errorCode));
                    bean.setTitle(getValue(title));
                    
                    list.add(bean);
                }
            }
        }
        return list;
    }

    @SuppressWarnings("static-access")
    private String getValue(XSSFCell xssfRow) {
    	if(MatchUtil.isEmpty(xssfRow)) {
    		return "" ;
    	}
        if (xssfRow.getCellType() == xssfRow.CELL_TYPE_BOOLEAN) {
            return String.valueOf(xssfRow.getBooleanCellValue());
        } else if (xssfRow.getCellType() == xssfRow.CELL_TYPE_NUMERIC) {
            return String.valueOf((int)xssfRow.getNumericCellValue());
        } else {
            return String.valueOf(xssfRow.getStringCellValue());
        }
    }

    @SuppressWarnings("static-access")
    private String getValue(HSSFCell hssfCell) {
    	if(MatchUtil.isEmpty(hssfCell)) {
    		return "" ;
    	}
        if (hssfCell.getCellType() == hssfCell.CELL_TYPE_BOOLEAN) {
            return String.valueOf(hssfCell.getBooleanCellValue());
        } else if (hssfCell.getCellType() == hssfCell.CELL_TYPE_NUMERIC) {
            return String.valueOf((int)hssfCell.getNumericCellValue());
        } else {
            return String.valueOf(hssfCell.getStringCellValue());
        }
    }
}