import java.util.ArrayList;

class Book {
    private String title;
    private String author;
    private String isbn;
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getIsbn() { return isbn; }
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn;
    }
}
public class Library {
    private ArrayList<Book> books;
    public Library() {
        books = new ArrayList<>();
    }
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }
    public void removeBook(String isbn) {
        boolean removed = books.removeIf(book -> book.getIsbn().equals(isbn));
        if (removed) {
            System.out.println("Book with ISBN " + isbn + " removed.");
        } else {
            System.out.println("Book with ISBN " + isbn + " not found.");
        }
    }
    public void displayBooks() {
        System.out.println("\nBook Collection:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
    public static void main(String[] args) {
        Library myLibrary = new Library();
        Book book1 = new Book("The Alchemist", "Paulo Coelho", "9780061122415");
        Book book2 = new Book("1984", "George Orwell", "9780451524935");
        myLibrary.addBook(book1);
        myLibrary.addBook(book2);
        myLibrary.displayBooks();
        myLibrary.removeBook("9780451524935");
        myLibrary.displayBooks();
    }
}
