package com.mytask.demotask.service;

import com.mytask.demotask.model.Bus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mytask.demotask.repository.BusRepository;

import java.util.List;
@Service

public class Busservice {
    @Autowired
    BusRepository BusRepository;
    public List<Bus> getAllBus()
    {

        return  BusRepository.findAll();

    }
    public  void saveBus(Bus bus)
    {
        BusRepository.save(bus);
    }
    public void update(Bus bus)
    {
        BusRepository.save(bus);
    }
}
