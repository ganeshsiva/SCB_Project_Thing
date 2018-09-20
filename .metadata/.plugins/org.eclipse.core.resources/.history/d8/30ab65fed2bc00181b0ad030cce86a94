package com.Trade.controller;

import java.util.List;

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
@Controller
public class TradeController {
	
	@RequestMapping(value="check",method=RequestMethod.POST)
	public ModelAndView checkUser(HttpServletRequest req, Trade tt) {
		String type=req.getParameter("type");
		ModelAndView mav=new ModelAndView();
		HttpSession hs=req.getSession();
		if(type.equals("admin"))
			{
			String username=req.getParameter("name");
			
			String password=req.getParameter("password");
			if(username.equals("admin") && password.equals("admin"))
				{
				mav.setViewName("admin.jsp");
				}
			else
				{
				mav.addObject("errorMsg","invalid admin info");
				mav.setViewName("login.jsp");
				}
			}
			
			else if(type.equals("user"))
			{
			String username=req.getParameter("name");
			
			String password=req.getParameter("password");
			tt.setUsername(username);
			tt.setPassword(password);
			hs.setAttribute("obj", tt);
			int res=0;
			//ls.checkUserInfo(tt);
			if(res>0)
				{
				mav.setViewName("userhome.jsp");
				}
			else
			{
				mav.addObject("errorMsg","invalid user info");
				mav.setViewName("login.jsp");
			}
			}
		return mav;
		
	}
	
	@Autowired
	TradeService ts;
	@RequestMapping(value="csv",method=RequestMethod.POST)
	public ModelAndView upload(HttpServletRequest req, Trade tt) {
	ModelAndView mav=new ModelAndView();
	String type=req.getParameter("type");
	System.out.println(type);
	if(type.equals("upload"))
	{
		ts.uploadcsv(tt);
	
	int res=ts.insertdata(tt);
	if(res>0)
	{
		mav.setViewName("admin.jsp");
		mav.addObject("msg", "successfully added");
		
	}
	else
	{
		mav.setViewName("admin.jsp");
		mav.addObject("msg", "not added");
	}}
	else 
		{
		
		List<Trade>listOfData=ts.getTradeInfo();
		System.out.println("hi");
		mav.setViewName("displaydata.jsp");
		System.out.println("hello");
		mav.addObject("data",listOfData);
	}
	return mav;
	}
	
}
