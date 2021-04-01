package com.paristaxifare.paristaxifareBack.web.controller;

import com.paristaxifare.paristaxifareBack.dao.TaxiDao;
import com.paristaxifare.paristaxifareBack.model.Taxi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaxiController {

    @Autowired
    private TaxiDao taxiDao;

    @RequestMapping(value="/taxis", method= RequestMethod.GET)
    @CrossOrigin(origins = "http://localhost:3000")
    public List<Taxi> listTaxis() {
        return taxiDao.findAll();
    }
}
