package com.mynotes.spring.cloud.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("offers-service")
public interface OffersServiceClient {

    @RequestMapping(value = "/getCurrentOffers", method = RequestMethod.GET)
    public List<Offers> getCurrentOffers();

}