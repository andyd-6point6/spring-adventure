package org.ag.springboot.services;

import org.ag.springboot.thingy.AddUp;
import org.ag.springboot.thingy.MyThingy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceApp {

    @Autowired
    private MyThingy myThingy;

    @RequestMapping("/")
    public String request() {
        return "Hello!! " + myThingy.returnAString();
    }

    @RequestMapping("/addup")
    public String addup(int a, int b){
        return new AddUp().addTwoNumbers(a,b);
    }

}
