package com.study.consumer.controller;

import com.study.consumer.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Description:
 * @Date: 2020/9/16 14:36
 */
@RestController
@RefreshScope
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${hello.cloud}")
    private String testConfigCenter;

    @GetMapping("/movie/{id}")
    public User findById(@PathVariable Long id) {
        return restTemplate.getForObject("http://microservice-producer-user/simple/" + id, User.class);
    }

    @GetMapping("/getConfigInfo")
    public String getConfigInfo() {
        return this.testConfigCenter;
    }
}
