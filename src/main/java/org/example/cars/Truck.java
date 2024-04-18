package org.example.cars;

import com.sun.jdi.PrimitiveValue;
import org.example.components.CarType;
import org.example.components.Colors;
import org.example.components.Engine;
import org.example.components.Transmission;

public class Truck {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final Colors colors;

    public Truck(CarType carType,
               int seats,
               Engine engine,
               Transmission transmission, Colors colors){
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.colors = colors;
    }

    public String result(){
        String truck = "Truck with motor: " + engine.getPower() + "\n";
        truck += "Transmission: " + transmission;

        return truck;
    }

}
