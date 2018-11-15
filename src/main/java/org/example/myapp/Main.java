package org.example.myapp;

import io.ebean.Ebean;
import io.kanuka.SystemContext;
import org.rapidoid.annotation.Controller;
import org.rapidoid.setup.App;

import java.util.List;

public class Main {

  public static void main(String[] args) {

    Ebean.getDefaultServer();

    //FooService foo = new FooService();
    //HelloController hc = new HelloController(foo);

    List<Object> controllers = SystemContext.getBeans(Controller.class);
    App.beans(controllers);

//    IoCContext context = App.context();
//    Set<Object> instances = context.getManagedInstances();
//
//    On.get("/size").json((String message) -> message.length());

  }
}
