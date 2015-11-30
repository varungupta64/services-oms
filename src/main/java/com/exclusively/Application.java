package com.exclusively;

import static com.google.common.collect.Lists.newArrayList;
import static springfox.documentation.schema.AlternateTypeRules.newRule;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.logging.Logger;

import javax.sql.DataSource;

import org.joda.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.async.DeferredResult;

import com.fasterxml.classmate.TypeResolver;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.schema.WildcardType;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.AuthorizationScope;
import springfox.documentation.service.SecurityReference;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.SecurityConfiguration;
import springfox.documentation.swagger.web.UiConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableAutoConfiguration
@EnableDiscoveryClient
@EntityScan("com.exclusively.oms.entities")
@EnableJpaRepositories("com.exclusively.oms.repositories")
//@PropertySource("classpath:db-config.properties")
@EnableSwagger2
@EnableAspectJAutoProxy
public class Application {
	protected Logger logger = Logger.getLogger(Application.class.getName());

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	/**
	 * Creates an in-memory "rewards" database populated with test data for fast
	 * testing
	 */
	/*@Bean
	public DataSource dataSource() {
		logger.info("dataSource() invoked");

		// Create an in-memory H2 relational database containing some demo
		// accounts.
		DataSource dataSource = (new EmbeddedDatabaseBuilder()).addScript("classpath:testdb/schema.sql")
				.addScript("classpath:testdb/data.sql").build();

		logger.info("dataSource = " + dataSource);

		return dataSource;
	}*/
	
	@Bean
	  public Docket petApi() {
	    return new Docket(DocumentationType.SWAGGER_2)
	        .select()
	          .apis(RequestHandlerSelectors.basePackage("com.exclusively.oms.controllers"))
	          .paths(PathSelectors.any())
	          .build()
	        .pathMapping("/")
	        .directModelSubstitute(LocalDate.class,
	            String.class)
	        .genericModelSubstitutes(ResponseEntity.class)
	        .alternateTypeRules(
	            newRule(typeResolver.resolve(DeferredResult.class,
	                    typeResolver.resolve(ResponseEntity.class, WildcardType.class)),
	                typeResolver.resolve(WildcardType.class)))
	        .useDefaultResponseMessages(false)
	        .globalResponseMessage(RequestMethod.GET,
	            newArrayList(new ResponseMessageBuilder()
	                .code(500)
	                .message("500 message")
	                .responseModel(new ModelRef("Error"))
	                .build()))
	        .securitySchemes(newArrayList(apiKey()))
	        .securityContexts(newArrayList(securityContext()))
	        //.enableUrlTemplating(true)
	        ;
	  }

	  @Autowired
	  private TypeResolver typeResolver;

	  private ApiKey apiKey() {
	    return new ApiKey("mykey", "api_key", "header");
	  }

	  private SecurityContext securityContext() {
	    return SecurityContext.builder()
	        .securityReferences(defaultAuth())
	        .forPaths(PathSelectors.regex("/anyPath.*"))
	        .build();
	  }

	  List<SecurityReference> defaultAuth() {
	    AuthorizationScope authorizationScope
	        = new AuthorizationScope("global", "accessEverything");
	    AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
	    authorizationScopes[0] = authorizationScope;
	    return newArrayList(
	        new SecurityReference("mykey", authorizationScopes));
	  }

	  @Bean
	  SecurityConfiguration security() {
	    return new SecurityConfiguration(
	        "test-app-client-id",
	        "test-app-realm",
	        "test-app",
	        "apiKey");
	  }

	  @Bean
	  UiConfiguration uiConfig() {
	    return new UiConfiguration(
	        "validatorUrl");
	  }
}
