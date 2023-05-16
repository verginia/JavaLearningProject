package org.verginiastolear.accessmodifiers;

import org.verginiastolear.accessmodifiers.peopleevidence.Person;

public class ChisinauEvidenceCatalog {
    public static void main(String[] args) {

        Person arturPerson = new Person(147258369l);
        System.out.println(arturPerson.toString());
        arturPerson.age = 37;
        arturPerson.isRetired = true;
        System.out.println(arturPerson.toString());

        if (arturPerson.isRetired) {
            System.out.println("Artur este la pensie");
        } else {
            System.out.println("Artur nu este la pensie");
        }

        Person.printNumberOfPeople();

        Person vasilePerson = new Person("Vasile", "Buhnici", 123456789l, "MD", false,
                40, "Masculin", "Calea Iesilor 25", "MD", "university", true,
                "mecanic", "Cele cinci limbaje ale iubirii");
        System.out.println(vasilePerson.toString());

        vasilePerson.isRetired = false;
        if (vasilePerson.isRetired) {
            System.out.println("Vasile este la pensie");
        } else {
            System.out.println("Vasile nu este la pensie");
        }

        Person.printNumberOfPeople();

        Person ecaterinaPerson = new Person("Ecaterina", "Saptefrati", 123654789l, "MD", true,
                62, "Feminin", "Independentei 7", "RO", "university", true,
                "teacher", "Atomic habits");
        System.out.println(ecaterinaPerson.toString());

        ecaterinaPerson.isRetired = true;
        if (ecaterinaPerson.isRetired) {
            System.out.println("Ecaterina este la pensie");
        } else {
            System.out.println("Ecaterina nu este la pensie");
        }

        Person.printNumberOfPeople();

        Person verginiaPerson = new Person("Verginia", "Stolear", 258369741l, "MD", false,
                30, "Feminin", "Cuza Voda 25", "MD", "university", false,
                "accountant", "Inteligenta emotionala");
        System.out.println(verginiaPerson.toString());

        verginiaPerson.isRetired = false;
        if (verginiaPerson.isRetired) {
            System.out.println("Verginia este la pensie");
        } else {
            System.out.println("Verginia nu este la pensie");
        }

        Person.printNumberOfPeople();

        Person gheorghePerson = new Person("Gheorghe", "Ionasco", 1234544589l, "MD", true,
                61, "Masculin", "Alexei Mateevici 14 B", "MD", "university", true,
                "builder", "Cele cinci limbaje ale scuzelor");
        System.out.println(gheorghePerson.toString());

        gheorghePerson.isRetired = true;
        if (gheorghePerson.isRetired) {
            System.out.println("Gheorghe este la pensie");
        } else {
            System.out.println("Gheorghe nu este la pensie");
        }

        Person.printNumberOfPeople();
    }
}
