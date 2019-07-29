package com.imooc.springMVC.Controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/Controller")
public class useController {
	
	@RequestMapping(value = "/getString")
	@ResponseBody
	public String getString() {
		return "Hello";
	}
	
	/*
	 * @ResponseBody 将Object对象，转换为json
	 */
	@RequestMapping(value = "/getJSON")
	@ResponseBody
	public Map<String,String> getJSON(Model model){
		HashMap<String,String> map=new HashMap<String,String>();
        map.put("name", "刘晓燕");
        map.put("sex", "女");
        map.put("age", "23");
		return map;
	}
	
}
