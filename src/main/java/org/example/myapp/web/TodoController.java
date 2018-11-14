package org.example.myapp.web;

import io.ebean.Ebean;
import org.example.myapp.domain.DTodo;
import org.example.myapp.service.FooService;
import org.rapidoid.annotation.Controller;
import org.rapidoid.annotation.GET;
import org.rapidoid.annotation.POST;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.List;


@Singleton
@Controller("/todo")
public class TodoController {

  private final FooService fooService;

  @Inject
  public TodoController(FooService fooService) {
    this.fooService = fooService;
  }

  @GET(uri = "/list")
  public List<DTodo> list() {

    List<DTodo> beans = Ebean.find(DTodo.class)
      .findList();

    return beans;
  }

  @POST(uri = "/insertSome")
  public String insertSome() {

    DTodo todo = new DTodo("one", "One");
    todo.save();

    DTodo todo1 = new DTodo("two", "Two");
    todo1.save();

    return "inserted a couple";
  }
}
