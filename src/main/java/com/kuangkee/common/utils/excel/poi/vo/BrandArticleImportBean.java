
package com.kuangkee.common.utils.excel.poi.vo ;
/**
 * ClassName:BrandArticleImportBean <br/>
 * Date:     2018年3月21日 下午4:33:44 <br/>
 * @author   Leon Xi
 * @version  v1.0
 * @see 	 
 */

public class BrandArticleImportBean {
    /**
     * error_code   错误编码,trim后的错误编码
     */
    private String errorCode ;
    
    /**
     * errorCodeOriginal  原始的错误编码
     */
    private String errorCodeOriginal ;
    /**
     *  错误编码说明
     */
    private String title ;
    
    /**
     * 部位编码：
     * cat（卡特）组成： MID(1),CID(2),FMI(3)
     * volvo沃尔沃组成: MID(1):SIDPID(2):FMI(3)
     */
    private String partId ;
    
    private String brandId ;
    
    private String BrandName ;

	public String getErrorCodeOriginal() {
		return errorCodeOriginal;
	}

	public void setErrorCodeOriginal(String errorCodeOriginal) {
		this.errorCodeOriginal = errorCodeOriginal;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPartId() {
		return partId;
	}

	public void setPartId(String partId) {
		this.partId = partId;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getBrandId() {
		return brandId;
	}

	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return BrandName;
	}

	public void setBrandName(String brandName) {
		BrandName = brandName;
	}

	@Override
	public String toString() {
		return "BrandArticleImportBean [errorCode=" + errorCode + ", title=" + title + ", partId=" + partId
				+ ", brandId=" + brandId + ", BrandName=" + BrandName + "]";
	}


}