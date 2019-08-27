package org.boot.yq.controler;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.boot.yq.product.product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class bootcontroler {
	@ResponseBody
	@RequestMapping("requ")
	public String requ() {
		
	return "hi,springboot"	;
		
		
		
		
	}
	@RequestMapping("welcome")
	public String welcome( Map<String, Object> map) {
		
		map.put("message", "晚上好");
		List<product> a=new ArrayList<>();
		a.add(new product("A", 150,20));
		a.add(new product("B", 200,20));
		a.add(new product("C",250,30));
		map.put("a", a);
		return "threaf";
	}
	
	

}
