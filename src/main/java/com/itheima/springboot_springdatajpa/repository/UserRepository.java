package com.itheima.springboot_springdatajpa.repository;

import com.itheima.springboot_springdatajpa.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 此接口作为SpringDataJPA 的功能定义接口，该接口中定义了多种的功能
 *
 *      JpaRepository接口：此接口中定义了一些基本的CRUD的功能。
 */
public interface UserRepository extends JpaRepository<User,Long> {

}
