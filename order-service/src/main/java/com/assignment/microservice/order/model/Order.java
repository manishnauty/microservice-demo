package com.assignment.microservice.order.model;

import java.time.LocalDate;

public class Order {

	private long orderId;
	private double orderAmount;
	private LocalDate orderDate;

	public Order() {
	}

	public Order(long orderId, double orderAmount, LocalDate orderDate) {
		this.orderId = orderId;
		this.orderAmount = orderAmount;
		this.orderDate = orderDate;
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public double getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

}
