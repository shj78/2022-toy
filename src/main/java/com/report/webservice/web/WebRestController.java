package com.report.webservice.web;
import org.springframework.web.bind.annotation.GetMapping;



import org.springframework.web.bind.annotation.RestController;

@RestController //ResponseBody를 모든 메소드에 적용
public class WebRestController {

    @GetMapping("/hello")
    public String hello() {
        return "HelloWorld";
    }
}