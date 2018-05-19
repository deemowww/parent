package com.czl.controller;
import java.util.ArrayList;
import java.util.List;

import com.czl.bean.Field;
import com.czl.repository.FieldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="/field")
public class FieldController {

    @Autowired
    FieldRepository fieldRepository;

    @RequestMapping("/findbypage")
    public Page<Field> getFieldsPage(@RequestParam("pageNum") String pageNum){
        int pageSize = 10;
        System.out.println(pageNum);
        int page = Integer.parseInt(pageNum);
        Pageable pageable = new PageRequest(page, pageSize);

        return fieldRepository.findAll(pageable);
    }
/*

    @RequestMapping("/transjson")
	public @ResponseBody TransInfo transTest(String index) {
	   //page是页数,Size是记录总数,index是点击的页码
		System.out.println(index);

		TransInfo tt=new TransInfo();
		tt.setTotalSize(7);
		tt.setTotalPage(250);
		//添加文件记录，单页最多25个  ,例子
		List<DocIndex> docIndexs=new ArrayList<DocIndex>();
		for(int i=0;i<8;i++){
			DocIndex DI=new DocIndex();
			DI.setId("Did"+(i+1));
			DI.setTitle("标题"+(i+1));
			docIndexs.add(DI);
		}

		tt.setDocIndexs(docIndexs);
		return tt;
	}

	@RequestMapping("/test")
	public String test() {
		//page是页数,Size是记录总数,index是点击的页码
		System.out.println("123123123213213");
		return "111";
	}

*/
}
