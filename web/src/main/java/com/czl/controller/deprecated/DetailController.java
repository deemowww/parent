package com.czl.controller.deprecated;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.czl.bean.deprecated.PageInfo;
/*
@Controller   
@RequestMapping(value="/Htmls",produces="application/json;charset=UTF-8") */
public class DetailController {/*
	@RequestMapping(value="/detailController",method=RequestMethod.GET)
	public @ResponseBody PageInfo getDetail(String docId) {  //返回记录详情，举例用
		System.out.println(docId);
		PageInfo pInfo=new PageInfo();
		pInfo.setDocId(docId);
		pInfo.setTitle("title:"+docId);
		pInfo.setContent("content:"+docId);
        return pInfo;
		
    }  */
}
