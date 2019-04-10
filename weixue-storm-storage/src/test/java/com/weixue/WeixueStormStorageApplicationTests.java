package com.weixue;

import com.weixue.storm.storage.mysql.dao.EvidenceMapper;
import com.weixue.storm.storage.mysql.model.Evidence;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan(basePackages = "com.weixue.storm.storage.mysql.dao")
public class WeixueStormStorageApplicationTests {

	@Autowired
	private EvidenceMapper evidenceMapper;
	@Test
	public void contextLoads() {
		evidenceMapper.insert(new Evidence());
	}

}
