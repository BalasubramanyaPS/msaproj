package com.example.demo.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ItemInfo;


@RestController
public class ItemInfoController {
	@RequestMapping(value="/getItemDetails",produces=MediaType.APPLICATION_JSON_VALUE)
	public ItemInfo fetchItemDetils()
	{
		ItemInfo itemInfo = new ItemInfo();
		itemInfo.setItemId("item2");
		itemInfo.setItemDesc("Item1 Description");
		return itemInfo;
	}
}
