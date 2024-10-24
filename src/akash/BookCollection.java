package akash;

import java.util.ArrayList;

class Book {
    int bookId;
    String bookName;
    String authorName;

    // Parameterized constructor
    public Book(int bookId, String bookName, String authorName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Book ID: " + bookId + ", Book Name: " + bookName + ", Author Name: " + authorName);
    }
}

public class BookCollection {
    public static void main(String[] args) {
        // Create an ArrayList to store Book objects
        ArrayList<Book> books = new ArrayList<>();

        // Add Book objects to the ArrayList
        books.add(new Book(1, "The Alchemist", "Paulo Coelho"));
        books.add(new Book(2, "1984", "George Orwell"));
        books.add(new Book(3, "To Kill a Mockingbird", "Harper Lee"));

        // Display all book details using an advanced for loop
        for (Book book : books) {
            book.displayDetails();
        }
    }
}

