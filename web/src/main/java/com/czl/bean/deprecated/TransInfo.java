package com.czl.bean.deprecated;

import java.util.List;

public class TransInfo {              //用于传递分页栏信息和记录索引，举例用    
	private int totalPage;  //页总数
	private int totalSize;  //记录总数
	private List<DocIndex> docIndexs;   //某页要显示的记录索引信息列表
	
	/*public int getPageNo(){
		return pageNo;
	}*/
	
	public int getTotalPage(){
		return totalPage;
	}
	public void setTotalPage(int totalPage){
		this.totalPage=totalPage;
	}
	
	public void setTotalSize(int totalSize){
		this.totalSize=totalSize;
	}
	
	public int getTotalSize(){
		return totalSize;
	}
	
	public void setDocIndexs(List<DocIndex> docIndexs){
		this.docIndexs=docIndexs;
	}
	public List<DocIndex> getDocIndexs(){
		return docIndexs;
	}
	
	
	
	
	public TransInfo(){
		
	}
	
	
	
	
	

}
