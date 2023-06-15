package org.javaboy.repeat_submit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xyma
 * @version 1.0
 * @data 2023/6/15 10:43
 */

@RestController
public class HelloController {

    @PostMapping("/hello")
    public String hello(@RequestBody String json) {
        return json;
    }
}
