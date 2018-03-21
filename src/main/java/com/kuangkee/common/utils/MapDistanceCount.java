/**
 * Project Name:kuangkee-common
 * File Name:MapDistanceCount.java
 * Package Name:com.kuangkee.common.utils
 * Date:2018年3月21日下午12:39:44
 * Copyright (c) 2018, 【Leon Xi】 All Rights Reserved.
 *
*/

package com.kuangkee.common.utils;

/**
 * ClassName:MapDistanceCount <br/>
 * Date:     2018年3月21日 下午12:39:44 <br/>
 * @author   Leon Xi
 * @version  v1.0
 * @see 	 
 */
public class MapDistanceCount {
	 /**
     * 计算两经纬度点之间的距离（单位：米）
     * @param lng1  经度
     * @param lat1  纬度
     * @param lng2
     * @param lat2
     * @return
     */
    public static double getDistance(double lng1,double lat1,double lng2,double lat2){
        double radLat1 = Math.toRadians(lat1);
        double radLat2 = Math.toRadians(lat2);
        double a = radLat1 - radLat2;
        double b = Math.toRadians(lng1) - Math.toRadians(lng2);
        double s = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(a / 2), 2) + Math.cos(radLat1)
                * Math.cos(radLat2) * Math.pow(Math.sin(b / 2), 2)));
        s = s * 6378137.0;// 取WGS84标准参考椭球中的地球长半径(单位:m)
        s = Math.round(s * 10000) / 10000;
        return s;
    }
    /**
     * 计算TP值
     * @param curPoint      当前点
     * @param relatedPoint  偏移点
     * @param isGeography   是否是地理坐标 false为2d坐标
     * @return              tp值
     */
    public static double getDirAngle(Point curPoint,Point relatedPoint,boolean isGeography){
        double result = 0;
        if(isGeography){
            double y2 = Math.toRadians(relatedPoint.getLat());
            double y1 = Math.toRadians(curPoint.getLat());
            double alpha = Math.atan2(relatedPoint.getLat() - curPoint.getLat(), (relatedPoint.getLng() - curPoint.getLng()) * Math.cos((y2 - y1) / 2));//纬度方向乘以cos(y2-y1/2)
            double delta =alpha<0?(2*Math.PI+alpha):alpha;
            result = Math.toDegrees(delta);
        }else {
            double alpha = Math.atan2(relatedPoint.getLat() - curPoint.getLat(), relatedPoint.getLng() - curPoint.getLng());
            double delta=alpha<0?(2*Math.PI+alpha):alpha;
            result = Math.toDegrees(delta);
        }
        return result;
    }
    public static void main(String[] args) {
//        System.out.println(getDistance(121.446014,31.215937,121.446028464238,31.2158502442799));
    	Point curPoint = new Point(29.490295,106.486654) ;
    	Point relatedPoint = new Point(29.615467,106.581515) ;
        System.out.println(getDirAngle(curPoint,relatedPoint, false)) ;
    }

}

class Point{
	
	public Point(double lat, double lng) {
		this.lat = lat ;
		this.lng = lng ;
	}
	private double lat ;
	private double lng ;
	
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLng() {
		return lng;
	}
	public void setLng(double lng) {
		this.lng = lng;
	}
}
