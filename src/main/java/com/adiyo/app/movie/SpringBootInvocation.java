package com.adiyo.app.movie;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@EnableEncryptableProperties
@PropertySource(name="EncryptedProperties", value = "classpath:encrypted.properties")
public class SpringBootInvocation {

	private ApplicationContext applicationContext;

	public SpringBootInvocation() {
	}

	public void run() {
		applicationContext = new SpringApplicationBuilder(SpringBootInvocation.class).bannerMode(Banner.Mode.OFF).run();
	}

	public ApplicationContext getApplicationContext() {
		return applicationContext;
	}

}
