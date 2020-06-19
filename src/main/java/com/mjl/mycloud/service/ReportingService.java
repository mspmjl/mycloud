package com.mjl.mycloud.service;

import com.mjl.mycloud.dto.MPRReporting;
import com.mjl.mycloud.mapper.ReportingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Miaojiale on 2018/12/4.
 */
@Service
public class ReportingService {
    @Autowired
    ReportingMapper mapper;


    public MPRReporting getById(String name) {
        if (name == null) {
            return null;
        }
        return mapper.getById(name);
    }

    public List<MPRReporting> selectByStatus(){
        return mapper.selectByStatus();
    }
}
