package com.initcat.dto;

import lombok.Data;

import java.util.Date;

/**
 * 用户信息Dto
 * @author libo
 * @package com.initcat.dto
 * @company initcat
 * @date 2018/11/26
 */
@Data
public class CommUserInfoDto {

    private Long commUserId;

    private Integer six;

    private Integer age;

    private String name;

    private Integer status;

    private Date ctime;

    private Date utime;

}
