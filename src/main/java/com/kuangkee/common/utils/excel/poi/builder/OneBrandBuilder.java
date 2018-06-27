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
import java.util.List;

import com.kuangkee.common.utils.excel.poi.ReadImportExcel;
import com.kuangkee.common.utils.excel.poi.common.POICommon;
import com.kuangkee.common.utils.excel.poi.vo.BrandArticleImportBean;

/**
 * ClassName:OneBrandBuilder <br/>
 * Date:     2018年3月22日 上午9:27:07 <br/>
 * @author   Leon Xi
 * @version  v1.0
 * @see 
 * // 完成单一品牌的构建错误编码导入	 
 */
public class OneBrandBuilder {
	
	private static final String PRE_BRAND_PATH = "brand/onebrand/" ; //前置路径
	public static final int MAX_INIT_BEAN_SIZE = 200000 ; 
	//单个品牌数据
	private static final String BRAND_DOUSHAN_FILE_PATH = "doushan.xls" ; 
	public static final String BRAND_DOUSHAN_PATH = POICommon.ROOT_PATH + PRE_BRAND_PATH + BRAND_DOUSHAN_FILE_PATH ;
	public static final String BRAND_DOUSHAN_ID = "11" ;  //品牌ID
	public static final String BRAND_DOUSHAN_NAME = "斗山" ; //品牌名称
	
	private static final String BRAND_JIATENG_FILE_PATH = "jiateng.xls" ; 
	public static final String BRAND_JIATENG_PATH = POICommon.ROOT_PATH + PRE_BRAND_PATH + BRAND_JIATENG_FILE_PATH ;
	public static final String BRAND_JIATENG_ID = "6" ;  //品牌ID
	public static final String BRAND_JIATENG_NAME = "加藤" ; //品牌名称

	private static final String BRAND_KAISI_FILE_PATH = "kaisi.xls" ; 
	public static final String BRAND_KAISI_PATH = POICommon.ROOT_PATH + PRE_BRAND_PATH + BRAND_KAISI_FILE_PATH ;
	public static final String BRAND_KAISI_ID = "9" ;  //品牌ID
	public static final String BRAND_KAISI_NAME = "凯斯" ; //品牌名称
	
	private static final String BRAND_KANGMINGSI_FILE_PATH = "kangmingsi.xls" ; 
	public static final String BRAND_KANGMINGSI_PATH = POICommon.ROOT_PATH + PRE_BRAND_PATH + BRAND_KANGMINGSI_FILE_PATH ;
	public static final String BRAND_KANGMINGSI_ID = "14" ;  //品牌ID
	public static final String BRAND_KANGMINGSI_NAME = "康明斯" ; //品牌名称

	private static final String BRAND_RILI_FILE_PATH = "rili.xls" ; 
	public static final String BRAND_RILI_PATH = POICommon.ROOT_PATH + PRE_BRAND_PATH + BRAND_RILI_FILE_PATH ;
	public static final String BRAND_RILI_ID = "3" ;  //品牌ID
	public static final String BRAND_RILI_NAME = "日立" ; //品牌名称

	private static final String BRAND_SANYI_FILE_PATH = "sanyi.xls" ; 
	public static final String BRAND_SANYI_PATH = POICommon.ROOT_PATH + PRE_BRAND_PATH + BRAND_SANYI_FILE_PATH ;
	public static final String BRAND_SANYI_ID = "5" ;  //品牌ID
	public static final String BRAND_SANYI_NAME = "三一" ; //品牌名称
	
	private static final String BRAND_SHENGGANG_FILE_PATH = "shenggang.xls" ; 
	public static final String BRAND_SHENGGANG_ID = "4" ;  //品牌ID
	public static final String BRAND_SHENGGANG_NAME = "神钢" ; //品牌名称
	public static final String BRAND_SHENGGANG_PATH = POICommon.ROOT_PATH + PRE_BRAND_PATH + BRAND_SHENGGANG_FILE_PATH ;
	
	private static final String BRAND_XIANDAI_FILE_PATH = "xiandai.xls" ; 
	public static final String BRAND_XIANDAI_ID = "8" ;  //品牌ID
	public static final String BRAND_XIANDAI_NAME = "现代" ; //品牌名称
	public static final String BRAND_XIANDAI_PATH = POICommon.ROOT_PATH + PRE_BRAND_PATH + BRAND_XIANDAI_FILE_PATH ;
	
	private static final String BRAND_XIAOSONG_FILE_PATH = "xiaosong.xls" ; 
	public static final String BRAND_XIAOSONG_ID = "1" ;  //品牌ID
	public static final String BRAND_XIAOSONG_NAME = "小松" ; //品牌名称
	public static final String BRAND_XIAOSONG_PATH = POICommon.ROOT_PATH + PRE_BRAND_PATH + BRAND_XIAOSONG_FILE_PATH ;
	
	private static final String BRAND_XUGONG_FILE_PATH = "xugong.xls" ; 
	public static final String BRAND_XUGONG_ID = "12" ;  //品牌ID
	public static final String BRAND_XUGONG_NAME = "徐工" ; //品牌名称
	public static final String BRAND_XUGONG_PATH = POICommon.ROOT_PATH + PRE_BRAND_PATH + BRAND_XUGONG_FILE_PATH ;
	
	private static final String BRAND_ZHUYOU_FILE_PATH = "zhuyou.xls" ; 
	public static final String BRAND_ZHUYOU_ID = "7" ;  //品牌ID
	public static final String BRAND_ZHUYOU_NAME = "住友" ; //品牌名称
	public static final String BRAND_ZHUYOU_PATH = POICommon.ROOT_PATH + PRE_BRAND_PATH + BRAND_ZHUYOU_FILE_PATH ;
	
	//通过导入Bean获取路径
	public static List<BrandArticleImportBean> getImportBeanByPath(String path) throws IOException {
		List<BrandArticleImportBean> beans = new ReadImportExcel().readExcel(path) ;
		return beans ;
	}
	
//	@Test
	public void testBrandXiaoSong() throws IOException {
		List<BrandArticleImportBean> results = getImportBeanByPath(BRAND_XIAOSONG_FILE_PATH) ;
		System.out.println(results);
	}
}

