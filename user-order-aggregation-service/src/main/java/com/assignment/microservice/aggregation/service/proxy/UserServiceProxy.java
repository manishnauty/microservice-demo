package com.assignment.microservice.aggregation.service.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.assignment.microservice.aggregation.model.UserDetails;

@FeignClient(name="user-service", url="${USER_SERVICE_URI:http://localhost}:8080")
public interface UserServiceProxy {
	
	@GetMapping("/user/{id}")
	public UserDetails retieveUserDetails(@PathVariable long id);

}
