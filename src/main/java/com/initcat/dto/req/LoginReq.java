package com.initcat.dto.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * 登录请求对象
 * @author libo
 * @package com.initcat.dto.req
 * @company initcat
 * @date 2018/11/26
 */
@Data
@ApiModel("登录请求对象")
public class LoginReq {

    @ApiModelProperty("登录账号")
    @NotEmpty(message = "登录账号不能为空")
    private String userNumber;

    @ApiModelProperty("登录密码")
    @NotEmpty(message = "登录密码不能为空")
    private String passward;

    @ApiModelProperty("登录账号类型")
    @NotNull(message = "登录账号类型不能为空")
    @Min(value = 0, message = "登录账号类型不正确")
    @Max(value = 2, message = "登录账号类型不正确")
    private Integer userType;

}
