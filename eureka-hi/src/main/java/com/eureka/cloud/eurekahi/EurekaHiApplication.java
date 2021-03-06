package com.eureka.cloud.eurekahi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author YuAn
 */
@SpringBootApplication
public class EurekaHiApplication {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(EurekaHiApplication.class, args);
    }

//    @Value("${server.port}")
//    String port;
//    @RequestMapping("/hi")
//    public String home(@RequestParam String name) {
//        return "hi "+name+",i am from port:" +port;
//    }

}
