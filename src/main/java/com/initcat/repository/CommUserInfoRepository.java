package com.initcat.repository;

import com.initcat.persistence.auto.mapper.CommUserInfoMapper;
import com.initcat.persistence.auto.model.CommUserInfo;
import com.initcat.persistence.auto.model.CommUserInfoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * class description
 *
 * @author libo
 * @package com.initcat.repository
 * @company initcat
 * @date 2018/11/26
 */
@Repository
public class CommUserInfoRepository {

    @Autowired
    CommUserInfoMapper commUserInfoMapper;

    public CommUserInfo getCommUserInfo(Long commUserID) {
        CommUserInfoExample example = new CommUserInfoExample();
        example.createCriteria().andCommUserIdEqualTo(commUserID);
        List<CommUserInfo> commUserInfos = commUserInfoMapper.selectByExample(example);
        if (commUserInfos != null && commUserInfos.size() > 0) {
            return commUserInfos.get(0);
        }
        return null;
    }

}
