package com.initcat.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * class description
 *
 * @author libo
 * @package com.initcat.controller
 * @company xmiles
 * @date 2018/11/27
 */
@RestController
@Api(value = "测试Controller", tags = "测试Controller")
public class TestController {

    @RequestMapping("/hello")
    public String helloSpringBoot() {
        return "Hello SpringBoot Project.";
    }

}
