package com.assignment.microservice.aggregation.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.microservice.aggregation.model.Order;
import com.assignment.microservice.aggregation.model.OrderDetails;
import com.assignment.microservice.aggregation.model.UserDetails;
import com.assignment.microservice.aggregation.service.proxy.OrderServiceProxy;
import com.assignment.microservice.aggregation.service.proxy.UserServiceProxy;

@RestController
public class AggregationController {

	@Autowired
	private UserServiceProxy userServiceProxy;

	@Autowired
	private OrderServiceProxy orderServiceProxy;

	@GetMapping(path = "/health")
	public String getMessage() {
		return "application is up and running";
	}

	@GetMapping(path = "/orderdetails/{id}")
	public OrderDetails getUsersOrderDetail(@PathVariable long id) {

		List<Order> orderList = orderServiceProxy.retrieveOrder(id);
		UserDetails userDetails = userServiceProxy.retieveUserDetails(id);
		return new OrderDetails(userDetails, orderList);

	}

}
