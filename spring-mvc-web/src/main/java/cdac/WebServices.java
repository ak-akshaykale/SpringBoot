package cdac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebServices {
	
	@RequestMapping("/")
	public String sayHello()
	{
		return "hello ak..!";
	}
	
	@RequestMapping("/hello")
	public String sayHello2()
	{
		return "hello akshay!";
	}
	@RequestMapping("/welcome")
	public String sayHello3()
	{
		return "hello Welcome!";
	}
}
