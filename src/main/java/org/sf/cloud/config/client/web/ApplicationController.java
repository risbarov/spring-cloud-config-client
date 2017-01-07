package org.sf.cloud.config.client.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class DefaultController {

	@Autowired
	private Environment environment;

	@RequestMapping("/")
	@ResponseBody
	public String index() {
		return "Spring Cloud Config Client is running! Config text: " + environment.getProperty("sample.text");
	}

}
