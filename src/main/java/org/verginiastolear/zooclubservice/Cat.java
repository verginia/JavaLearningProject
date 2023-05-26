package org.verginiastolear.zooclubservice;

public class Cat extends Animal implements AnimalInterface{

    // Definim un constructor pentru a crea obiecte de tipul Dog cu parametrul formal de tip String name
    public Cat(String name){
        // Cuvintul cheie super e folosit pentru apelul constructorului clasei parinte, care are nevoie de aceasta proprietate
        super(name);
    }

    // eat() e o metoda declarata in clasa abstracta Animal respectiv trebuie implementata, ea fiind abstracta acolo
    @Override
    public void eat(){
        //metoda getName e concreta si implementata in clasa Parinte Animal. Aceasta poate fi declarata si Protected acolo.
        System.out.println(this.getName() + " Eats the mouse.");
    }

    // makeSound() e o metoda abstracta declarata in AnimalIterface respectiv trebuie implementata, ea fiind abstracta acolo
    @Override
    public void makeSound(){
        System.out.println("Cat " + getName() + " Says:  meow, meow!");
    }
}
