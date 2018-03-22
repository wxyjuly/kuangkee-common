/**
 * Project Name:kuangkee-common
 * File Name:Student.java
 * Package Name:com.kuangkee.common.utils.excel.poi
 * Date:2018年3月21日下午4:33:44
 * Copyright (c) 2018, 【Leon Xi】 All Rights Reserved.
 *
*/

package com.kuangkee.common.utils.excel.poi.vo ;
/**
 * ClassName:Student <br/>
 * Date:     2018年3月21日 下午4:33:44 <br/>
 * @author   Leon Xi
 * @version  v1.0
 * @see 	 
 */

public class Student {
    /**
     * id   
     */
    private Integer id;
    /**
     * 学号
     */
    private String no;
    /**
     * 姓名
     */
    private String name;
    /**
     * 学院
     */
    private String age;
    /**
     * 成绩
     */
    private float score;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

}