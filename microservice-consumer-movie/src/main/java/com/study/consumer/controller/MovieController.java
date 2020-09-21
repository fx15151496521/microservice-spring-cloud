package com.study.consumer.controller;

import com.study.consumer.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Description:
 * @Date: 2020/9/16 14:36
 */
@RestController
public class MovieController {

    @Value("${user.userServicePath}")
    private String mircoservice_producer_path;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/movie/{id}")
    public User findById(@PathVariable Long id) {
        return restTemplate.getForObject(mircoservice_producer_path + id, User.class);
    }
}
