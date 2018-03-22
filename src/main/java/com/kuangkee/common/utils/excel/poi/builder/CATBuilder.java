/**
 * Project Name:kuangkee-common
 * File Name:CATBuilder.java
 * Package Name:com.kuangkee.common.utils.excel.poi.builder
 * Date:2018年3月22日上午9:27:07
 * Copyright (c) 2018, 【Leon Xi】 All Rights Reserved.
 *
*/

package com.kuangkee.common.utils.excel.poi.builder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.kuangkee.common.utils.excel.poi.ReadImportExcel;
import com.kuangkee.common.utils.excel.poi.common.POICommon;
import com.kuangkee.common.utils.excel.poi.vo.BrandArticleImportBean;

/**
 * ClassName:CATBuilder <br/>
 * Date:     2018年3月22日 上午9:27:07 <br/>
 * @author   Leon Xi
 * @version  v1.0
 * @see 
 * // 完成卡特的代码构建	 
 */
public class CATBuilder {
	
	private static final String BRAND_ID = "2" ;  //品牌ID
	
	private static final String BRAND_NAME = "卡特" ; //品牌名称
	
	//卡特
	private static final String PRE_BRAND_PATH = "brand/cat/" ; //前置路径
	private static final String MID = "MID.xlsx";  // 1st part
	private static final String CID = "CID.xlsx";  // 2nd part
	private static final String FMI = "FMI.xlsx";  // 3rd part
	
	//获取路径
	private static final String MID_EXCEL_PATH = POICommon.ROOT_PATH + PRE_BRAND_PATH + MID ;
	private static final String CID_EXCEL_PATH = POICommon.ROOT_PATH + PRE_BRAND_PATH + CID ;
	private static final String FMI_EXCEL_PATH = POICommon.ROOT_PATH + PRE_BRAND_PATH + FMI ;
	
	private static final int MAX_INIT_BEAN_SIZE = 200000 ; 
	
	//通过导入Bean获取路径
	public static List<BrandArticleImportBean> getImportBeanByPath(String path) throws IOException {
		List<BrandArticleImportBean> beans = new ReadImportExcel().readExcel(path) ;
		return beans ;
	}
    
	/**
	 * buildCatBean:构建全部数据. <br/>
	 * @author Leon Xi
	 * @return
	 * @throws IOException
	 */
	public static List<BrandArticleImportBean> buildCatBean() throws IOException {
		
		int tmpMaxIdLen = 0 ;  //计算id最大长度
		int tmpMaxContentLen = 0 ; //计算内容最大长度
		
		List<BrandArticleImportBean> MIDBeans = null ;
		List<BrandArticleImportBean> CIDBeans = null ;
		List<BrandArticleImportBean> FMIBeans = null ;
		//获取三个Bean的Excel数据
		MIDBeans = getImportBeanByPath(MID_EXCEL_PATH) ;
		CIDBeans = getImportBeanByPath(CID_EXCEL_PATH) ;
		FMIBeans = getImportBeanByPath(FMI_EXCEL_PATH) ;
		
System.err.println("MIDBeans->" + MIDBeans.size());
System.err.println("CIDBeans->" + CIDBeans.size());
System.err.println("FMIBeans->" + FMIBeans.size());
System.out.println("FMIBeans count->"+ MIDBeans.size() * FMIBeans.size() * CIDBeans.size() );

		int excelPlusCnt = MIDBeans.size() * FMIBeans.size() * CIDBeans.size() ;
//		System.exit(0);
		BrandArticleImportBean buildBean = null ;
		// 循环遍历生成数据
		String errorCode = null ;
		String title = null ;
		
		int beanInitLen = 0 ;
		if (excelPlusCnt > MAX_INIT_BEAN_SIZE) {
			beanInitLen = MAX_INIT_BEAN_SIZE ;
		} else {
			beanInitLen = excelPlusCnt;
		}
		
		int loopCnt = excelPlusCnt / MAX_INIT_BEAN_SIZE + 1 ;    //循环次数
		int lastDataSize = excelPlusCnt % MAX_INIT_BEAN_SIZE ;  //最后一次数据大小
		List<BrandArticleImportBean> buildBeans = null ;
		
System.err.println("dataCnt:" + excelPlusCnt + ";loopTime:"+loopCnt+";lastDataSize:"+lastDataSize);
		
		int arrayListLoopCnt = 0 ; //计数器
		int clearCnt = 0 ; // ArrayList清除操作
		
			buildBeans = new ArrayList<>(beanInitLen) ;
			for (BrandArticleImportBean midBean : MIDBeans) {
				for (BrandArticleImportBean cidBean : CIDBeans) {
					for (BrandArticleImportBean fmiBean : FMIBeans) {
						
						if(arrayListLoopCnt == beanInitLen) {
							arrayListLoopCnt = 0 ; //重置
							clearCnt ++ ;
System.out.println("---循环次数["+loopCnt+"]-----clear:" + clearCnt +"--beanInitLen:"+beanInitLen+"--");
							buildBeans.clear(); 
							//:TODO 触发插入数据库动作@20180322
							
						}
						buildBean = new BrandArticleImportBean() ;
						
						errorCode = midBean.getErrorCode() + POICommon.SEPARATOR + 
								cidBean.getErrorCode() + POICommon.SEPARATOR 
								+ fmiBean.getErrorCode() ;
						buildBean.setErrorCode(errorCode); //拼接Id
						
						title = midBean.getTitle() + POICommon.SEPARATOR + 
								cidBean.getTitle() + POICommon.SEPARATOR
								+ fmiBean.getTitle() ; //拼接错误编码
						buildBean.setTitle(title);
						
						//count Max length
						if(tmpMaxIdLen < errorCode.length()) {
							tmpMaxIdLen = errorCode.length() ;
						}
						if(tmpMaxContentLen < title.length()) {
							tmpMaxContentLen = title.length() ;
						}
						
						buildBeans.add(buildBean) ;
						arrayListLoopCnt++ ;
					}
				}
			}
			
//		}
System.out.println("tmpMaxIdLen:"+tmpMaxIdLen+";tmpMaxContentLen:"+tmpMaxContentLen);
		return buildBeans ;
	}
	
	public static void main(String[] args) {
		try {
			long startTime = System.currentTimeMillis() ;
			List<BrandArticleImportBean> results = buildCatBean() ;
			long end = System.currentTimeMillis() ;
			System.err.println("->timelaspe:" + (end-startTime)/1000 + "s");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}

