package com.edu.msc.consul.controller;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jn
 * @create 2018-04-03 15:43
 **/

@RestController
public class ApiController {
    @RequestMapping("/")
    public String home() {
        return "Hello world";
    }
}
