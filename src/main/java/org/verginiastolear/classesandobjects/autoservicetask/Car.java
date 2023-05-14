package org.verginiastolear.classesandobjects.autoservicetask;

public class Car {

    // definirea proprietatilor:  tip de date (primitive sau de referinta) urmat de numele proprietatii

    String plateNumber;
    int kmWhenEnteredTheService;
    String color;
    String make;
    String model;
    String gearType;
    int productionYear;
    String fuelType;

    // Constructorul de mai jos primeste 5 parametri de intrare, in rezultat va crea un obiect Car despre care se va
    // cunoaste color, make, model, gearType, fuelType, dar nu si alte detalii precum plateNumber,
    // kmWhenEnteredTheService, productionYear.
    public Car(String colorLocalVariable, String makeInputParameter, String modelFormalParameter,
               String gearTypeParameter, String fuelTypeParameter) {
        this.color = colorLocalVariable;
        this.make = makeInputParameter;
        this.model = modelFormalParameter;
        this.gearType = gearTypeParameter;
        this.fuelType = fuelTypeParameter;

    }

    // Acest constructor va crea un obiect Car despre care vom cunoaste doar plateNumber.
    public Car(String plateNumber) {
        this.plateNumber = plateNumber;
    }


}
