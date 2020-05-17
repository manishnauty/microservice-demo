package com.assignment.microservice.aggregation.service.proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.assignment.microservice.aggregation.model.Order;

@FeignClient(name="order-service", url="${ORDER_SERVICE_HOST:http://localhost}:8080")
public interface OrderServiceProxy {
	
	@GetMapping("/order/{id}")
	public List<Order> retrieveOrder(@PathVariable long id);

}
