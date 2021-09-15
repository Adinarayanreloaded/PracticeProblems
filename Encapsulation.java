package com.company;
class encap{
    String name;
    String UID;

    public void details(String name,String UID){
        this.name=name;
        this.UID=UID;
        System.out.println("Name of student is"+" "+ name);
        System.out.println("UID of student is"+" "+ UID);
    }
    public void detail(){
        System.out.println("Name of student is"+" "+ name);
        System.out.println("UID of student is"+" "+ UID);
    }


}
public class Encapsulation {
    public static void main(String[] args) {
        encap obj=new encap();
        obj.details("Aditya","20BCS1460");
        obj.name="Sayak";
        obj.UID="20BCS1452";
        obj.detail();

    }

}