package org.example.cars;

import org.example.components.CarType;
import org.example.components.Colors;
import org.example.components.Engine;
import org.example.components.Transmission;

public class SportCar {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final Colors colors;

    public SportCar(CarType carType,
               int seats,
               Engine engine,
               Transmission transmission, Colors colors){
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.colors = colors;
    }

    public CarType getCarType() {
        return carType;
    }

    public Engine getEngine() {
        return engine;
    }

    public int getSeats() {
        return seats;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public Colors getColor(){
        return colors;
    }

    public String resultSportCar(){
        String sportCar = "Sport car with motor: " + engine.getPower() + "\n";
        sportCar += "Transmission: " + transmission;
        sportCar += "Cor: " + colors;

        return sportCar;
    }

}
