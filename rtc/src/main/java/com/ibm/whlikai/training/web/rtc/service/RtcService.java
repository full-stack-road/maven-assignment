package com.ibm.whlikai.training.web.rtc.service;

import com.ibm.whlikai.training.web.core.domain.User;
import org.springframework.stereotype.Service;

@Service
public class RtcService {
    public User getRtcInfo() {
        User user = new User();
        user.setId("whlika@cn.ibm.com");
        user.setName("Kenny Lee");
        return user;
    }
}
