package com.apicrud.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apicrud.entities.GoogleApi;

@Service
public class GoogleRepoService {
	
	
	@Autowired
	GoogleApiRepository googleRepo;
	
	public void updateApi(GoogleApi obj, int id) {
		// TODO Auto-generated method stub
		
		
		
		List<GoogleApi> list = (List<GoogleApi>) googleRepo.findAll();
		
		for(int i=0;i<list.size();i++) {
			
			if(list.get(i).getId()==id) {
				
				list.get(0).setApiUrl(obj.getApiUrl());
				list.get(0).setId(obj.getId());
				googleRepo.save(list.get(i));
				break;
			}
		}
		
		
		
	}

}
