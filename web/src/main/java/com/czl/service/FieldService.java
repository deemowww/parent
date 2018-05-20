package com.czl.service;

import com.czl.bean.Field;
import com.czl.repository.FieldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
