package com.interview;

public class WidgetMachineTest {

	public static void main (String [] args){
	
		WidgetMachine wm = new WidgetMachine(FuelType.PETROL);
		
		System.out.println("Cost of 100 widgets for petrol engine: " + wm.produceWidgets(100));
		
		wm = new WidgetMachine(FuelType.DIESEL);
		
		System.out.println("Cost of 100 widgets for diesel engine: " + wm.produceWidgets(100));
		

	}

}