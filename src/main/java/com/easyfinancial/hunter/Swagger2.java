package com.easyfinancial.hunter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * http://127.0.0.1:8080/swagger-ui.html
 * Swagger2 格式 api 接口 url
 * @author arco
 *
 */
@Configuration

@EnableSwagger2
public class Swagger2 {
	/**
	 * 控制器所在包路徑
	 */
	private static String BASE_PACKAGE = "com.cjj.web";
	@Bean

	public Docket createRestApi() {

	return new Docket(DocumentationType.SWAGGER_2)

	.apiInfo(apiInfo())

	.select()

	.apis(RequestHandlerSelectors.basePackage(BASE_PACKAGE))

	.paths(PathSelectors.any())

	.build();

	}
	
	private ApiInfo apiInfo() {

		return new ApiInfoBuilder()

		.title("神驅阿瓦隆")

		.description("我的學習歷程")

		.termsOfServiceUrl("http://www.csdn.net/")

		.version("1.0")

		.build();

		}
}
