package com.czl.controller;

import com.czl.bean.Process;
import com.czl.service.ProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/process")
public class ProcessController {
    @Autowired
    private ProcessService processService;

    @RequestMapping("/findbypage")
    public Page<Process> getFieldsPage(@RequestParam("pageNum") String pageNum){
        return processService.getEntrepotPage(pageNum);
    }
}
