package org.example;

import org.example.builder.CarBuilder;
import org.example.builder.IBuilder;
import org.example.builder.SportCarBuilder;
import org.example.builder.TruckBuilder;
import org.example.cars.Car;
import org.example.cars.SportCar;
import org.example.cars.Truck;
import org.example.director.Director;

public class Main {
    public static void main(String[] args) {

        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        TruckBuilder truckBuilder = new TruckBuilder();
        SportCarBuilder sportCarBuilder = new SportCarBuilder();

        director.constructSedanCar(builder);
        director.constructTruckCar(truckBuilder);
        director.constructSportCar(sportCarBuilder);

        Car car = builder.getResult();
        System.out.println(car.getCarType() + " Produzido com sucesso");

        Truck truck = truckBuilder.getResult();
        System.out.println(truck.result() + " Produzido com sucesso");

        SportCar sportCar = sportCarBuilder.getResult();
        System.out.println(sportCar.resultSportCar() + "Produzido com sucesso");
    }
}