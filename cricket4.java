package com.company;

class ClassA
{
    public void dispA()
    {
        System.out.println("disp() method of ClassA");
    }
}
interface InterfaceB
{
    public void show();
}
interface InterfaceC
{
    public void show();
}
public class cricket4 extends ClassA implements InterfaceB,InterfaceC
{
    public void show()
    {
        System.out.println(" show() method implementation ");
    }
    public void dispD()
    {
        System.out.println(" disp() method of cricket4 ");
    }
    public static void main(String args[])
    {
        cricket4 d = new cricket4();
        d.dispD();
        d.show();
    }
}