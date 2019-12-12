package in.cdac;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@Controller
public class WebServices {
	
	@GetMapping("/hello")
	public String getHello()
	{
		return "Hello Spring..";
	}
	
	@RequestMapping
	@GetMapping("/")
	public ModelAndView getIndex()
	{
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index");
		return modelAndView;
	}
	@GetMapping("/sum")
	public int getSum(int no1,int no2)
	{
		return no1+no2;
	}
	
	@GetMapping("/fullname")
	@PostMapping("/sfullname")
	public String fullName(String fname,String mname,String lname)
	{
		return fname+" "+mname+" "+lname;
	}
}
