package com.cg.marriageceremony.configuration;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {
	
	 @Bean
		public Docket productApi() {
			
			return new Docket(DocumentationType.SWAGGER_2)		
					.select().apis(RequestHandlerSelectors.basePackage("com.cg.marriageceremony.api"))
					.paths(PathSelectors.regex("/marriageceremony.*"))				
					.build()
					.apiInfo(metaInfo());
			}

			/**
			 * It Customize the Swagger Output.
			 * @return ApiInfo
			 */
			private ApiInfo metaInfo() {
				
				ApiInfo apiInfo = new ApiInfo(
					"Vivaah Application API", 
					"Created By Aadarsh, Arundhati, Deekshitha, Farhana,Lavanya, Rupesh", 
					"1.0", 
					"Terms of Service", 
					new Contact("JEE Full Stack", "https://www.capgemini.com/", "@capgemini.com"), 
					"Capgemini Licence v.1.0", 
					"https://www.capgemini.com/", new ArrayList<>());
					return apiInfo;
				}
	    

}
