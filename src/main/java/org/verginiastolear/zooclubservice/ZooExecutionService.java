package org.verginiastolear.zooclubservice;

public class ZooExecutionService {
    public static void main(String[] args) {

        // Mai jos se aplica Polimorfismul pentru a declara un obiect de tip Animal insa a il crea cu constructorul
       // clasei copil Dog
        Animal puffyDog = new Dog("Puffy");

        System.out.println("Numele obiectului puffyDog este: " + puffyDog.getName());
        puffyDog.setName("Puffy Sos");
        System.out.println("Numele actualizat a obiectului puffyDog este: " + puffyDog.getName());

        puffyDog.eat();

        AnimalInterface rexDog = new Dog("Rex");
        rexDog.makeSound();

        Dog zigDog = new Dog("Zig");
        zigDog.eat();
        zigDog.makeSound();

        //Metoda makeSound() ce apartine obiectului Dog nu poate fi apelata deoarece dog e de tip Animal iar makeSound()
        //este declarata in interface, pentru a fixa acest lucru ar trebui ca interfata sa fie implementata de catre
        //clasa abstracta Animal dog.makeSound();

        Cat cat = new Cat("Geta");
        cat.makeSound();
        cat.eat();

        Dog lexaDog = new Dog("Lexa");
        lexaDog.makeSound();
        lexaDog.eat();

        Lion lionKing = new Lion("Simba");
        lionKing.makeSound();
        lionKing.eat();

        Rabbit decemberRabbit = new Rabbit("December");
        decemberRabbit.makeSound();
        decemberRabbit.eat();
    }
}
