/**
 * Author: Karlc
 * Date: 2018/4/2
 * Time: 下午 11:13
 */

package com.czl.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/doc")
public class DocController {
    @ApiOperation(value = "新建种植记录，简单的一个测试，用的form表单传输数据")
    @RequestMapping(value = "/new")
    public void createDoc(@RequestParam("field_id") String field_id,
                          @RequestParam("field_seedName") String field_seedName,
                          @RequestParam("field_fertilizerName") String field_fertilizerName,
                          @RequestParam("field_fertilizerDosage") String field_fertilizerDosage,
                          @RequestParam("field_pesticideName") String field_pesticideName,
                          @RequestParam("field_pesticideDosage") String field_pesticideDosage,
                          @RequestParam("field_pH") String field_pH,
                          @RequestParam("field_waterQuality") String field_waterQuality){

        System.out.println(field_id);
        System.out.println(field_seedName);
        System.out.println(field_fertilizerName);
        System.out.println(field_fertilizerDosage);
        System.out.println(field_pesticideName);
        System.out.println(field_pesticideDosage);
        System.out.println(field_pH);
        System.out.println(field_waterQuality);
    }

    @ApiOperation(value = "展示详细信息")
    @RequestMapping(value = "/detail")
    public String showDetail(){
        return "这是详细信息";
    }
}
