package com.lms.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lms.model.LeadAdmin;
import com.lms.service.LeadAdminService;

@Controller
public class LeadController {

	@Autowired
	LeadAdminService leadserv;
	
	@GetMapping(value="/leadadmin")
	public String showadminpage(Model model) {
		System.out.println("inside leadadmin page");
		LeadAdmin leadadmin=new LeadAdmin();
		model.addAttribute("leadadmin", leadadmin);
		//HashMap<String, String> source_typelist=new HashMap<String,String>();
		//source_typelist.put("one", "one");
		//source_typelist.put("two", "two");
		//model.addAttribute("sourcelist", source_typelist);
		
		//loading combo box
		
		System.out.println("map size:::"+leadserv.loadcomboxvalues().size());
		model.addAttribute("sourcelist", leadserv.loadcomboxvalues());
		
		List<String> slist=new ArrayList<String>();
		slist.add("one");
		slist.add("two");
		model.addAttribute("slist",slist);
		System.out.println("sdf");
		return "LeadAdmin.html";
	}
	
	@RequestMapping(value="/getvalues", method=RequestMethod.POST)
	public String getvalues(@ModelAttribute(value="leadadmin")LeadAdmin ld,Model model) {
		System.out.println("ID-->"+ld.getSource_id());
		//System.out.println("ID-->"+id);
		System.out.println("no-->"+ld.getAlternate_no());
		System.out.println("name-->"+ld.getFull_name());
		System.out.println("date-->"+ld.getDob());
		
		List<String> slist1=new ArrayList<String>();
		slist1.add("one...");
		slist1.add("two...");
		model.addAttribute("productlist1",slist1);
		
		//empserv.setvalues(name);
		//return "Welcome";
		return "LeadAdmin.html";
	}
	
	@GetMapping(value="/getrange1/{product1}")
	@ResponseBody
	public String getrange1(@PathVariable("product1") String product1 ) {
		System.out.println("inside getrange1");
		if(product1.equalsIgnoreCase("sample product1")) {
			return "range1";
		}else {
			return "range2";
		}
	}
}
