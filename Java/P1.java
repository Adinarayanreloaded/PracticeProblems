package com.company;

class Person{

        String name;
        int age;
        char sex;
public Person(String name,int age,char sex)
        {
        this.name=name;
        this.age=age;
        this.sex=sex;
        }

public void display()
        {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Sex: "+sex);
        }
        Person modify(Person p)
        {
        p.name="Santhosh";
        p.age=27;
        p.sex='M';
        return p;
        }
        }
public class P1 {
    public static void main(String args[])
    {
        Person p = new Person("Revathi", 23, 'F');
        p.display();
        Person p1 = p.modify(p);
        p1.display();
        Person p2 = p1.modify(new Person("Upendar", 25, 'M'));
        p2.display();
    }
}
