package com.company;

class EncapsulationDemo{
    private int salary;
    private String empName;
    private int empAge;

    public int getEmpSal(){
        return salary;
    }

    public String getEmpName(){
        return empName;
    }

    public int getEmpAge(){
        return empAge;
    }

    public void setEmpAge(int newValue){
        empAge = newValue;
    }

    public void setEmpName(String newValue){
        empName = newValue;
    }

    public void setEmpSal(int newValue){
        salary = newValue;
    }
}
public class emp{
    public static void main(String[] args)
    {
        EncapsulationDemo obj = new EncapsulationDemo();
        obj.setEmpName("Aditya");
        obj.setEmpAge(21);
        obj.setEmpSal(100000);
        System.out.println("Employee Name: " + obj.getEmpName());
        System.out.println("Employee SSN: " + obj.getEmpSal());
        System.out.println("Employee Age: " + obj.getEmpAge());
    }
}