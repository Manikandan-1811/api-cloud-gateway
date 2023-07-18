package com.jtech.api.gateway;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FallbackController {
    @RequestMapping("/orderFallback")
    public Mono<String> orderServiceFallback() {
        return Mono.just("order service taking too long to respond or is down.Please try again later");
    }

    @RequestMapping("/paymentFallback")
    public Mono<String> paymentServiceFallback() {
        return Mono.just("payment service taking too long to respond or is down.Please try again later");
    }
}
