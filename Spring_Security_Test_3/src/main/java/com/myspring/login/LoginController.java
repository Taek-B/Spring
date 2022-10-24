package com.myspring.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class LoginController {

	private static final Logger logger = 
			LoggerFactory.getLogger(LoginController.class);	
	@RequestMapping(value="/login/loginPage.do")
	public String loginPage() {
		return "/login/loginPage";
	}
	
	// 성공 시 해당 페이지는 없어요.
	//하지만, 로그인 실패 했을 때, 거부 당했을 때, 
	
	@RequestMapping(value="/login/accessDenied.do")
	public String accessDeniedPage() throws Exception {
		return "/login/accessDenied";
	}
}