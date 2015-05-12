package com.watson.rest.feeds;

import java.util.Date;

import com.watson.rest.feeds.TrainAndTest;



public class TournamentContent {

	private int id;
    private String classes;
    

    public static TournamentContent generateContent(String inputs,int idc, String ModleFile) throws Exception {
    	
		TrainAndTest tat = new TrainAndTest();
		String print = tat.ClassOfADoc(inputs, ModleFile);
		System.out.println("分类" + print);
		
        TournamentContent content = new TournamentContent();

        
        content.id = idc;
        content.classes = print;
        
        
        return content;
    }
    
    public int getId() {
        return id;
    }

    public String getclasses() {
        return classes;
    }



	
}
