package com.ecommerce.demo.marketplace.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class FilterChainConfiguration {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        //Permit all the GET request to "/marketplace/item" API (JWT authentication is not enforced for this API)
        //Protect all the requests to "/marketplace/shoppingcart" API (JWT authentication is enforced for this API)

        http.cors()
            .and()
            .authorizeHttpRequests((authz) -> authz.requestMatchers(HttpMethod.GET, "/item/**")
                                                   .permitAll()
                                                   .requestMatchers("/shoppingcart/**")
                                                   .authenticated()
                                                   .anyRequest()
                                                   .authenticated())
            .oauth2ResourceServer()
            .jwt();
        return http.build();
    }
}
