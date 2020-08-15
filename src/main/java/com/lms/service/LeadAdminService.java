package com.lms.service;


import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.lms.Repository.LeadAdminRepository;



@Service
public class LeadAdminService {

	@Autowired
	LeadAdminRepository leadrepo;
	
	//private Map<String, String> smap;
	
	public HashMap<String, String> loadcomboxvalues() {
		
		System.out.println("calling hashmap values");
		
		return leadrepo.findAll();
	}
}
