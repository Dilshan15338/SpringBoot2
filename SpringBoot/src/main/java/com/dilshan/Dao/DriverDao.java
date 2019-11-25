package com.dilshan.Dao;

import com.dilshan.Entity.Driver;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


@Repository
public class DriverDao {

    private static Map<Integer, Driver> drivers;

    static {
        drivers = new HashMap<Integer, Driver>(){
            {
                put(1, new Driver(1, "Dasun", "Mihinthale", "Colombo", "8.30", "M"));
                put(2, new Driver(2, "Nipuna", "Anuradhapura", "Mihinthale", "8.30", "M"));
                put(3, new Driver(3, "Chinthaka", "Colombo", "Kiribathgoda", "7.30", "M"));
            }
        };
    }

    public Collection<Driver> getAlldrivers(){


        return this.drivers.values();
    }

    public Driver getADriver(int id)
    {

        return this.drivers.get(id);

    }

}
