package com.company;

interface one {
    public void func1();
}
interface two {
    public void func2();
}
interface three extends one, two {
    public void func1();
}
class child implements three {
    @Override
    public void func1() {
        System.out.println(" Indian cricket team is the best in the world ");
    }
    public void func2() {
        System.out.println(" It is one of the toughest sides to play ");
    }
}

public class cricket3
{
    public static void main(String args[]){
        System.out.println(" Multiple inheritance using Interfaces ");
        child o1=new child();
        o1.func1();
        o1.func2();
        o1.func1();
    }
}