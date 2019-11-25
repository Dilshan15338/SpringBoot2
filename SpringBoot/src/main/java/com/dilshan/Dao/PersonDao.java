package com.dilshan.Dao;

import com.dilshan.Entity.Person;

//import jdk.nashorn.internal.ir.SplitNode;
import com.google.gson.Gson;
import org.springframework.stereotype.Repository;

import javax.validation.constraints.Null;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class PersonDao {

    private static Map<Integer, Person> persons;

    static {
        persons = new HashMap<Integer, Person>(){
            {
                put(1,new Person(1,"Dilshan","Mihinthale","Colombo","8:30","M"));
                put(2,new Person(2,"Malinda","Anuradhapura","Mihinthale","8.30","M"));
                put(3,new Person(3,"Lakshan","Colombo","Kiribathgoda","7.30","M"));
            }
        };
    }

    public Collection<Person> getAllpersons(){


        return this.persons.values();
    }

    public Person getAPerson(int id)
    {

        return this.persons.get(id);

    }

}
