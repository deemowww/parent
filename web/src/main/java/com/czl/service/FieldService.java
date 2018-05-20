package com.czl.service;

import com.czl.bean.Field;
import com.czl.repository.FieldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Author: Karlc
 * Date: 2018/5/20
 * Time: 下午 3:05
 */

@Service
public class FieldService {
    @Autowired
    private FieldRepository fieldRepository;


    public Field findFieldById(String fieldId){
        return fieldRepository.findOne(fieldId);
    }

    public Page<Field> getFieldsPage(String pageNum){
        int pageSize = 10;
        int page = Integer.parseInt(pageNum);
        Sort sort = new Sort(Sort.Direction.DESC, "createTime");
        Pageable pageable = new PageRequest(page, pageSize, sort);

        return fieldRepository.findAll(pageable);
    }
}
