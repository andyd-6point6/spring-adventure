package org.ag.springboot.services;

import org.ag.springboot.thingy.MyThingy;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ServiceAppTest {

    @Autowired
    private ServiceApp serviceApp;

    @Autowired
    private MyThingy myThingy;

    @Test
    void request() {

        assertEquals("Hello!! This is a string from " + myThingy, serviceApp.request());
    }
}