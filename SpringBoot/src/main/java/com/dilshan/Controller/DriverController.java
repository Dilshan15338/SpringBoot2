package com.dilshan.Controller;


import com.dilshan.Entity.Driver;
import com.dilshan.Service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/Drivers")
public class DriverController {
    @Autowired
    private DriverService driverService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Driver> getAlldrivers(){


        return this.driverService.getAlldrivers();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Driver getADriver(@PathVariable("id") int id)
    {

        return this.driverService.getADriver(id);

    }

}
