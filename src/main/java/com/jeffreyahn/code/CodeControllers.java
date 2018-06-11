package com.jeffreyahn.code;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CodeControllers {
	
	@RequestMapping("")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping(value="/code", method=RequestMethod.POST)
	public String code(@RequestParam(value="word") String word, RedirectAttributes redirectAttributes) {
		if(word.equals("bushido")) {
			return "code.jsp";
		} else {
			redirectAttributes.addFlashAttribute("error", "You must train harder!");
			return "redirect:/";
		}
	}
}
