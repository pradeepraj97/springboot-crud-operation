package com.mytask.demotask.controller;

import com.mytask.demotask.model.Bus;
import com.mytask.demotask.service.Busservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Buscontroller
{
    @Autowired
    Busservice busservice;
    @GetMapping("/bus")
    public List<Bus> getAllBus()
    {
        return busservice.getAllBus();
    }
    @PostMapping("/newdatainsert")
    public void saveBus(@RequestBody Bus bus)
    {
        busservice.saveBus(bus);

    }
    @PutMapping("/update")
    public Bus update(@RequestBody Bus bus)
    {
        busservice.update(bus);
        return bus;
    }

}