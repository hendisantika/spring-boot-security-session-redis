package com.hendisantika.springbootsecuritysessionredis.security;

import com.hendisantika.springbootsecuritysessionredis.repository.UserAccountRepository;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-security-session-redis
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 03/01/21
 * Time: 06.21
 */
@Component
public class DatabaseUserDetailsService implements UserDetailsService {

    private final
    UserAccountRepository userAccountRepository;

    public DatabaseUserDetailsService(UserAccountRepository userAccountRepository) {
        this.userAccountRepository = userAccountRepository;
    }
}
