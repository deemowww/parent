package com.czl.service;

import com.czl.bean.Franchiser;
import com.czl.repository.FranchiserRepository;
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
public class FranchiserService {
    @Autowired
    private FranchiserRepository franchiserRepository;

    public Page<Franchiser> getEntrepotPage(String pageNum){
        int pageSize = 10;

        int page = Integer.parseInt(pageNum);

        Sort sort = new Sort(Sort.Direction.DESC, "createTime");

        Pageable pageable = new PageRequest(page, pageSize, sort);

        return franchiserRepository.findAll(pageable);
    }
}
