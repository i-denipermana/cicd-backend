package com.cicd.backend.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloServiceTest {

  private HelloService helloService;

  @BeforeEach
  void setUp() {
    this.helloService = new HelloService();
  }

  @Test
  void testHelloServiceShouldReturnAppendedName() {
      String name = "Mark Zuckerberg";
      assertEquals("Hello Mark Zuckerberg", this.helloService.helloName(name));
  }
}
