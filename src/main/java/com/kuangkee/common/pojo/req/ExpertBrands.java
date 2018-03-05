package com.kuangkee.common.pojo.req ;

public class ExpertBrands {
	
    private Long id; //专家id
    
    private Long brandId; //brandId
    
    private String brandName; //brandName

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getBrandId() {
		return brandId;
	}

	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

}