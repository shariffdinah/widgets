package com.interview;

public class ExternalCombustionEngine extends Engine {


    public ExternalCombustionEngine(FuelType requiredFuelType) {
 		
        this.requiredFuelType = requiredFuelType;
        running = false;
        fuelLevel = 0;
    }

}
