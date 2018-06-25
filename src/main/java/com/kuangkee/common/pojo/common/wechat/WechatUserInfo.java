/**
 * Project Name:kuangkee-search
 * File Name:WechatUserInfo.java
 * Package Name:com.kuangkee.search.pojo.vo
 * Date:2018年6月22日上午9:32:04
 * Copyright (c) 2018, 【Leon Xi】 All Rights Reserved.
 *
*/

package com.kuangkee.common.pojo.common.wechat;
/**
 * ClassName:WechatUserInfo <br/>
 * Date:     2018年6月22日 上午9:32:04 <br/>
 * @author   Leon Xi
 * @version  v1.0
 * @see 	 
 */
public class WechatUserInfo {
	
	private String subscribe ;
	
	private String openId ;
	
	private String nickName ;
	
	private String sex ;
	
	private String language ;
	
	private String city ;
	
	private String province ;
	
	private String country ;
	
	private String headImgUrl ;
	
	private String subscribeTime  ;
	
	private String remark ;
	
	private String groupId ;
	
	private String tagIdList ;
	
	private String subscribeScene ;
	
	private String qrScene ;
	
	private String qrSceneStr ;
	
	public String getSubscribe() {
		return subscribe;
	}



	public void setSubscribe(String subscribe) {
		this.subscribe = subscribe;
	}



	public String getOpenId() {
		return openId;
	}



	public void setOpenId(String openId) {
		this.openId = openId;
	}



	public String getNickName() {
		return nickName;
	}



	public void setNickName(String nickName) {
		this.nickName = nickName;
	}



	public String getSex() {
		return sex;
	}



	public void setSex(String sex) {
		this.sex = sex;
	}



	public String getLanguage() {
		return language;
	}



	public void setLanguage(String language) {
		this.language = language;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getProvince() {
		return province;
	}



	public void setProvince(String province) {
		this.province = province;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}



	public String getHeadImgUrl() {
		return headImgUrl;
	}



	public void setHeadImgUrl(String headImgUrl) {
		this.headImgUrl = headImgUrl;
	}



	public String getSubscribeTime() {
		return subscribeTime;
	}



	public void setSubscribeTime(String subscribeTime) {
		this.subscribeTime = subscribeTime;
	}



	public String getRemark() {
		return remark;
	}



	public void setRemark(String remark) {
		this.remark = remark;
	}



	public String getGroupId() {
		return groupId;
	}



	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}



	public String getTagIdList() {
		return tagIdList;
	}



	public void setTagIdList(String tagIdList) {
		this.tagIdList = tagIdList;
	}



	public String getSubscribeScene() {
		return subscribeScene;
	}



	public void setSubscribeScene(String subscribeScene) {
		this.subscribeScene = subscribeScene;
	}



	public String getQrScene() {
		return qrScene;
	}



	public void setQrScene(String qrScene) {
		this.qrScene = qrScene;
	}



	public String getQrSceneStr() {
		return qrSceneStr;
	}



	public void setQrSceneStr(String qrSceneStr) {
		this.qrSceneStr = qrSceneStr;
	}



	public static void main(String[] args) {
		String jsonUserInfo = "{" + 
				"  \"user_info_list\": [" + 
				"    {" + 
				"      \"subscribe\": 1," + 
				"      \"openid\": \"oVF7E1LZRGZpsJpAQHzsEKzDZXYc\"," + 
				"      \"nickname\": \"LeonXi\"," + 
				"      \"sex\": 1," + 
				"      \"language\": \"zh_CN\"," + 
				"      \"city\": \"\"," + 
				"      \"province\": \"\"," + 
				"      \"country\": \"Finland\"," + 
				"      \"headimgurl\": \"http://thirdwx.qlogo.cn/mmopen/cfOkG9HSSBP2tGibXuoXIHBUGX7WzEECxpHfpx4LPn1QHwgLzPFgBNghQ4sHKicG7OAVTSvs8z3RDWiaNZgiaqE8BCl2seqv9iaAc/132\"," + 
				"      \"subscribe_time\": 1529394719," + 
				"      \"remark\": \"\"," + 
				"      \"groupid\": 0," + 
				"      \"tagid_list\": []," + 
				"      \"subscribe_scene\": \"ADD_SCENE_QR_CODE\"," + 
				"      \"qr_scene\": 0," + 
				"      \"qr_scene_str\": \"\"" + 
				"    }" + 
				"  ]" + 
				"}";
	}
}

