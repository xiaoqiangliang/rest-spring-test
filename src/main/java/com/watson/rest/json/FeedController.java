//FINAL 
package com.watson.rest.json;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.watson.rest.feeds.TournamentContent;
import com.watson.rest.feeds.TrainAndTest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Controller
public class FeedController {
	    
	@RequestMapping("/classes")  
    public String getJSON(
    		@RequestParam("id") int id,
    		@RequestParam("ModleFile") String ModleFile,
    		@RequestParam("Doc") String Doc,
    		
    		Model model) throws Exception {  
			TournamentContent str1 = TournamentContent.generateContent(Doc,id,ModleFile);
			model.addAttribute("分类结果",str1); 
			return "jsontournamenttemplate";  
    }  
	
	
	@SuppressWarnings("static-access")
	@RequestMapping("/trainned")
	public String trained(
			@RequestParam("ModleFile") String ModleFile,
			@RequestParam("sourceFile") String sourceFile
			) throws Exception{
		TrainAndTest tat = new TrainAndTest();
		tat.TrainedAModle(sourceFile,ModleFile);
		String result = "finish";
		return result;
	}
	
  

}
