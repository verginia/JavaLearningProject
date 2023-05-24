package org.verginiastolear.methodstask;

public class ExecutionService {
    public static void main(String[] args) {
        int randomInt = DataGeneratorUtil.getRandomInt(50,550);
        System.out.println("Variabila randomInd: " + randomInt);

        int randomInt1 = DataGeneratorUtil.getRandomInt(255);
        System.out.println("Variabila randomInd: " + randomInt1);

        double randomDouble = DataGeneratorUtil.getRandomDouble(795);
        System.out.println("Variabila randomDouble: " + randomDouble);

        double randomDouble1 = DataGeneratorUtil.getRandomDouble(-795);
        System.out.println("Variabila randomDouble: " + randomDouble1);

        System.out.println("Random boolean: " + DataGeneratorUtil.getRandomBoolean());

        System.out.println("Random Email 1: " + DataGeneratorUtil.getRandomEmail());
        System.out.println("Random Email 2: " + DataGeneratorUtil.getRandomEmail());

        System.out.println("Random Valid String de X chars: " + DataGeneratorUtil.generateValidRandomString(10));
        System.out.println("Random Valid String de X chars: " + DataGeneratorUtil.generateValidRandomString(11));
        System.out.println("Random Invalid String de X chars: " + DataGeneratorUtil.generateInvalidRandomString(6));

        Customer verginiaCustomer = new Customer("Verginia Saptefrati", 81,"Verginia.Saptefrati@gmail.com");

        System.out.println("Nume obiect Verginia: " + verginiaCustomer.getName());
        System.out.println("Age obiect Verginia: " + verginiaCustomer.getAge());
        System.out.println("Email obiect Verginia: " + verginiaCustomer.getEmail());

        verginiaCustomer.setName("Verginia Cosovschi");
        verginiaCustomer.setAge(85);
        verginiaCustomer.setEmail("Verginia.Cosovschi@gmail.com");

        System.out.println("Nume obiect Verginia setat: " + verginiaCustomer.getName());
        System.out.println("Age obiect Verginia setat: " + verginiaCustomer.getAge());
        System.out.println("Email obiect Verginia setat: " + verginiaCustomer.getEmail());

        Customer randomDataCustomer = new Customer(DataGeneratorUtil.generateValidRandomString(20),
                DataGeneratorUtil.getRandomInt(127), DataGeneratorUtil.getRandomEmail());

        System.out.println(randomDataCustomer.toString());

        randomDataCustomer.setName(DataGeneratorUtil.generateValidRandomString(8));
        randomDataCustomer.setAge(DataGeneratorUtil.getRandomInt(18,64));
        randomDataCustomer.setEmail(DataGeneratorUtil.getRandomEmail());

        System.out.println(randomDataCustomer.toString());



    }
}
