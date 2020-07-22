package com.company;

import javax.sound.midi.Soundbank;

class Car{
    private boolean engine;
    private int cylinders;
    private int wheels;
    private int vmax;
    private int doors;

    public Car(int cylinders, int vmax, int doors) {
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.vmax = vmax;
        this.doors = doors;
    }

    public boolean getEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public int getVmax() {
        return vmax;
    }

    public int getDoors() {
        return doors;
    }
    public String startEngine(){
        return "Car started engine";
    }
    public String accelerate(){
        return "Accelerate";
    }
    public String brake(){
        return "Brake";
    }
}
class BMW extends Car{
    public BMW() {
        super(4, 200, 4);
    }

    @Override
    public String startEngine() {
        return "Startuje BMW";
    }

    @Override
    public String accelerate() {
        return "Akceleracja BMW";
    }

    @Override
    public String brake() {
        return "Hamowanie BMW";
    }
}
class Audi extends Car{
    public Audi() {
        super(6, 180, 4);
    }

    @Override
    public String startEngine() {
        return "O! Audi startuje";
    }

    @Override
    public String accelerate() {
        return "O! Audi AKCELERACJA";
    }

    @Override
    public String brake() {
        return"O! Audi hamuje";
    }
}
class Syrenka extends Car{
    public Syrenka() {
        super(2, 100, 2);
    }

    @Override
    public String startEngine() {
        return "Najlepszy polski samochód rusza";
    }

    @Override
    public String accelerate() {
        return "Syrenka accelerate";
    }

    @Override
    public String brake() {
        return "Hamuj syrenko";
    }
}


public class Main {

    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {
            Car car = randomCar();
            System.out.println("Samochod : " + car.startEngine()  + "\n" + car.accelerate() + "\n" + car.brake());
        }

    }


    public static Car randomCar() {


        int number = (int) (Math.random() * 3) + 1;
        System.out.println("Wylosowana liczba to: " + number );
            switch (number) {
                case 1:
                    return new Audi();
                case 2:
                    return new BMW();
                case 3:
                    return new Syrenka();
            }
            return null;
    }
}







