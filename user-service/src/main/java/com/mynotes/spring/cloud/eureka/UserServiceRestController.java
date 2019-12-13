package com.mynotes.spring.cloud.eureka;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserServiceRestController {

    @RequestMapping(value = "/getPublicAddress", method = RequestMethod.GET)
    @ResponseBody
    @LoadBalanced
    public String getContact() {
        return "Public Address";
    }

}
