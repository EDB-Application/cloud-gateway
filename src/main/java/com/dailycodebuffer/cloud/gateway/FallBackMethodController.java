package com.dailycodebuffer.cloud.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("/userServiceFallBack")
    public String userServiceFallBackMethod() {
        return "User Service is taking longer than Expected." +
                " Please try again later";
    }

    @GetMapping("/transfertServiceFallBack")
    public String transfertServiceFallBackMethod() {
        return "Transfert Service is taking longer than Expected." +
                " Please try again later";
    }
    @GetMapping("/clientsServiceFallBack")
    public String clientServiceFallBackMethod() {
        return "Client Service is taking longer than Expected." +
                " Please try again later";
    }
}
