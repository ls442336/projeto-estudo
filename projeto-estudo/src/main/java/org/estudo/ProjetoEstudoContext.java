package org.estudo;

import javax.sql.DataSource;

import org.estudo.delegate.PersistirUsuarioDelegate;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjetoEstudoContext {

  @Bean
  public PersistirUsuarioDelegate persistirUsuarioDelegate() {
    return new PersistirUsuarioDelegate();
  }
}