package com.hendisantika.springbootsecuritysessionredis.repository;

import com.hendisantika.springbootsecuritysessionredis.entity.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-security-session-redis
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 03/01/21
 * Time: 06.18
 */
@Repository
public interface UserPrivilegeRepository extends JpaRepository<UserAccount, Integer> {
    UserAccount findByUsername(String username);
}