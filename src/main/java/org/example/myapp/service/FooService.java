package org.example.myapp.service;

import io.ebean.EbeanServer;

import javax.inject.Singleton;

@Singleton
public class FooService {

  private final EbeanServer server;

  public FooService(EbeanServer server) {
    this.server = server;
  }

  public String doIt() {
    return "done";
  }

}
