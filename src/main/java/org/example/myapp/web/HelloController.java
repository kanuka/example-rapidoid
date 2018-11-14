package org.example.myapp.web;

import org.example.myapp.service.FooService;
import org.rapidoid.annotation.Controller;
import org.rapidoid.annotation.GET;

import javax.inject.Inject;
import javax.inject.Singleton;


@Singleton
@Controller("/hello")
public class HelloController {

  private final FooService fooService;

  @Inject
  public HelloController(FooService fooService) {
    this.fooService = fooService;
  }

  @GET(uri = "/")
  public String hello() {
    return "Hello there " + fooService.doIt();
  }

  @GET(uri = "/hi")
  public String hi() {
    return "Hi there " + fooService.doIt();
  }
}
