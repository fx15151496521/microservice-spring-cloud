package com.study.openFeign.service;

import com.study.openFeign.entity.User;
import com.study.openFeign.fallback.FeignUserServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Description:
 * @Date: 2020/9/24 16:18
 */
@FeignClient(value = "microservice-producer-user", fallback = FeignUserServiceFallback.class)
public interface FeignUserService {

    @GetMapping("/simple/{id}")
    User getUserById(@PathVariable("id") Long id);
}
