package com.scribeit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/scribes")
public class ScribeController {

    @GetMapping("{scribeId}")
    public String getScribeById(@PathVariable final String scribeId) {
        return scribeId;
    }
}
