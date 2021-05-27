package com.care.root.tx;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	@GetMapping("buy_form")
	public String buy_form() {
		return "buy_form";
	}
}











