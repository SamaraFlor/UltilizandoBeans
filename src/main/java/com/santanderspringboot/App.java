package com.santanderspringboot;


import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {

	public static void main(String[] args) {

            ApplicationContext  factory = new AnnotationConfigApplicationContext(AppConfig.class);
            
            
            Livro livro = factory.getBean(Livro.class);
            livro.setNome("Aplicaçoes em Java");
            livro.setCodigo("S3421GF");
            
            Autor autor = factory.getBean(Autor.class);
            autor.setNome("Ze Andre");
            livro.exibir();
            
            
            
            ((AbstractApplicationContext)factory).close();

	}

}
