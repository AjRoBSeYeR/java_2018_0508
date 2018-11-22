package com.ipartek.formacion.gestiondocente.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@ComponentScan
@EnableSwagger2
@EnableWebMvc
public class SwaggerConfig {
 
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build().apiInfo(apiInfo())
        		.apiInfo(apiInfo())
        		.useDefaultResponseMessages(false);
    }
     
    private ApiInfo apiInfo() {
        ApiInfo apiInfo = new ApiInfo("gestion docente api",
                                        "",
                                        "1.0",
                                        "",
                                        new Contact("Ipartek", "https://www.ipartek.com/", "raul.abejon.delgado@gmail.com"),
                                        "Apache License",
                                        "");
        return apiInfo;
    }
}
