package org.mithun.samples.okta.hosted;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@SpringBootApplication
@EnableGlobalMethodSecurity(prePostEnabled = true,securedEnabled = true)
public class OktaHostedAuthenticationApp {
    public static void main(String[] args){
        SpringApplication.run(OktaHostedAuthenticationApp.class,args);
    }
}
