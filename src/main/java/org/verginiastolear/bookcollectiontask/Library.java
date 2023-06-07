package org.verginiastolear.bookcollectiontask;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> bookList;

    private String name;

    public Library(String inputName) {
        this.name = inputName;
        bookList = new ArrayList<>();
    }

    public void addBook(Book book) {
        bookList.add(book);
        System.out.println("Book added to the library: " + book.getTitle());
    }

    public void addBook(Book book1, Book book2) {
        bookList.add(book1);
        bookList.add(book2);
        System.out.println("Books added to the library: " + book1.getTitle() + " and " + book2.getTitle());
    }

    public int returnNumberBooks() {
        return bookList.size();
    }

    public void removeBook(int elementPosition) {
        try {
            Book deleteBook = bookList.remove(elementPosition);
            System.out.println("The following book was deleted: " + deleteBook.getTitle());
        } catch (IndexOutOfBoundsException exception) {
            System.out.println("Please review the index, something is not ok at all: " + exception.getMessage());
        }
    }

    public void removeBook(Book removedBook) {
        boolean isDeleted = bookList.remove(removedBook);
        if (isDeleted) {
            System.out.println("Book deleted from the library: " + removedBook.getTitle());
        } else {
            System.out.println("Book not found in the library: " + removedBook.getTitle());
        }
    }

    public void removeBook(String bookTitle) {
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getTitle() == bookTitle) {
                bookList.remove(i);
                break;
            }
        }
    }

    public boolean containsBook(Book book) {
        return bookList.contains(book);
    }

    // metoda ce returneaza ca exista o carte sau nu  boolean


    public void displayBooks() {
        System.out.println("Books in the library are : ");
        for (int i = 0; i < bookList.size(); i++) {
            System.out.println("The book number: " + i + " is: " + bookList.get(i).getTitle() + " by "
                    + bookList.get(i).getAuthor());
        }
    }

    public void addAnotherListOfBooksIntoTheLibraryList(List<Book> anotherListOfBooks){
        this.bookList.addAll(anotherListOfBooks);
    }

    public List<Book> getBookList(){
        return this.bookList;
    }

}
