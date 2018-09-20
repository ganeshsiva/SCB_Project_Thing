package com.Trade.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//import com.Trade.bean;
import com.Trade.Bean.Trade;
import com.Trade.service.TradeService;
//import com.project2.bean.Athlete;

public class Controller {
public static int count = 0;
	public static void flow(String s1)
	{	
		String s = s1.toLowerCase();
		if(
				(s.contains("saving") && s.contains("credit") && s.contains("loan"))
				||(s.contains("saving") && s.contains("credit"))
				||(s.contains("credit") && s.contains("loan"))
				||(s.contains("saving") && s.contains("loan"))
		  )
		{
			/*error stuff*/
			errorfunc();
		}
		else if(s.contains("saving"))
		{saving(s);}
		else if(s.contains("credit"))
		{credit(s);}
		else if(s.contains("loan"))
		{loan(s);}
		
		else
		{
			/*error stuff*/
			errorfunc();
		}
		
		
	}
	public static void saving(String s)
	{
		if(s.contains("balance"))
		{}
		else if(s.contains("interest"))
		{}
		else if(s.contains("transaction"))
		{}
		else
		{count++;
		
		
		if(count<3)
		{/*tts and stt*//*try again tts message*/
		saving(s);
		}
		else
		{count =0; errorfunc();}
		}
	}
	public static void credit(String s)
	{
		if(s.contains("outstanding"))
		{}
		else if(s.contains("due")||s.contains("date"))
		{}
		else if(s.contains("transaction"))
		{}
		else
		{count++;
		if(count<3)
		{/*try again tts message*/
		saving(s);
		}
		else
		{count =0; errorfunc();}
		}
	}
	public static void loan(String s)
	{if(s.contains("principle"))
	{}
	else if(s.contains("interest"))
	{}
	else if(s.contains("pending"))
	{}
	else if(s.contains("emi"))
	{}
	else
	{count++;
	if(count<3)
	{/*try again tts message*/
	saving(s);
	}
	else
	{count =0; errorfunc();}
	}}
	public static void errorfunc()
	{/*relevant error function*/
		/*call flow() again*/
	}	

	
}