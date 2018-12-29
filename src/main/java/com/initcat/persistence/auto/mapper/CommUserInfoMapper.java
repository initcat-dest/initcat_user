package com.initcat.persistence.auto.mapper;

import com.initcat.persistence.auto.model.CommUserInfo;
import com.initcat.persistence.auto.model.CommUserInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommUserInfoMapper {
    int countByExample(CommUserInfoExample example);

    int deleteByExample(CommUserInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CommUserInfo record);

    int insertSelective(CommUserInfo record);

    List<CommUserInfo> selectByExampleWithBLOBs(CommUserInfoExample example);

    List<CommUserInfo> selectByExample(CommUserInfoExample example);

    CommUserInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CommUserInfo record, @Param("example") CommUserInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") CommUserInfo record, @Param("example") CommUserInfoExample example);

    int updateByExample(@Param("record") CommUserInfo record, @Param("example") CommUserInfoExample example);

    int updateByPrimaryKeySelective(CommUserInfo record);

    int updateByPrimaryKeyWithBLOBs(CommUserInfo record);

    int updateByPrimaryKey(CommUserInfo record);
}