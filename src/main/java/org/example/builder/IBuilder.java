package org.example.builder;

import org.example.components.CarType;
import org.example.components.Colors;
import org.example.components.Engine;
import org.example.components.Transmission;

public interface IBuilder {

    void setCartype(CarType type);
    void setSeats(int seats);
    void setTransmission(Transmission transmission);
    void setEngine(Engine engine);
    void setColor(Colors colors);
}
