package com.company;
import java.util.Scanner;
public class Area {

    public static int calculatearea(int l,int b)
    {
        int area;
        area=l*b;
        return area;
    }
    public static int calculatearea(int a)
    {
        int area;
        area=a*a;
        return area;
    }

    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int a,b,s;
        System.out.println("Enter length and breadth of the rectangle");
        a= obj.nextInt();
        b=obj.nextInt();
        int result= calculatearea(a,b);
        System.out.println("Area is :"+ result);
        System.out.println("Enter side of square");
        s=obj.nextInt();
        int result2=calculatearea(s);
        System.out.println("Area is "+result2);
    }
}
