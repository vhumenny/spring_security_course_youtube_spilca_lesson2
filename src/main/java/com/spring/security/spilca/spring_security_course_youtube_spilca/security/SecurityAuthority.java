package com.spring.security.spilca.spring_security_course_youtube_spilca.security;

import com.spring.security.spilca.spring_security_course_youtube_spilca.entity.Authority;
import lombok.AllArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

@AllArgsConstructor
public class SecurityAuthority implements GrantedAuthority {
    private final Authority authority;

    @Override
    public String getAuthority() {
        return authority.getName();
    }
}
