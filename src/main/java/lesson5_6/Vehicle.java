package lesson5_6;

import java.util.Scanner;


public class Vehicle {
private String name;
private String size;
private int currentVelocity;
private int currentDirection;

        public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.currentVelocity = 0;
        this.currentDirection = 0;
        }

         public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): Steering at " + currentDirection + "degrees.");
        }
        public void move(int velocity, int direction){
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Vehicle.move(): Moving at " + currentVelocity + " in direction " + currentDirection);

        }
        public void stop(){
        this.currentVelocity = 0;

        }

        public String getName() {
        return name;
        }

        public String getSize() {
        return size;
        }

        public int getCurrentVelocity() {
        return currentVelocity;
        }

        public int getCurrentDirection() {
        return currentDirection;
        }
}


abstract class Car extends Vehicle{

    private int doors;
    public Car(String name, String size, int doors) {
        super(name, size);
        this.doors=doors;
    }

    public int getDoors(){
        return this.doors;
    }

}

class Toyota extends Car{

    private int direction, speed;
    private String color;

    public Toyota(String name, String size, int doors, String color) {
        super("Toyota "+name, size, doors);
        this.direction = 0;
        this.speed = 0;
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }

    @Override
    public void steer(int direction) {
        this.direction += direction;
        System.out.println("Toyota.steer(): Steering at " + this.direction + "degrees.");
    }
    @Override
    public void move(int velocity, int direction){
        this.speed = velocity;
        this.direction  = direction;
        System.out.println("Toyota.move(): Moving at " + this.speed + " in direction " + this.direction);

    }
    @Override
    public void stop(){
        this.speed = 0;
        System.out.println("Toyota.stop()");

    }

    public static void main(String[] arg){
        Scanner reader=new Scanner(System.in);
        Toyota t_C_HR = new Toyota("C-HR", "4,3*1,7*1,5", 5, "blue");
        System.out.println("Direction: ");
        int direction=reader.nextInt();
        t_C_HR.steer(direction);
        System.out.println("In which way and how fast do you want to move (int, int): ");
        System.out.println("Direction: ");
        direction=reader.nextInt();
        System.out.println("Speed: ");
        int speed=reader.nextInt();
        t_C_HR.move(speed,direction);
        System.out.println("Stop this car ");
        t_C_HR.stop();
        System.out.println("Check name of this car: "+t_C_HR.getName());

        System.out.println("Check color of this car: "+t_C_HR.getColor());

        System.out.println("Check door count of this car"+t_C_HR.getDoors());


    }

}
