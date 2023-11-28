package jp.co.amgakuin.javaclass2023.chat;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {

	@GetMapping("/chat/")
	public String entry() {
		return "chat/entry";
	}
}
