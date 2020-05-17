package com.assignment.microservice.aggregation.model;

import java.util.List;

public class OrderDetails {

	private UserDetails userDetails;
	private List<Order> orders;

	public OrderDetails() {
	}

	public OrderDetails(UserDetails userDetails, List<Order> orders) {
		super();
		this.userDetails = userDetails;
		this.orders = orders;
	}

	public UserDetails getUserDetails() {
		return userDetails;
	}

	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

}
