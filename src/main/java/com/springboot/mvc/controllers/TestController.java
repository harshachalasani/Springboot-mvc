package com.springboot.mvc.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    

    @RequestMapping("/api/greeting")
    public com.springboot.mvc.model.greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new com.springboot.mvc.model.greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
}
