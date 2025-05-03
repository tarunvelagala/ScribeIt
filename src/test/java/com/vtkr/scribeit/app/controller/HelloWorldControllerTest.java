package com.vtkr.scribeit.app.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldControllerTest {

    @Test
    void shouldReturnHelloWorld() {
        final HelloWorldController controller = new HelloWorldController();
        final String response = controller.index();
        assertEquals("Hello World !!", response);
    }
}
