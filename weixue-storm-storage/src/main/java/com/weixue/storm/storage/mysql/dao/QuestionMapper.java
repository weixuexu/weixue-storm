package com.weixue.storm.storage.mysql.dao;

import com.weixue.storm.storage.mysql.model.Question;
import com.weixue.storm.storage.mysql.model.QuestionExample;
import java.util.List;

public interface QuestionMapper {
    int countByExample(QuestionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Question record);

    int insertSelective(Question record);

    List<Question> selectByExampleWithBLOBs(QuestionExample example);

    List<Question> selectByExample(QuestionExample example);

    Question selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Question record);

    int updateByPrimaryKeyWithBLOBs(Question record);

    int updateByPrimaryKey(Question record);
}