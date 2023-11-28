package jp.co.amgakuin.javaclass2023;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TopController {

	@GetMapping("/")
	public String topPage() {
		return "index";
	}
}
