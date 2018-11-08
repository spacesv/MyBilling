package it.my.billing.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import springfox.documentation.annotations.ApiIgnore;

@Controller
@ApiIgnore 
public class SwaggerRootController {
	
	@RequestMapping(path="/")
	public String redirectToSwagger() {
		return "redirect:/swagger-ui.html";
	}

}
