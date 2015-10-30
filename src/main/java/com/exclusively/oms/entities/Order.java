package com.exclusively.oms.entities;

import java.util.List;

public class Order {

	private List<Suborder> suborders;
	

	// Getters/Setters
	
	public List<Suborder> getSuborders() {
		return suborders;
	}

	public void setSuborders(List<Suborder> suborders) {
		this.suborders = suborders;
	}
	
}
