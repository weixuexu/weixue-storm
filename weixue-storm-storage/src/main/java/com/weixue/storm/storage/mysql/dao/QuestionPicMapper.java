package com.weixue.storm.storage.mysql.dao;

import com.weixue.storm.storage.mysql.model.QuestionPic;
import com.weixue.storm.storage.mysql.model.QuestionPicExample;
import java.util.List;

public interface QuestionPicMapper {
    int countByExample(QuestionPicExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QuestionPic record);

    int insertSelective(QuestionPic record);

    List<QuestionPic> selectByExample(QuestionPicExample example);

    QuestionPic selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(QuestionPic record);

    int updateByPrimaryKey(QuestionPic record);
}