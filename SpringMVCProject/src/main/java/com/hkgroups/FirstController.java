package com.hkgroups;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FirstController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String Welcome() {
		return "welcome";
	}

	@RequestMapping("login")
	public String getVerify(@RequestParam ("name") String name , Model model) {
		model.addAttribute("name",name);
		return "login";
	}
}
