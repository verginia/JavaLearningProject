package org.verginiastolear.classesandobjects.autoservicetask;

public class Tool {

    // definirea proprietatilor:  tip de date (primitive sau de referinta) urmat de numele proprietatii

    double price;
    String name;
    double weight;
    boolean needsElectricity;
    boolean isElevator;
    boolean isUsed;
    long uniqueCode;

    // Acest constructor va crea un obiect Tool despre care vom cunoaste doar numele.
    public Tool(String name) {
        this.name = name;
        System.out.println("Un obiect de tip Tool a fost creat, numele lui este :" + this.name);
    }

    //Acest constructor este fara parametri, insa va afisa un mesaj in consola
    public Tool(){
        System.out.println("O noua unealta a fost creata in cadrul programului. Nu cunoastem detaliile ei."
        + "Pentru detalii Numele este :" + this.name + "iar greutatea este :" + this.weight);
    }


}
