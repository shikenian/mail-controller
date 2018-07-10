package com.tools.mailcontroller.service.impl;

import com.tools.mailcontroller.service.Example1Service;
import org.springframework.stereotype.Service;

@Service
public class Example1ServiceImpl implements Example1Service {

    @Override
    public String findResult() {
        return "Hello World";
    }
}
