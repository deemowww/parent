package com.czl.controller;

import com.czl.bean.Franchiser;
import com.czl.service.FranchiserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/franchiser")
public class FranchiserController {
    @Autowired
    private FranchiserService franchiserService;

    @RequestMapping("/findbypage")
    public Page<Franchiser> getFieldsPage(@RequestParam("pageNum") String pageNum){
        return franchiserService.getEntrepotPage(pageNum);
    }
}
