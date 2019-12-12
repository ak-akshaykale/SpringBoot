package cdac;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebController {

	@Autowired
	UserDao userDao;

	@GetMapping("/singup")
	public ModelAndView getIndex()
	{
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index");
		return modelAndView;
	}
	@GetMapping("/readusers")
	public ModelAndView getUsers()
	{
		ModelAndView model = new ModelAndView();
		List<User> ist =userDao.readAllUsers();
		model.addObject("USER_LIST",ist);
		model.setViewName("show");
		return model;
	}
}
