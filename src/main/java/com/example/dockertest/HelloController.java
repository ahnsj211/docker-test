package com.example.dockertest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Package :: com.example.dockertest
 * Developer :: Ahn Seong-jin
 * Date :: 2021/05/04
 * Description ::
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello #1";
    }
}
