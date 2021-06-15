package edu.nciae.zyh.normal;

public class Greeting {
    private String name;
    private String word;
    public Greeting(){
    }
    public Greeting(String name,String word){
        this.name=name;
        this.word=word;
    }

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

    public void say(){
        System.out.println(name+"说：“"+word+"。”");
    }

    public Integer say2(Integer integer){
        System.out.println("输入值为："+integer+"。理论返回值应为"+integer*6);
        return integer*6;
    }
}
