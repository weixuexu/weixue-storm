package com.weixue.storm.storage.mysql;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.boot.autoconfigure.MybatisProperties;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;

/**
 * @author weixue
 * @version 1.0
 * @Date: 19/4/10 15:57
 */
@Configuration
@MapperScan(basePackages = "com.weixue.storm.storage.mysql.dao")
@ConditionalOnProperty(value = "sharingan.datasource.url")
public class MybatisAutoConfiguration implements InitializingBean{
    @Autowired
    private MybatisProperties mybatisProperties;

    @Override
    public void afterPropertiesSet() throws Exception {
        mybatisProperties.setMapperLocations(new String[]{"classpath*:sqlmap/*.xml"});
    }
}
