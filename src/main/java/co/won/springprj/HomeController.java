package co.won.springprj;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/home.do")
	public String home(Model model) { // model : 돌려줄 값을 싩어주는 객체
		return "home/home";
	}
}
