package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.CatalogInfo;
import com.example.demo.model.ItemInfo;



@RestController
@RibbonClient
public class CatalogController {
	
	private String infoUri = "http://ITEM-INFO/getItemDetails";
	
	@Bean
	@LoadBalanced
	RestTemplate getRestTemplate(){
		return new RestTemplate();
	}
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping(value="/getCatalogDetails",produces=MediaType.APPLICATION_JSON_VALUE)
	public CatalogInfo fetchCatalogDetils()
	{
		CatalogInfo catalogInfo = new CatalogInfo();
		catalogInfo.setCatalogId("1");
		catalogInfo.setCatalogName("Catalog1");
		
		catalogInfo.setItemInfo(restTemplate.getForObject(infoUri, ItemInfo.class));
		
		return catalogInfo;
	}
}
