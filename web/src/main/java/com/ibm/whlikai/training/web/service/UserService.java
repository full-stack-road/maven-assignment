package com.ibm.whlikai.training.web.service;

import com.ibm.whlikai.training.web.core.domain.User;
import com.ibm.whlikai.training.web.rtc.service.RtcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private RtcService rtcService;

    public String showUser() {
        User user = rtcService.getRtcInfo();
        return user.getId() + " "+ user.getName();
    }
}
