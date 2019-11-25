package com.dilshan.Controller;

import com.dilshan.Entity.Person;
import com.dilshan.Service.PersonService;
//import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//import java.lang.reflect.Method;
import java.util.Collection;

@RestController
@RequestMapping("/Persons")
public class PersonControler {
    @Autowired
    private PersonService personService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Person> getAllpersons(){

        return personService.getAllpersons();
    }

    @RequestMapping(value = "/{Id}" , method = RequestMethod.GET)
    public Person getAperson(@PathVariable("Id") int id){

        return personService.getAperson(id);
    }

}
