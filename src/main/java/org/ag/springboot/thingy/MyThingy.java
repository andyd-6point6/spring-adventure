package org.ag.springboot.thingy;

import org.springframework.stereotype.Component;

@Component
public class MyThingy {

    public String returnAString() {
        return "This is a string from " + this;
    }
}
