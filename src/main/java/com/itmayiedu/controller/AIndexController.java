package com.itmayiedu.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;

@SpringBootApplication
@Controller
public class AIndexController {

	@RequestMapping("/getAInfo")
	public String getBInfo() {
		return "aIndex";
	}
	
	@RequestMapping("/forwardB")
	@ResponseBody
	public JSONObject forwardB() {
		JSONObject result = HttpClientUtils.httpGet("http://b.itmayiedu.com:9001/getBInfo");
		return result;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(AIndexController.class, args);
	}
	
}
