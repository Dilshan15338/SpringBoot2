package com.dilshan.Service;

import com.dilshan.Dao.PersonDao;
import com.dilshan.Entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;


@Service
public class PersonService {
    @Autowired
    private PersonDao personDao;

    public Collection<Person> getAllpersons(){

        return personDao.getAllpersons();
    }

    public Person getAperson(int id)
    {
        return personDao.getAPerson(id);
    }
}
