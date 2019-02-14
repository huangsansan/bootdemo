package com.hhb.services;

import com.hhb.dao.DemoUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Transient;

@Service
public class DemoUserServiceImpl implements DemoUserService {

    @Autowired
    private DemoUser demoUser;

    @Override
    public long getCount(){
        return demoUser.getCount1();
    }

}
