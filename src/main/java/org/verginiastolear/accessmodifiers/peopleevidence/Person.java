package org.verginiastolear.accessmodifiers.peopleevidence;

public class Person {

    // There are an instance variables and are declared as private - it can be accessed only from Person class
    private String name;
    private String surname;
    // The final key word describe a non-access modifier which means that this property will not be changed during the
    // execution, and it has to be initialized once the object is created.
    private final long CNP;
    // the protected property can be accessed only from classes which belongs to the peeopleevidence package and subclasses
    protected String residence;
    // There are an instance variables because they describe the objects of the class. Public means that they can be
    // accessed from anywhere in the project.
    public boolean isRetired;
    public int age;
    // The default property can be accessed only from classes which belongs to the peopleevidence package.
    String gender;
    String address;
    String nationality;
    String education;
    boolean isMarried;
    String occupation;
    String readingBook;

    // This property is class related - class Variable, it is private - it can be accessed only within the Person class
    private static int totalNumberOfPersonObjects;

    // This is a constructor with only one parameter that is a mandatory field
    public Person(long CNPMandatoryCreation) {
        this.CNP = CNPMandatoryCreation;
        totalNumberOfPersonObjects++;
    }

    // This is a constructor with multiple parameters that contains all details
    public Person(String name, String surname, long CNP, String residence, boolean isRetired, int age, String gender,
                  String address, String nationality, String education, boolean isMarried, String occupation, String
                          readingBook) {
        this.name = name;
        this.surname = surname;
        this.CNP = CNP;
        this.residence = residence;
        this.isRetired = isRetired;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.nationality = nationality;
        this.education = education;
        this.isMarried = isMarried;
        this.occupation = occupation;
        this.readingBook = readingBook;
        totalNumberOfPersonObjects += 1;
    }

    public static void printNumberOfPeople() {
        System.out.println("Numarul total de persoane este = " + totalNumberOfPersonObjects);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", CNP=" + CNP +
                ", residence='" + residence + '\'' +
                ", isRetired=" + isRetired +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", nationality='" + nationality + '\'' +
                ", education='" + education + '\'' +
                ", isMarried=" + isMarried +
                ", occupation='" + occupation + '\'' +
                ", readingBook='" + readingBook + '\'' +
                '}';
    }
}
