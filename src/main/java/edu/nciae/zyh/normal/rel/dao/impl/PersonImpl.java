package edu.nciae.zyh.normal.rel.dao.impl;

import edu.nciae.zyh.normal.rel.dao.Person;

public class PersonImpl implements Person {
    private String name;
    private String word;

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
