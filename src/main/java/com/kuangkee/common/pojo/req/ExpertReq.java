package com.kuangkee.common.pojo.req;

public class ExpertReq {
	
	    private Long id;

	    private Long version;

	    private String phone;

	    private String address;

	    private String agencyShopName;

	    private Integer currStatus;

	    private String name;

	    private String wechat;

	    private Boolean agencyShop;

	    private String lat;

	    private String lng;

	    private Integer price;

	    private Integer cousultTimes;
	    
	    private String info;
	    
	    //Ext info
	    private String tokenId ; //用户tokenId

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getVersion() {
			return version;
		}

		public void setVersion(Long version) {
			this.version = version;
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

		public Integer getCurrStatus() {
			return currStatus;
		}

		public void setCurrStatus(Integer currStatus) {
			this.currStatus = currStatus;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getWechat() {
			return wechat;
		}

		public void setWechat(String wechat) {
			this.wechat = wechat;
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

		public String getTokenId() {
			return tokenId;
		}

		public void setTokenId(String tokenId) {
			this.tokenId = tokenId;
		}
	    
	    
    
}