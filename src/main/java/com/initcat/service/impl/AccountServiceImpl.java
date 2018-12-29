package com.initcat.service.impl;

import com.initcat.dto.CommUserInfoDto;
import com.initcat.persistence.auto.model.CommUser;
import com.initcat.persistence.auto.model.CommUserInfo;
import com.initcat.repository.CommUserInfoRepository;
import com.initcat.repository.CommUserRepository;
import com.initcat.service.AccountService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    CommUserRepository commUserRepository;
    @Autowired
    CommUserInfoRepository commUserInfoRepository;

    @Override
    public CommUserInfoDto login(String userNumber, String passward, Integer userType) {
        CommUser commUser = commUserRepository.getCommUserByNumber(userNumber, userType);
        if (commUser != null && passward.equals(commUser.getPassword())) {
            CommUserInfo commUserInfo = commUserInfoRepository.getCommUserInfo(commUser.getId());
            CommUserInfoDto commUserInfoDto = new CommUserInfoDto();
            BeanUtils.copyProperties(commUserInfo, commUserInfoDto);
            return commUserInfoDto;
        }
        return null;
    }

}
