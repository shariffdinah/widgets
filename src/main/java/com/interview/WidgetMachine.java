package com.interview;

public class WidgetMachine {
	
	private Engine engine;
	
	public WidgetMachine(FuelType fuelType){
		switch (fuelType){
			case PETROL: case DIESEL: 
				this.engine = new InternalCombustionEngine(fuelType);
				break;
			case STEAM_COAL: case STEAM_WOOD:
				this.engine = new ExternalCombustionEngine(fuelType);
				break;
		}
		
		this.engine.fill(fuelType, 50);
	}
	

    public float produceWidgets(float quantity) {
		
        engine.start();
        float cost = 0;

        if (engine.isRunning()) {
            cost = produce(quantity);
        }

        engine.stop();

        return cost;
    }

   private float produce(float quantity) {
        int batch = 0;
        int batchCount = 0;
        float costPerBatch = 0;

        if (engine.getFuelType() == FuelType.PETROL) {
            costPerBatch = 9;
        } else if (engine.getFuelType() == FuelType.DIESEL) {
            costPerBatch = 12;
        } else if (engine.getFuelType() == FuelType.STEAM_COAL) {
			costPerBatch =  new Float(5.65).floatValue();
		} else if (engine.getFuelType() == FuelType.STEAM_WOOD) {
			costPerBatch = new Float(4.35).floatValue();
		}

        while (batch < quantity) {
            batch = batch + engine.getBatchSize();
            batchCount++;
        }

        return batchCount * costPerBatch;
    }


}
