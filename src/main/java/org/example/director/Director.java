package org.example.director;

import org.example.builder.IBuilder;
import org.example.components.CarType;
import org.example.components.Colors;
import org.example.components.Engine;
import org.example.components.Transmission;

public class Director {

    public void constructSedanCar(IBuilder builder){
        builder.setCartype(CarType.SEDAN);
        builder.setSeats(5);
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setEngine(new Engine(1600));
    }

    public void constructTruckCar(IBuilder builder){
        builder.setCartype(CarType.TRUCK);
        builder.setSeats(5);
        builder.setTransmission(Transmission.AUTOMATIC_SEQUENCIAL);
        builder.setEngine(new Engine(13000));
    }

    public void constructSportCar(IBuilder builder){
        builder.setCartype(CarType.SPORTCAR);
        builder.setSeats(2);
        builder.setTransmission(Transmission.MANUAL);
        builder.setColor(Colors.YELLOW);
        builder.setEngine(new Engine(4000));
    }
}
