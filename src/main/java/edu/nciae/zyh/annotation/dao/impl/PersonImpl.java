package edu.nciae.zyh.annotation.dao.impl;

import edu.nciae.zyh.annotation.dao.Person;
import org.springframework.stereotype.Repository;

@Repository("person")
public class PersonImpl implements Person {
    private String name="张嘎";
    private String word="三天不打小鬼子，手都痒痒！";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public PersonImpl(){};
    public PersonImpl(String name,String word){
        this.name=name;
        this.word=word;
    }
    @Override
    public void say() {
        System.out.println(name+"说：“"+word+"。”");
    }
}
