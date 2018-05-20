package com.czl.service;

import com.czl.bean.Entrepot;
import com.czl.repository.EntrepotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

/**
 * Author: Karlc
 * Date: 2018/5/20
 * Time: 下午 3:05
 */

@Service
public class EntrepotService {
    @Autowired
    private EntrepotRepository entrepotRepository;

    public Page<Entrepot> getEntrepotPage(String pageNum){
        int pageSize = 10;

        int page = Integer.parseInt(pageNum);

        Sort sort = new Sort(Sort.Direction.DESC, "createTime");

        Pageable pageable = new PageRequest(page, pageSize, sort);

        return entrepotRepository.findAll(pageable);
    }

}
