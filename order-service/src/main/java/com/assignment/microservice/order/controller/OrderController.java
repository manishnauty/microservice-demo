package com.assignment.microservice.order.controller;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.microservice.order.model.Order;

@RestController
public class OrderController {

	@GetMapping(path = "/order/{id}")
	List<Order> getOrders(@PathVariable long id) {
		return orderList();

	}

	private List<Order> orderList() {
		List<Order> orderList = new ArrayList<Order>();
		orderList.add(new Order(1, 250, LocalDate.of(2020, Month.APRIL, 14)));
		orderList.add(new Order(2, 450, LocalDate.of(2020, Month.FEBRUARY, 15)));
		return orderList;
	}
}
