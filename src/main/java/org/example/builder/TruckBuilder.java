package org.example.builder;

import org.example.cars.Truck;
import org.example.components.CarType;
import org.example.components.Colors;
import org.example.components.Engine;
import org.example.components.Transmission;

public class TruckBuilder implements IBuilder{

    private CarType carType;
    private int seats;
    private Transmission transmission;
    private Engine engine;
    private Colors colors;

    @Override
    public void setCartype(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void setSeats(int seats) {
        this.seats =  seats;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setColor(Colors colors) {
        this.colors = colors;
    }

    public Truck getResult(){
        return new Truck(carType, seats, engine, transmission, colors);
    }
}
