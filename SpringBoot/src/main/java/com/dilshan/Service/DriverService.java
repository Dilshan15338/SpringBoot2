package com.dilshan.Service;

import com.dilshan.Dao.DriverDao;
import com.dilshan.Entity.Driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class DriverService {

    @Autowired
    private DriverDao driverDao;

    public Collection<Driver> getAlldrivers(){


        return this.driverDao.getAlldrivers();
    }

    public Driver getADriver(int id)
    {

        return this.driverDao.getADriver(id);

    }

}
