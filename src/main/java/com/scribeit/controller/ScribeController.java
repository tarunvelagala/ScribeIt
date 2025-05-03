package com.scribeit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/v1/scribes")
public class ScribeController {

    @GetMapping("/{scribeId}")
    public String getScribe(@PathVariable final String scribeId) {
        return scribeId;
    }
}
