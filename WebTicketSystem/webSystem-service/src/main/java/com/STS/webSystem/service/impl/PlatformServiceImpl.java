package com.STS.webSystem.service.impl;

import com.STS.webSystem.dao.PlatformMapper;
import com.STS.webSystem.pojo.po.Platform;
import com.STS.webSystem.service.IPlatformService;
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
