package com.example.demo.client;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.ItemInfo;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Component
public class ItemClient {

	private String infoUri = "http://localhost:9005/getItemDetails";

	@HystrixCommand(fallbackMethod="getItemFromCache")
	public ItemInfo getItemInfo() {
		return new RestTemplate().getForObject(infoUri, ItemInfo.class);
	}

	public ItemInfo getItemFromCache(){
		ItemInfo iInfo = new ItemInfo();
		iInfo.setItemDesc("I am dummy");
		iInfo.setItemId("99999");
		return iInfo;
	}
	
	
}
