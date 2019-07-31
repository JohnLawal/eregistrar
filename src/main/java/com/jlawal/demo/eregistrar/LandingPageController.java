package com.jlawal.demo.eregistrar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LandingPageController {

	@GetMapping(value = {"/eregistrar", "/eregistrar/home"})
	public String displayLandingPage() {
		return "landing";
	}
}
