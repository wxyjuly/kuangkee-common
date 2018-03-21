package com.kuangkee.common.pojo.resp;

import java.util.List;

import com.kuangkee.common.pojo.req.ExpertBrands;

public class ExpertResp {
    private Long id;

    private String phone;

    private String address;

    private String agencyShopName;

    private String name;

    private Boolean agencyShop;

    private String lat;

    private String lng;

    private Integer price;

    private Integer cousultTimes;

    private String info ;
    
    private String distance ;  //保存当前用户、与专家距离
    
    List<ExpertBrands> expertBrands ;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAgencyShopName() {
		return agencyShopName;
	}

	public void setAgencyShopName(String agencyShopName) {
		this.agencyShopName = agencyShopName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getAgencyShop() {
		return agencyShop;
	}

	public void setAgencyShop(Boolean agencyShop) {
		this.agencyShop = agencyShop;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLng() {
		return lng;
	}

	public void setLng(String lng) {
		this.lng = lng;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getCousultTimes() {
		return cousultTimes;
	}

	public void setCousultTimes(Integer cousultTimes) {
		this.cousultTimes = cousultTimes;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public List<ExpertBrands> getExpertBrands() {
		return expertBrands;
	}

	public void setExpertBrands(List<ExpertBrands> expertBrands) {
		this.expertBrands = expertBrands;
	}

	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}
    
}