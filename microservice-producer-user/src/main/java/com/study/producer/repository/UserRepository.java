package com.study.producer.repository;

import com.study.producer.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Description:
 * @Date: 2020/9/16 14:03
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
