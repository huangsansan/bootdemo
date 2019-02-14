package com.hhb.dao;

import tk.mybatis.mapper.common.Mapper;

public interface DemoUser extends Mapper<com.hhb.pojo.DemoUser> {
    public Long getCount1();
}
