package com.kuangkee.common.pojo;

import java.util.List;

import org.junit.Test;

public class EUDataGridResult {

	private long total;
	private List<?> rows;
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List<?> getRows() {
		return rows;
	}
	public void setRows(List<?> rows) {
		this.rows = rows;
	}
	
	@Test
	public void initBeanTest() {
		Long total = new EUDataGridResult().getTotal() ;
		System.out.println("total inital -> "+total) ;
	}
}
