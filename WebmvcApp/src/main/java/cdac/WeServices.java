package cdac;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class WeServices
{
	@Autowired
	UserDao userDao;
	
	@GetMapping("/")
	public String getHello()
	{
		return "Hello bro..!";
	}
	
	@RequestMapping
	@GetMapping("/create")
	public String createNew(User u)
	{
		boolean result =userDao.createUser(u);
		if(result)
			return "User Created Successfully..!";
		return "User not created!";
	}
	
}
