package com.vtkr.app.scribeit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String index() {
        return "Hello World !!";
    }
}
