package com.project;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int size;
    private int weight ;
    private String coat ;

    public Dog(String name, int size, int weight, int eyes , int legs , int tail , int teeth , String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.coat = coat;
        this.legs = legs;
        this .tail = tail;
        this.size  = size;
        this.weight = weight;
    }

    private void chew(){
        System.out.println("Chomp Chomp , yummm!!");
    }

    @Override
    public void eat() {
        System.out.println("Gave Dog the food \n");
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("Dog starts to walk with his tippie toes");
        move(5);
    }

    public void run(){
        System.out.println("Sees a squirrel , Speedy Dogoo time  ");
        move(15);
    }
    public void moveLegs(){
        System.out.println("Look at that fluff go");
    }

    @Override
    public void move(int speed) {
        moveLegs();
        super.move(speed);
    }
}
