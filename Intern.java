package com.company;

class Intern_Salary
{
    int salary;
    String name;
    public int getSalary()
    {
        return salary;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name = n;
    }
}

class Intern_Details
{
    int emp_id;
    String designation;
    String company_name;

    Intern_Details(int emp_id,String designation,String company_name)
    {
        this.emp_id=emp_id;
        this.designation=designation;
        this.company_name=company_name;
    }
    void display()
    {
        System.out.println(" Intern id is "+ emp_id);
        System.out.println(" Designation is "+ designation);
        System.out.println(" Company name is "+ company_name);
    }
}

class Intern_work
{
    String location;
    int project_code;
    String project_name;

    Intern_work()
    {
        System.out.println(" The work details are mentioned below: ");
    }
    void set_details(String location,int project_code,String project_name)
    {
        this.location=location;
        this.project_code=project_code;
        this.project_name=project_name;
    }
}
public class Intern
{
    public static void main(String[] args)
    {
        Intern_Salary  obj1 = new Intern_Salary();
        obj1.setName("Aditya Narayan Sharma");
        obj1.salary = 100000;
        System.out.println(" Intern name is " +obj1.getName());
        System.out.println(" Intern salary is "+obj1.getSalary());

        Intern_Details obj2=new Intern_Details(1,"Data Scientist","Samsung");
        obj2.display();

        Intern_work obj3=new Intern_work();
        obj3.location="Noida";
        obj3.project_code=99;
        obj3.project_name="Analysis of IPL Data";

        System.out.println(" Location is "+ obj3.location);
        System.out.println(" Project code is "+ obj3.project_code);
        System.out.println(" Project name is "+ obj3.project_name);
    }
}
