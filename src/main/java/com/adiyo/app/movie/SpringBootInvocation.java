package com.adiyo.app.movie;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@EnableEncryptableProperties
@PropertySource(name="EncryptedProperties", value = "classpath:encrypted.properties")
public class SpringBootInvocation extends SpringBootServletInitializer {

	/*private ApplicationContext applicationContext;

	public SpringBootInvocation() {
	}

	public void run() {
		applicationContext = new SpringApplicationBuilder(SpringBootInvocation.class).bannerMode(Banner.Mode.OFF).run();
	}

	public ApplicationContext getApplicationContext() {
		return applicationContext;
	}*/

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringBootInvocation.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootInvocation.class, args);
    }


}
