package com.cicd.backend.controllers;

import com.cicd.backend.controllers.responses.HelloTO;
import com.cicd.backend.services.HelloService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloController {

  private final HelloService helloService;

  public HelloController(HelloService helloService) {
    this.helloService = helloService;
  }

  @GetMapping("/hello/{name}")
  public ResponseEntity<HelloTO> helloWorld(@PathVariable("name") String name) {
    return ResponseEntity.ok(HelloTO.builder().message(helloService.helloName(name)).build());
  }
}
