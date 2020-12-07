package org.mithun.samples.okta.hosted;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.thymeleaf.extras.springsecurity5.auth.Authorization;

@Controller
public class AuthenticatorController {
    Authorization authorization;
    @GetMapping("/")
    public String home(){
        return "home";
    }
}
