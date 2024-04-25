package com.java.springmvcdemo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.java.springmvcdemo.model.Alien;
import com.java.springmvcdemo.repository.AlienRepo;

@Controller
public class HomeController {
	
	@Autowired
	AlienRepo repo;
	
	@RequestMapping("/")
	public String home()
	{
		System.out.println("Home call");
		return "index";
	}
	
	
	@ModelAttribute
	public void modelData(Model m)
	{
		m.addAttribute("name","Aliens");
	}
	
	@RequestMapping("addAlien")
	public String addAlien(@ModelAttribute Alien a, Model m)
	{
		
		repo.save(a);
		return "result";
		
	}
	@GetMapping("getAliens")
	public String getAliens(Model m)
	{
//		List<Alien> aliens = Arrays.asList(new Alien(101, "pran"),new Alien(102,"pranathi"));
		
		m.addAttribute("result",repo.findAll());
		return "showAliens";				
	}
	
	@SuppressWarnings("deprecation")
	@RequestMapping("getAlien")
	public String getAlien(@RequestParam int id, Model m)
	{
		m.addAttribute("result",repo.getById(id));
		return "showAliens";
	}

	@RequestMapping("getAlienByName")
	public String getAlienByName(@RequestParam String name, Model m)
	{
//		m.addAttribute("result",repo.findByNameOrderByIdDesc(name));
		m.addAttribute("result",repo.find(name));

		return "showAliens";
	}
	
	/*
	 * @RequestMapping("add") public String add(HttpServletRequest req) { int num1 =
	 * Integer.parseInt(req.getParameter("num1")); int num2 =
	 * Integer.parseInt(req.getParameter("num2")); int result = num1+num2;
	 * 
	 * HttpSession session = req.getSession(); session.setAttribute("result",
	 * result);
	 * 
	 * return "result.jsp"; }
	 */
	
//	@RequestMapping("add")
//	public String add(@RequestParam("num1") int num1,@RequestParam("num2") int num2, HttpSession session)
//	{
//		int num3= num1+num2;
//		session.setAttribute("num3",num3);
//		return "result.jsp";
//	}
	
//	@RequestMapping("add")
//	public ModelAndView add(@RequestParam("num1") int num1,@RequestParam("num2") int num2)
//	{
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("result");
//		int num3= num1+num2;
//		mv.addObject("num3",num3);
//		return mv;
//	}

	@RequestMapping("add")
	public String add(@RequestParam("num1") int num1,@RequestParam("num2") int num2, Model m)
	{
		int num3= num1+num2;
		m.addAttribute("num3",num3);
		return "result";
	}
	
//	@RequestMapping("add")
//	public String add(@RequestParam("num1") int num1,@RequestParam("num2") int num2, ModelMap m)
//	{
//		int num3= num1+num2;
//		m.addAttribute("num3",num3);
//		return "result";
//	}
//	@RequestMapping("addAlien")
//	public String addAlien(@RequestParam("aid") int aid,@RequestParam("aname") String aname, Model m)
//	{
//		Alien a = new Alien();
//		a.setAid(aid);
//		a.setAname(aname);
//		
//		m.addAttribute("alien",a);
//		
//		return "result";
//		
//	}
	
}
