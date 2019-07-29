package com.imooc.springMVC.Controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/restController")
public class useRestController {

	@RequestMapping(value = "/getString")
		public String getString() {
		return "Hello";
	}

	@RequestMapping(value = "/getJSON")
	public Map<String, String> getJSON(Model model) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("name", "刘晓燕");
		map.put("sex", "女");
		map.put("age", "23");
		return map;
	}

}
