import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();

    public Book add(String title, String description, String author, int examplaryNumber) {
        Book book = new Book(title, description, author, examplaryNumber);
        this.books.add(book);
        return book;
    }

    public Book findById(String id) {
        for (Book book : books) {
            if (book.id().equals(id))
                return book;
        }

        return null;
    }

    public void removeById(String id) {
        Book book = this.findById(id);

        if (book != null)
            this.books.remove(book);
    }

    public void displayBook(Book book) {
        System.err.println("Title: " + book.title());
        System.err.println("Description:" + book.description());
        System.err.println("Auteur: " + book.author());
        System.err.println("Nombre d'exemp: " + book.examplaryNumber());
        System.err.println("___________________");
    }

    public void displayBooks() {
        for (Book book : books)
            displayBook(book);
    }

    public int getTotalBooks(){
        return books.size();
    }

    public void updateBook(String id, String title, String description, String author, Integer exemplaryNumber) {
        Book bookToUpdate = findById(id);
        if (bookToUpdate != null) {
            if (title != null)
                bookToUpdate.setTitle(title);
            if (description != null)
                bookToUpdate.setDescription(description);
            if (author != null)
                bookToUpdate.setAuthor(author);
            if (exemplaryNumber != null) 
                bookToUpdate.setExemplaryNumber(exemplaryNumber);
        }
    }

    public static void main(String[] args) {
        Library library = new Library();
        BorrowManager borrows = new BorrowManager(library);
        User user = new User("Tony");

        Book book = library.add("Le ciel", "description", "Cédric", 1);

        borrows.borrow(book.id(), user.id());
        borrows.displayBorrows();

        borrows.displayBorrows();

        // library.updateBook(book.id(), null, null, "Tony", null);

        // library.displayBooks();
    }
}