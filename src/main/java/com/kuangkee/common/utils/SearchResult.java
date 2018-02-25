package com.kuangkee.common.utils ;

import java.util.List;

@SuppressWarnings("hiding")
public class SearchResult<T> {
	
//	searchStatus【搜索结果：0{无搜索结果},1{错误代码匹配成功},2{关键字匹配成功}】
	public static final class SearchStatus {
		public static final String NOT_MATCHED_SEARCH = "0" ;
		public static final String ERROR_CODE_MATCHED_SEARCH = "1" ;
		public static final String CONTENT_MATCHED_SEARCH = "2" ;
	}

	//商品列表
	private List<T> result;
	//总记录数
	private long recordCount;
	//总页数
	private long pageCount;
	//当前页
	private long curPage;
	//搜索结果[0{无搜索结果},1{错误代码匹配成功},2{关键字匹配成功}]
	private String searchStatus = SearchStatus.ERROR_CODE_MATCHED_SEARCH ;
	
	public String getSearchStatus() {
		return searchStatus;
	}
	public void setSearchStatus(String searchStatus) {
		this.searchStatus = searchStatus;
	}
	public List<T> getResult() {
		return result;
	}
	public void setResult(List<T> Result) {
		this.result = Result;
	}
	public long getRecordCount() {
		return recordCount;
	}
	public void setRecordCount(long recordCount) {
		this.recordCount = recordCount;
	}
	public long getPageCount() {
		return pageCount;
	}
	public void setPageCount(long pageCount) {
		this.pageCount = pageCount;
	}
	public long getCurPage() {
		return curPage;
	}
	public void setCurPage(long curPage) {
		this.curPage = curPage;
	}
	
	@Override
	public String toString() {
		return "SearchResult [result=" + result + ", recordCount=" + recordCount + ", pageCount=" + pageCount
				+ ", curPage=" + curPage + ", searchStatus=" + searchStatus + "]";
	}
	
}
