package com.mynotes.spring.cloud.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("recommendation-service")
public interface RecommendationServiceClient {

    @RequestMapping(value = "/recommendations", method = RequestMethod.GET)
    public List<Product> getRecommendations();

}