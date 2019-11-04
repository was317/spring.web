package spring.web.ch01.ex02;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ch01/ex02")
public class UserController {
	@RequestMapping("/1")
	public String user1(){
		return "ch01/ex02/user";
	}
	
	@RequestMapping("/2")
	public String user2(Model model){
		model.addAttribute("user1", new User("최한석", 23));
		model.addAttribute("user2", new User("김한석", 23));
		return "ch01/ex02/user";
	}
	
	@RequestMapping("/3")
	public void user3(User user1){
		user1.setName("한아름");
		user1.setAge(30);
	}
	
	@RequestMapping("/4")
	@ModelAttribute("man")
	public void user4(User user){
		user.setName("양승일");
		user.setAge(51);
		
		
	}
	
	@RequestMapping("/5")
	public User user5(){
		User user = new User();
		user.setName("김가람");
		user.setAge(45);
		return user;
	}
	
	@RequestMapping("/6")
	@ModelAttribute("human")
	public User user6(){
		User user = new User();
		user.setName("박현빈");
		user.setAge(27);
		return user;
	}

}
