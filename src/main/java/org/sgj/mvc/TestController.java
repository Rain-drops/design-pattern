package org.sgj.mvc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/list")
    public String list(){
        return "test";
    }

    @GetMapping("/all")
    public String all(){
        return "test";
    }
}
