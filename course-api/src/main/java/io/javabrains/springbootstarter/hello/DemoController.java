package io.javabrains.springbootstarter.hello;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	//Logger logger =LoggerFactory.getLogger(DemoController.class);
	
	@RequestMapping("/show")
	public String showData()
	{
		//logger.info("inside Demo Controller");
		return "hello My First RestFull Web Controller";
	}
}
