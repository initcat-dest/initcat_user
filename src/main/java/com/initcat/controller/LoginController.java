package com.initcat.controller;

import com.initcat.dto.req.LoginReq;
import com.initcat.dto.req.LogoutReq;
import com.initcat.dto.resp.LoginResp;
import com.initcat.service.AccountService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * 登录
 * @author libo
 * @package com.initcat.controller
 * @company initcat
 * @date 2018/11/26
 */
@RestController
@Api(value = "登录", tags = "登录")
@RequestMapping("/account")
public class LoginController {

    @Autowired
    AccountService accountService;

    @ApiOperation("登录")
    @PostMapping(value = "/login", consumes = "application/json")
    public LoginResp login(@Valid @RequestBody LoginReq request) {
        LoginResp resp = new LoginResp();
        resp.setCommUserInfoDto(accountService.login(request.getUserNumber(), request.getPassward(), request.getUserType()));
        return resp;
    }

    @ApiOperation("登出")
    @PostMapping(value = "/logout", consumes = "application/json")
    public String login(@Valid @RequestBody LogoutReq request) {
        return "退出成功";
    }

}

