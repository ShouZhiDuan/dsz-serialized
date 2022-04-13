package com.serialized.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.protobuf.ProtobufHttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;

/**
 * @Auther: ShouZhi@Duan
 * @Date: 2022/4/13 10:29
 * @Description:
 */
@Configuration
public class MessageCOnverterConfig {

    @Bean
    public ProtobufHttpMessageConverter protobufHttpMessageConverter() {
        return new ProtobufHttpMessageConverter();
    }

    @Bean
    public RestTemplate restTemplate(ProtobufHttpMessageConverter protobufHttpMessageConverter) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.setMessageConverters(Arrays.asList(protobufHttpMessageConverter));
        return restTemplate;
    }
}
