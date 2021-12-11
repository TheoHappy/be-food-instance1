package com.rtg.foodbackend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrontController {
    @GetMapping()
    public ResponseEntity<String> test() {
        return new ResponseEntity<String>("First Page", HttpStatus.OK);
    }

}
