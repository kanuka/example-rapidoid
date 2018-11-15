package org.example.myapp.config;

import io.ebean.EbeanServer;
import io.ebean.EbeanServerFactory;
import io.ebean.config.ServerConfig;
import io.kanuka.Bean;
import io.kanuka.ContextModule;
import io.kanuka.Factory;
import org.example.myapp.domain.DTodo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ContextModule(name = "myapp")
@Factory
public class EbeanConfig {

  private static final Logger log = LoggerFactory.getLogger(EbeanConfig.class);

  @Bean
  void doStuffVoid() {

  }

  @Bean
  Junk buildJunk() {
    return new Junk();
  }

  @Bean
  public EbeanServer create() {

    ServerConfig config = new ServerConfig();
    config.addClass(DTodo.class);
    config.loadFromProperties();

    log.info("creating EbeanServer ...");

    return EbeanServerFactory.create(config);
  }
}
