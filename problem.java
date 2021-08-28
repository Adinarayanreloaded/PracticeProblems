package com.company;

class Emp{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}

class CellPhone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void callFriend(){
        System.out.println("Calling Mukul...");
    }

}

class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running from the enemy");
    }
    public void fire(){
        System.out.println("Firing on the enemy");
    }
}
public class problem {
    public static void main(String[] args) {

        Emp obj1 = new Emp();
        obj1.setName("Adi");
        obj1.salary = 100000;
        System.out.println(obj1.getSalary());
        System.out.println(obj1.getName());


        CellPhone samsung = new CellPhone();
        samsung.callFriend();
        samsung.vibrate();
        samsung.ring();


        Square sq = new Square();
        sq.side = 3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());



        Tommy player1 = new Tommy();
        player1.fire();
        player1.run();
        player1.hit();


    }
}