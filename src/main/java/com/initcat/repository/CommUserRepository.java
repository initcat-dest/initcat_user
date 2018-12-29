package com.initcat.repository;

import com.alicp.jetcache.anno.Cached;
import com.initcat.constant.redis.UserRedisConstant;
import com.initcat.persistence.auto.mapper.CommUserMapper;
import com.initcat.persistence.auto.model.CommUser;
import com.initcat.persistence.auto.model.CommUserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *
 *
 * @author libo
 * @package com.initcat.repository
 * @company initcat
 * @date 2018/11/26
 */
@Repository
public class CommUserRepository {

    @Autowired
    CommUserMapper commUserMapper;

    @Cached(name = UserRedisConstant.USER_INFO, key = "#userNumber+#userType", expire = 200)
    public CommUser getCommUserByNumber(String userNumber, Integer userType) {
        CommUserExample example = new CommUserExample();
        example.createCriteria().andNumberEqualTo(userNumber).andTypeEqualTo(userType);
        List<CommUser> commUsers = commUserMapper.selectByExample(example);
        if (commUsers != null && commUsers.size() > 0) {
            return commUsers.get(0);
        }
        return null;
    }

}
