package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component
public class CatalogInfo {

	private String catalogId;
	private String catalogName;
	private ItemInfo itemInfo;
	public String getCatalogId() {
		return catalogId;
	}
	public void setCatalogId(String catalogId) {
		this.catalogId = catalogId;
	}
	public String getCatalogName() {
		return catalogName;
	}
	public void setCatalogName(String catalogName) {
		this.catalogName = catalogName;
	}
	public ItemInfo getItemInfo() {
		return itemInfo;
	}
	public void setItemInfo(ItemInfo itemInfo) {
		this.itemInfo = itemInfo;
	}
	
	
	
}
