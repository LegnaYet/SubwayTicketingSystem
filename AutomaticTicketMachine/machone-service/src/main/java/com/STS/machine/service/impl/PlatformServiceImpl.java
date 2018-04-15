package com.STS.machine.service.impl;

import com.STS.machine.dao.PlatformMapper;
import com.STS.machine.pojo.po.Platform;
import com.STS.machine.service.IPlatformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlatformServiceImpl implements IPlatformService {
    @Autowired
    private PlatformMapper dao;

    @Override
    public Platform selectPlatformByPid(Integer beginid) {
        return dao.selectByPrimaryKey(beginid);
    }
}
