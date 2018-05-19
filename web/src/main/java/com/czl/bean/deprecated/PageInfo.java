package com.czl.bean.deprecated;

public class PageInfo {
	 //用于展示记录内容，举例用
	private String docId;
	private String title;
	private String content;
	
	public PageInfo(){
		
	}
	
	public String getDocId(){
		return docId;
	}
	
	public void setDocId(String docId){
		this.docId=docId;
	}
	public String getTitle(){
		return title;
	}
	
	public String getContent(){
		return content;
	}
	
	public void  setTitle(String title){
		this.title=title;
	}
	
	public void setContent(String content){
		this.content=content;
	}
	
	

}
