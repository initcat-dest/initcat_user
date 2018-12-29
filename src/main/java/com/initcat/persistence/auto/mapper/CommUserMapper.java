package com.initcat.persistence.auto.mapper;

import com.initcat.persistence.auto.model.CommUser;
import com.initcat.persistence.auto.model.CommUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommUserMapper {
    int countByExample(CommUserExample example);

    int deleteByExample(CommUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CommUser record);

    int insertSelective(CommUser record);

    List<CommUser> selectByExample(CommUserExample example);

    CommUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CommUser record, @Param("example") CommUserExample example);

    int updateByExample(@Param("record") CommUser record, @Param("example") CommUserExample example);

    int updateByPrimaryKeySelective(CommUser record);

    int updateByPrimaryKey(CommUser record);
}