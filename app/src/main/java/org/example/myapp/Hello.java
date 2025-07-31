package org.example.myapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

  public Hello() {
    System.out.println("Hello의 생성자가 호출됨!");
  }

  @GetMapping("/hello")
  public String rootHello() {
    return "Hello Root!";
  }

  @GetMapping(path = "/hello/hi")
  public String hi() {
    return "Hello!";
  }

  @GetMapping(path = "/hello/hi2")
  public String hi2(String name) {
    return "안녕하세요 " + name + "님!";
  }

  @GetMapping(path = "/hi3")
  public String hi3() {
    return "Hello3!";
  }
}
