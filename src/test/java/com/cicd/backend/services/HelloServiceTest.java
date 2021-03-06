package com.cicd.backend.services;

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
  void testHelloServiceMethodNameShouldReturnAppendedName() {
    String name = "Mark Zuckerberg";
    assertEquals("Hello Mark Zuckerberg", this.helloService.sayHelloTo(name));
  }

  @Test
  void testWelcomeMessageShouldReturnString() {
    assertEquals("Welcome", this.helloService.welcomeMessage());
  }
}
