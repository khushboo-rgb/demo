package com.cybage.model;

public class CatalogItem {
	private String name;
	private String desc;
	private Integer ratings;
	
	
	
	public CatalogItem() {
		
	}

	public CatalogItem(String name, String desc, Integer ratings) {
		super();
		this.name = name;
		this.desc = desc;
		this.ratings = ratings;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Integer getRatings() {
		return ratings;
	}
	public void setRatings(Integer ratings) {
		this.ratings = ratings;
	}

	@Override
	public String toString() {
		return "CatalogItem [name=" + name + ", desc=" + desc + ", ratings=" + ratings + "]";
	}
	
	

}
