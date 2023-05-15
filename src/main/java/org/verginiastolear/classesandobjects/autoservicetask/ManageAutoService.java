package org.verginiastolear.classesandobjects.autoservicetask;

public class ManageAutoService {
    public static void main(String[] args) {
        // declararea si initializarea obiectelor; asigurate ca folosesti toate tipurile de constructori studiati:
        // default, definit fara parametri, definit cu parametri.

        Garage garageBush = new Garage();
        garageBush.address = "Vlaicu Pircalab";
        garageBush.carCapacity = 150;
        garageBush.name = "Reparatia masinilor";
        garageBush.hasComputerDiagnostics = true;
        garageBush.numberId = "25A";
        garageBush.scheduler = "Luni-Simbata.";

        System.out.println("Garajul are urmatoarele date: " +
                "Numele: " + garageBush.name +
                ", Adresa: " + garageBush.address +
                ", capacitatea de masini: " + garageBush.carCapacity +
                ", are computer diagnostic: " + garageBush.hasComputerDiagnostics +
                ", numarul: " + garageBush.numberId +
                ", zilele de lucru: " + garageBush.scheduler);

        Car bmwSeriesE = new Car("Az 123");
        bmwSeriesE.fuelType = "diesel";
        bmwSeriesE.gearType = "manual";
        bmwSeriesE.make = "E class";
        bmwSeriesE.color = "black";
        bmwSeriesE.model = "bmw";
        bmwSeriesE.kmWhenEnteredTheService = 4698;
        bmwSeriesE.productionYear = 2021;

        System.out.println("Masina: " + bmwSeriesE.make + ", de modelul: " + bmwSeriesE.model + ", de culoarea: " +
                bmwSeriesE.color + ", are numar de inmatriculare: " + bmwSeriesE.plateNumber + ", cutia: " +
                bmwSeriesE.gearType + ", tipul de motorina: " + bmwSeriesE.fuelType + ", anul de productie: " +
                bmwSeriesE.productionYear + " si kilometrajul: " + bmwSeriesE.kmWhenEnteredTheService);

        Car hyundaiCreta = new Car("beige", "B class", "hyundai",
                "automatic", "benzine");
        hyundaiCreta.kmWhenEnteredTheService = 7896;
        hyundaiCreta.productionYear = 2019;
        hyundaiCreta.plateNumber = "MVM 419";

        System.out.println("Masina: " + hyundaiCreta.make + ", de modelul:  " + hyundaiCreta.model + ", de culoarea: " +
                hyundaiCreta.color + ", are numar de inmatriculare: " + hyundaiCreta.plateNumber + ", cutia: " +
                hyundaiCreta.gearType + ", tipul de motorina: " + hyundaiCreta.fuelType + ", anul de productie: " +
                hyundaiCreta.productionYear + " si kilometrajul: " + hyundaiCreta.kmWhenEnteredTheService);

        Car volkswagenSeriesA = new Car("gray", "A class", "volkswagen",
                "manual", "diesel");
        volkswagenSeriesA.kmWhenEnteredTheService = 14596;
        volkswagenSeriesA.productionYear = 2015;
        volkswagenSeriesA.plateNumber = "MST 589";

        System.out.println("Masina: " + volkswagenSeriesA.make + ", de modelul: " + volkswagenSeriesA.model +
                ",de culoarea: " + volkswagenSeriesA.color + ", are numar de inmatriculare: " +
                volkswagenSeriesA.plateNumber + ", cutia: " + volkswagenSeriesA.gearType + ", tipul de motorina: " +
                volkswagenSeriesA.fuelType + ", anul de productie: " + volkswagenSeriesA.productionYear +
                " si kilometrajul: " + volkswagenSeriesA.kmWhenEnteredTheService);

        Tool hammer = new Tool("hammer");
        hammer.isElevator = false;
        hammer.isUsed = true;
        hammer.needsElectricity = false;
        hammer.price = 59.49;
        hammer.uniqueCode = 47856945;
        hammer.weight = 5;

        System.out.println("Instrumentul are proprietatile: " +
                "Numele: " + hammer.name +
                ", este Elevator: " + hammer.isElevator +
                ", este utilizat: " + hammer.isUsed +
                ", foloseste electricitate: " + hammer.needsElectricity +
                ", pretul: " + hammer.price +
                ", codul unic: " + hammer.uniqueCode +
                " greutatea: " + hammer.weight);

        Tool screwdriver = new Tool();
        screwdriver.name = "screwdriver";
        screwdriver.isElevator = false;
        screwdriver.isUsed = true;
        screwdriver.needsElectricity = true;
        screwdriver.price = 21.19;
        screwdriver.uniqueCode = 4152631;
        screwdriver.weight = 2;

        System.out.println("Instrumentul are proprietatile: " +
                "Numele: " + screwdriver.name +
                ", este Elevator: " + screwdriver.isElevator +
                ", este utilizat: " + screwdriver.isUsed +
                ", foloseste electricitate: " + screwdriver.needsElectricity +
                ", pretul: " + screwdriver.price +
                ", codul unic: " + screwdriver.uniqueCode +
                ", greutatea: " + screwdriver.weight);

        Worker vasileWorker = new Worker();
        vasileWorker.name = "Vasile";
        vasileWorker.age = 40;
        vasileWorker.sexType = "Masculin";
        vasileWorker.specialization = "Mecanic";
        vasileWorker.isExperienced = true;

        System.out.println("Angajatul are urmatoarele date : " +
                "Numele: " + vasileWorker.name +
                ", virsta: " + vasileWorker.age +
                ", sexul: " + vasileWorker.sexType +
                ", specializarea: " + vasileWorker.specialization +
                ", are experienta: " + vasileWorker.isExperienced);
    }
}
