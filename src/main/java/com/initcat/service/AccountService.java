package com.initcat.service;

import com.initcat.dto.CommUserInfoDto;

/**
 * 登录service
 * @author libo
 * @package com.initcat.service.impl
 * @company initcat
 * @date 2018/11/26
 */
public interface AccountService {

    /**
     * 登录
     * @param userNumber 用户编号
     * @param passward 密码
     * @param userType 用户类型
     * @return 用户信息
     */
    CommUserInfoDto login(String userNumber, String passward, Integer userType);

}
