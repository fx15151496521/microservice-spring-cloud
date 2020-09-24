package com.study.openFeign.controller;

import com.study.openFeign.entity.User;
import com.study.openFeign.service.FeignUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Date: 2020/9/16 14:36
 */
@RestController
public class FeignController {

    @Autowired
    private FeignUserService feignUserService;

    @GetMapping("/getUser/{id}")
    public User findById(@PathVariable Long id) {
        return feignUserService.getUserById(id);
    }
}
