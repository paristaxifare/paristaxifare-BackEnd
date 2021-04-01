package com.paristaxifare.paristaxifareBack.dao;
import com.paristaxifare.paristaxifareBack.model.Taxi;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TaxiDaoImpl implements TaxiDao{

    public static List<Taxi> taxis = new ArrayList<>();
    static {
        taxis.add(new Taxi(1, 2, new String("2020-06-19T13:01:17.031Z"), 9000));
        taxis.add(new Taxi(2, 1, new String("2020-06-19T12:01:17.031Z"), 6000));
        taxis.add(new Taxi(3, 5, new String("2020-06-19T14:01:17.031Z"), 7000));
        taxis.add(new Taxi(4, 5, new String("2020-06-19T14:11:17.031Z"), 4000));
        taxis.add(new Taxi(5, 1, new String("2020-06-19T20:11:17.031Z"), 4000));
    }
    @Override
    public List<Taxi> findAll() {
        return taxis;
    }

}
