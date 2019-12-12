package in.cdac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Viewer {
	
	private UserDao userDao = new UserDao();
	
	@GetMapping("/singup")
	public ModelAndView getValid(User u)
	{
		ModelAndView model = new ModelAndView();
		boolean add = userDao.adduser(u);
		//if(add)
			model.setViewName("home");
		//else
		//	model.setViewName("index");
		return model;
	}
	
	@GetMapping("/d")
	public ModelAndView getIndex()
	{
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index");
		return modelAndView;
	}
	
}
