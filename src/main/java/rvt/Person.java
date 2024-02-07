package rvt;

public class Person {
    protected String name;
    protected String adress;

    public Person(String name, String adress){
        this.name = name;
        this.adress = adress;
    }

    public String toString(){
        return name + "\n   " + adress;
    }
}