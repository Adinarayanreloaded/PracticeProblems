package com.company;

class Employee{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("and my name is "+ name);
    }

    public int getSalary(){
        return salary;
    }
}

public class salary {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee aditya = new Employee();
        Employee sayak = new Employee();


        aditya.id = 1;
        aditya.salary = 100000;
        aditya.name = "Aditya Narayan Sharma";


        sayak.id = 2;
        sayak.salary = 100000;
        sayak.name = "Sayak Chatterjee";


        aditya.printDetails();
        sayak.printDetails();
        int salary = aditya.getSalary();
        int salary2= sayak.getSalary();
        System.out.println(salary);
        System.out.println(salary2);
       ;
    }
}
