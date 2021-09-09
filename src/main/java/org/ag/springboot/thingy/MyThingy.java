package org.ag.springboot.thingy;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class MyThingy {

    public String returnAString() {
        return "This is a string from " + this;
    }
}
