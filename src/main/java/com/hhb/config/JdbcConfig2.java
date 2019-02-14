package com.hhb.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

//@Configuration
//@EnableConfigurationProperties(JdbcProperties.class)
public class JdbcConfig2 {

    @Bean
    public DataSource dataSource(JdbcProperties jd){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(jd.getDriverClassName());
        dataSource.setUrl(jd.getUrl());
        dataSource.setPassword(jd.getPassword());
        dataSource.setUsername(jd.getUsername());
        return dataSource;
    }
}
