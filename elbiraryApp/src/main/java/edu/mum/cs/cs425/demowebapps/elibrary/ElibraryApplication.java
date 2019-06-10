package edu.mum.cs.cs425.demowebapps.elibrary;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ElibraryApplication extends SpringBootServletInitializer{

    public static void main(String[] args) {
        SpringApplication.run(ElibraryApplication.class, args);
    }
    
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder app) {
    	
    	return app.sources(SpringApplicationBuilder.class);
    }

}


//@SpringBootApplication
//@ComponentScan("edu.mum.cs.cs425.demowebapps.elibrary")
//public class ElibraryApplication extends SpringBootServletInitializer {
//
//  public static void main(String[] args) {
//      SpringApplication.run(ElibraryApplication.class, args);
//  }
  
 
//}