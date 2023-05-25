package org.verginiastolear.zooclubservice;

// Clasa Animal e dedicata procesului de mostenire, constructorul Animal nu trebuie folosit pentru initializarea obiectelor.

// public abstract class Animal implements AnimalInterface{
public abstract class Animal {

    // Variabila de instanta name va fi accesibila doar in clasa Animal deoarece e privata
    private String name;

    //Constructorul cu un parametru va permite setarea unui nume pentru absolut toate animalele create in cadrul programului
    protected Animal(String name){
        // Valoarea nume colectata din apelul constructorului, va fi atribuita variabilei de instanta name, care se
        // defineste cu ajutorul this.
        this.name = name;
    }

    // Metoda abstracta eat() nu are implementare, aceasta va fi facuta in clasele copil
    public abstract void eat();

    // Metoda getName e de tip public si returneaza valoarea numelui pe care il poseda animalul
    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
