package com.company;

class Rahul{
    void func1()
    {
        System.out.println(" Rahul is the wicketkeeper for the test team ");
    }
}
class Pujara extends Rahul {
    void func2()
    {
        System.out.println(" Pujara is the batsmen in the test team  ");
    }
}

class Rahane extends Rahul
{
    void func3()
    {
        System.out.println(" Rahane is the vice captain of the test team ");
    }
}

public class cricket2
{
    public static void main(String args[])
    {
        System.out.println(" Hierarchial Inheritance ");
        Rahane obj1=new Rahane();
        obj1.func3();
        obj1.func1();
        Pujara obj2=new Pujara();
        obj2.func2();
        obj2.func1();
    }
}