package com.tools.mailcontroller.controller;

import com.tools.mailcontroller.service.Example1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Example1 {

    @Autowired
    private Example1Service example1Service;

    @RequestMapping(path = "/")
    public String test1() {
        return example1Service.findResult();
    }

}
