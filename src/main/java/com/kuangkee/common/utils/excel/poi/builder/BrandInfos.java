/**
 * Project Name:kuangkee-common
 * File Name:BrandInfos.java
 * Package Name:com.kuangkee.common.utils.excel.poi.builder
 * Date:2018年3月26日下午5:41:18
 * Copyright (c) 2018, 【Leon Xi】 All Rights Reserved.
 *
*/

package com.kuangkee.common.utils.excel.poi.builder;
/**
 * ClassName:BrandInfos <br/>
 * Date:     2018年3月26日 下午5:41:18 <br/>
 * @author   Leon Xi
 * @version  v1.0
 * @see 	 
 */
public class BrandInfos {
	
	private String brandId ; //
	
	private String brandName ;
	
	private String brandPath ;

	public BrandInfos(String brandId, String brandName, String brandPath) {
		this.brandId = brandId;
		this.brandName = brandName;
		this.brandPath = brandPath;
	}
	
	

	public BrandInfos() {
	}



	public String getBrandId() {
		return brandId;
	}

	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getBrandPath() {
		return brandPath;
	}

	public void setBrandPath(String brandPath) {
		this.brandPath = brandPath;
	}

	public BrandInfos generateBrandInfosByBrand(String brand) {
		switch(brand) {
			case OneBrandBuilder.BRAND_DOUSHAN_ID:
				return new BrandInfos(OneBrandBuilder.BRAND_DOUSHAN_ID,
					OneBrandBuilder.BRAND_DOUSHAN_NAME,
					OneBrandBuilder.BRAND_DOUSHAN_PATH) ;
				
			case OneBrandBuilder.BRAND_JIATENG_ID:
				return new BrandInfos(OneBrandBuilder.BRAND_JIATENG_ID,
					OneBrandBuilder.BRAND_JIATENG_NAME,
					OneBrandBuilder.BRAND_JIATENG_PATH) ;
				
			case OneBrandBuilder.BRAND_KAISI_ID:
				return new BrandInfos(OneBrandBuilder.BRAND_KAISI_ID,
					OneBrandBuilder.BRAND_KAISI_NAME,
					OneBrandBuilder.BRAND_KAISI_PATH) ;	
				
			case OneBrandBuilder.BRAND_KANGMINGSI_ID:
				return new BrandInfos(OneBrandBuilder.BRAND_KANGMINGSI_ID,
						OneBrandBuilder.BRAND_KANGMINGSI_NAME,
						OneBrandBuilder.BRAND_KANGMINGSI_PATH) ;	
				
			case OneBrandBuilder.BRAND_RILI_ID:
				return new BrandInfos(OneBrandBuilder.BRAND_RILI_ID,
						OneBrandBuilder.BRAND_RILI_NAME,
						OneBrandBuilder.BRAND_RILI_PATH) ;	
				
			case OneBrandBuilder.BRAND_SANYI_ID:
				return new BrandInfos(OneBrandBuilder.BRAND_SANYI_ID,
						OneBrandBuilder.BRAND_SANYI_NAME,
						OneBrandBuilder.BRAND_SANYI_PATH) ;	
				
			case OneBrandBuilder.BRAND_SHENGGANG_ID:
				return new BrandInfos(OneBrandBuilder.BRAND_SHENGGANG_ID,
						OneBrandBuilder.BRAND_SHENGGANG_NAME,
						OneBrandBuilder.BRAND_SHENGGANG_PATH) ;	
				
			case OneBrandBuilder.BRAND_XIANDAI_ID:
				return new BrandInfos(OneBrandBuilder.BRAND_XIANDAI_ID,
						OneBrandBuilder.BRAND_XIANDAI_NAME,
						OneBrandBuilder.BRAND_XIANDAI_PATH) ;	
				
			case OneBrandBuilder.BRAND_XIAOSONG_ID:
				return new BrandInfos(OneBrandBuilder.BRAND_XIAOSONG_ID,
						OneBrandBuilder.BRAND_XIAOSONG_NAME,
						OneBrandBuilder.BRAND_XIAOSONG_PATH) ;
				
			case OneBrandBuilder.BRAND_XUGONG_ID:
				return new BrandInfos(OneBrandBuilder.BRAND_XUGONG_ID,
						OneBrandBuilder.BRAND_XUGONG_NAME,
						OneBrandBuilder.BRAND_XUGONG_PATH) ;		
				
			case OneBrandBuilder.BRAND_ZHUYOU_ID:
				return new BrandInfos(OneBrandBuilder.BRAND_ZHUYOU_ID,
						OneBrandBuilder.BRAND_ZHUYOU_NAME,
						OneBrandBuilder.BRAND_ZHUYOU_PATH) ;	
				
				
		}
		return null;
	}
}

