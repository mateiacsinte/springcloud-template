package com.axi.templates.springcloud.coupon;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/coupon")
public class CouponController {

    @GetMapping("/test")
    public String test(){
        return "Hello! I am the new SpringBoot app";
    }
}
