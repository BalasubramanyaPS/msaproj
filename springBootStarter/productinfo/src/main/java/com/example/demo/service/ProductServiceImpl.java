package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.client.ItemClient;
import com.example.demo.model.ItemInfo;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ItemClient itemClient;

	@Override
	public ItemInfo getItemDetail() {
		return itemClient.getItemInfo();
	}

}
