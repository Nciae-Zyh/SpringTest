package edu.nciae.zyh.annotation.service;

import edu.nciae.zyh.annotation.dao.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service()
public class Greeting {
    @Autowired()
    private Person person;
    public void setPerson(Person person){
        this.person=person;
    }
    public void say(){person.say();}
}
