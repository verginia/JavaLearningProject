package org.verginiastolear.bookcollectiontask;

import java.util.HashMap;
import java.util.Map;

public class LibraryExecutionService {

    public static void main(String[] args) {
        Book bookAtomicHabits = new Book("Atomic Habits", "James Clear");
        Book bookStrainulDeLingaMine = new Book("Strainul de linga mine", "Irina Binder");
        Book bookFluturi = new Book("Fluturi", "Irina Binder");
        Book bookTataBogatTataSarac = new Book("Tata Bogat Tata Sarac", "Robert T. Kiyosaki");
        Book bookSapiens = new Book("Sapiens Scurta istorie a omenirii", "Yuval Noah Harari");

        Library librariusLibrary = new Library("Librarius");

        librariusLibrary.addBook(bookFluturi);
        librariusLibrary.addBook(bookAtomicHabits);
        librariusLibrary.addBook(bookFluturi, bookTataBogatTataSarac);
        librariusLibrary.addBook(bookStrainulDeLingaMine, bookSapiens);
        librariusLibrary.addBook(bookFluturi,bookAtomicHabits);

        librariusLibrary.displayBooks();

        System.out.println("1. The number of books are: " + librariusLibrary.returnNumberBooks());

        librariusLibrary.removeBook(3);

        System.out.println("2. The number of books after deletion is: " + librariusLibrary.returnNumberBooks());

        librariusLibrary.removeBook(bookFluturi);

        System.out.println("3. The number of books after deletion is: " + librariusLibrary.returnNumberBooks());

        librariusLibrary.removeBook("Strainul de linga mine");

        System.out.println("4. The number of books after deletion is: " + librariusLibrary.returnNumberBooks());

        librariusLibrary.containsBook(bookSapiens);

        System.out.println("5. The number of books are: " + librariusLibrary.returnNumberBooks());

        librariusLibrary.displayBooks();

        Library carturestiLibrary = new Library("Carturesti");

        carturestiLibrary.addBook(bookFluturi,bookSapiens);
        carturestiLibrary.addBook(bookFluturi,bookAtomicHabits);
        carturestiLibrary.addBook(bookTataBogatTataSarac,bookStrainulDeLingaMine);
        carturestiLibrary.addBook(bookAtomicHabits);

        System.out.println("The book number: " + carturestiLibrary.returnNumberBooks());

        Map<String, Library> librariesNetwork = new HashMap<>();

        librariesNetwork.put("str. Independentei 7", librariusLibrary);
        librariesNetwork.put("str. Dacia 27", carturestiLibrary);

        librariesNetwork.get("str. Independentei 7").addBook(bookAtomicHabits);
        librariesNetwork.get("str. Dacia 27").displayBooks();
        librariesNetwork.get("str. Dacia 27").addBook(bookAtomicHabits);
        librariesNetwork.get("str. Dacia 27").displayBooks();


        librariesNetwork.get("str. Independentei 7").addAnotherListOfBooksIntoTheLibraryList(carturestiLibrary.getBookList());
        librariesNetwork.get("str. Independentei 7").displayBooks();
    }
}
