package com.test.controller;

import com.mytask.demotask.model.Bus;
import com.mytask.demotask.service.Busservice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
class Buscontroller
{
    private Busservice busservice;
	@GetMapping("/bus")
    public List<Bus> getAllBus()
	{
		return busservice.getAllBus();
	}

}