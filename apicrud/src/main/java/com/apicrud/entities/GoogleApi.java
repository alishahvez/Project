package com.apicrud.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class GoogleApi {
	
	@Id
	private int id;
	
	private String apiUrl;
	
	

	public GoogleApi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GoogleApi(int id, String apiUrl) {
		super();
		this.id = id;
		this.apiUrl = apiUrl;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getApiUrl() {
		return apiUrl;
	}

	public void setApiUrl(String apiUrl) {
		this.apiUrl = apiUrl;
	}
	
	

	@Override
	public String toString() {
		return "GoogleApi [id=" + id + ", apiUrl=" + apiUrl + "]";
	}

	

}
