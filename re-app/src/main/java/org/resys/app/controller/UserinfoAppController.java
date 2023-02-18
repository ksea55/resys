package org.resys.app.controller;

import jakarta.annotation.Resource;
import org.resys.model.UserInfo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
@RequestMapping("org/resys/app/userinfo")
public class UserinfoAppController {

    @Resource
    private RestTemplate restTemplate;

    // 单击版本的时候可以直接写死 对其提供引用的协议
    //private String httpstr = "http://localhost:8081";

    // 当时集群的情况下 就需要用到在eureka中 Application中的名称 这里在Applicaiton的名称是 RE-WEB
    private String httpstr = "http://RE-WEB";

    @GetMapping("get/{id}")
    public Map getUserInfoById(@PathVariable("id") String id) {
        return restTemplate.getForObject(httpstr + "/org/resys/api/userinfo/get/" + id, Map.class);
    }

}
