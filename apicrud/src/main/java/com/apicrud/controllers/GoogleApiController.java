package com.apicrud.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.apicrud.entities.GoogleApi;
import com.apicrud.repositories.GoogleApiRepository;
import com.apicrud.repositories.GoogleRepoService;

@Controller
@RequestMapping("/googleapi")
public class GoogleApiController {
	
	
	@Autowired
	GoogleApiRepository googleRepo;
	
	@Autowired
	GoogleRepoService googleSer;
	
	
	
	//Creating Object POST-Mapping
	
	@ResponseBody
	@RequestMapping(value="/new", method = RequestMethod.POST)
	public String createGoogleApi(@RequestBody GoogleApi gobj) {
		
		googleRepo.save(gobj);
		return "success";
	}
	
	
	
	
	// Getting Object GET-Mapping
	
	@ResponseBody
	@RequestMapping(value = "/view" , method = RequestMethod.GET )
	public List<GoogleApi> viewApi() {
		
		List<GoogleApi> allApiList = (List<GoogleApi>) googleRepo.findAll();
		
		return allApiList;
	}
	
	// Getting Object based on Id GET-Mapping
	
	@ResponseBody
	@RequestMapping(value = "/view/{id}", method = RequestMethod.GET)
	public Optional<GoogleApi> viewById(@PathVariable Integer id ) {
		
		Optional<GoogleApi> obj = googleRepo.findById(id);
		
		return obj;
	}
	
	
	@ResponseBody
	@RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
	public GoogleApi updatById(@PathVariable Integer id, @RequestBody GoogleApi obj) {
		
                 googleSer.updateApi(obj, id);
                 return obj;
		
	}

}
