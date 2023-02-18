package org.resys.web.controller;

import jakarta.annotation.Resource;
import org.resys.model.UserInfo;
import org.resys.service.UserInfoService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("org/resys/api/userinfo")
public class UserInfoController {

    @Value("${server.port}")
    private Integer port;

    @Resource
    private UserInfoService userInfoService;

    @GetMapping("get/{id}")
    public Object getUserInfo(@PathVariable("id") String id) {
        Map<String, Object> json = new HashMap<>();
        UserInfo userinfo = userInfoService.getUserInfoById(id);
        json.put("data", userinfo);
        json.put("port", port);
        return json;
    }


}

