package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ItemInfo;
import com.example.demo.model.ProductInfo;
import com.example.demo.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService prdSrv;
	
	@RequestMapping(value="/getProductDetails",produces=MediaType.APPLICATION_JSON_VALUE)
	public ProductInfo fetchItemDetils()
	{
		ProductInfo productInfo = new ProductInfo();
		productInfo.setProductId("1");
		productInfo.setProductName("TetsProduct");

		List<ItemInfo> itemInfoList = new ArrayList<ItemInfo>();
		ItemInfo item = prdSrv.getItemDetail();
		itemInfoList.add(item);
		productInfo.setItemInfoList(itemInfoList);
		
		return productInfo;
	}

}
