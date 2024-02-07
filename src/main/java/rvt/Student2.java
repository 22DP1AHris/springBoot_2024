package rvt;

public class Student2 extends Person {
    public int credits;

    public Student2(String name, String adress){
        super(name, adress);
        this.credits = 0;
    }

    public void study(){
        this.credits++;
    }

    public int credits(){
        return this.credits;
    }

    public String toString(){
        return super.toString() + "\n   Study credits: " + credits;
    }
}
