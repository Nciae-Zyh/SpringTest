package edu.nciae.zyh.normal.rel;

import edu.nciae.zyh.normal.rel.dao.Person;

public class Greeting {
    private Person person;

    public void setPerson(Person person) {
        this.person = person;
    }

    public void say(){
        person.say();
    }
}
