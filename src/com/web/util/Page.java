package com.web.util;

/**
 * @author admin
 *	分页使用的类
 *	
 */
public class Page {
	private int totalPage;
	private int currentPage;
	//everypage 每页显示的数量
	private int everyPage;
	//根据之前显示过的数目 确定的开始页
	private int beginPage;
	private int count;
	//prepage 前一页
	private boolean prePage;
	private boolean nextPage;
	
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	public int getTotalPage() {
		int totalPage = 0;
		if(count % this.getEveryPage() == 0)
			totalPage = count/this.getEveryPage();
		else totalPage = count/this.getEveryPage() +1;
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getCurrentPage() {
		return currentPage==0?1:currentPage;
		
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getEveryPage() {
		return everyPage == 0? 10 : everyPage;
	}
	public void setEveryPage(int everyPage) {
		this.everyPage = everyPage;
	}
	
	//当前页*每页数目 得到 之前显示过的数目 从而确定 当前页一开始的数目 进一步数据库的读取
	public int getBeginPage() {
		return (currentPage - 1)*everyPage;
	}
	public void setBeginPage(int beginPage) {
		this.beginPage = beginPage;
	}
	public boolean isPrePage() {
		return  getCurrentPage() == 1?false:true;
	}
	public void setPrePage(boolean prePage) {
		this.prePage = prePage;
	}
	public boolean isNextPage() {
		return getCurrentPage() == getTotalPage()|| getTotalPage() == 0?false:true;
	}
	public void setNextPage(boolean nextPage) {
		this.nextPage = nextPage;
	}

	
}
