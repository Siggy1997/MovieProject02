package com.movie.web.qna;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QnAController {
	
	@GetMapping("qna")
	public String qna() {
		
		return "qna";
	}
}
