package com.report.webservice.web;
import org.springframework.web.bind.annotation.GetMapping;



import org.springframework.web.bind.annotation.RestController;

@RestController //ResponseBody�� ��� �޼ҵ忡 ����
public class WebRestController {

    @GetMapping("/hello")
    public String hello() {
        return "HelloWorld";
    }
}