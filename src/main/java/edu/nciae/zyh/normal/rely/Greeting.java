package edu.nciae.zyh.normal.rely;

import edu.nciae.zyh.normal.rely.dao.Person;

public class Greeting {
    private Person person;

    public void setPerson(Person person) {
        this.person = person;
    }

    public void say(){
        person.say();
    }
}
