package com.vaccination.vaccinationCenter.vaccinationCenter.util;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class vaccineUtilityClass {

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
