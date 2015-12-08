package com.interview;

public class InternalCombustionEngine extends Engine {

    public InternalCombustionEngine(FuelType requiredFuelType) {
		
        this.requiredFuelType = requiredFuelType;
        running = false;
        fuelLevel = 0;
    }

	public int getBatchSize(){
		return 8;
	}

}