package com.czl.controller;

import com.czl.bean.Entrepot;
import com.czl.service.EntrepotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/entrepot")
public class EntrepotController {

    @Autowired
    private EntrepotService entrepotService;

    @RequestMapping("/findbypage")
    public Page<Entrepot> getFieldsPage(@RequestParam("pageNum") String pageNum){
        return entrepotService.getEntrepotPage(pageNum);
    }
}
