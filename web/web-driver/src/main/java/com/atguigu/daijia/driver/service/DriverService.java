package com.atguigu.daijia.driver.service;

import com.atguigu.daijia.model.vo.driver.DriverAuthInfoVo;

public interface DriverService {
    String login(String code);
    DriverAuthInfoVo getDriverAuthInfo(Long driverId);
}
