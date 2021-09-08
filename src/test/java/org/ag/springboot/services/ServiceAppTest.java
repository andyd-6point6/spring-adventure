package org.ag.springboot.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;


class ServiceAppTest {

    //private ServiceApp serviceApp;

    @Test
    void request() {

        assertEquals("Hello!! This is a string from ???", new ServiceApp().request());
    }
}