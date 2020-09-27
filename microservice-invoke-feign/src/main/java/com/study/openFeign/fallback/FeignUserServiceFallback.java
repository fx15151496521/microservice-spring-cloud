package com.study.openFeign.fallback;

import com.study.openFeign.entity.User;
import com.study.openFeign.service.FeignUserService;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Date: 2020/9/27 9:55
 */
@Component
public class FeignUserServiceFallback implements FeignUserService {

    @Override
    public User getUserById(Long id) {
        User user = new User();
        user.setId(id);
        user.setName("服务器调用失败....");
        return user;
    }
}
