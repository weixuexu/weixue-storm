package com.weixue.storm.storage.mysql.dao;

import com.weixue.storm.storage.mysql.model.QuestionOperate;
import com.weixue.storm.storage.mysql.model.QuestionOperateExample;
import java.util.List;

public interface QuestionOperateMapper {
    int countByExample(QuestionOperateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QuestionOperate record);

    int insertSelective(QuestionOperate record);

    List<QuestionOperate> selectByExample(QuestionOperateExample example);

    QuestionOperate selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(QuestionOperate record);

    int updateByPrimaryKey(QuestionOperate record);
}