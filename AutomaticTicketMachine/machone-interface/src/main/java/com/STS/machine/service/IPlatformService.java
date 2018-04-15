package com.STS.machine.service;

import com.STS.machine.pojo.po.Platform;

public interface IPlatformService {
    Platform selectPlatformByPid(Integer beginid);
}
