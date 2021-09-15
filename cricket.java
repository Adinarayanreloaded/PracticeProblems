package com.company;

class Dhoni{
    void func1()
    {
        System.out.println(" Dhoni was the wicketkeeper of the ODI cricket team ");
    }
}
class Kohli extends Dhoni {
    void func2()
    {
        System.out.println(" Kohli is the current captain of the ODI cricket team ");
    }
}

class Rohit extends Kohli
{
    void func3()
    {
        System.out.println(" Rohit is the vice captain of the ODI cricket team ");
    }
}

public class cricket
{
    public static void main(String args[]){
        System.out.println(" Single Inheritance ");
        Kohli d=new Kohli();
        d.func1();
        d.func2();
        System.out.println(" Multilevel Inheritance ");
        Rohit d1=new Rohit();
        d1.func1();
        d1.func2();
        d1.func3();
    }
}