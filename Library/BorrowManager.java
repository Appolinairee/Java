import java.util.HashMap;
import java.util.Map;

public class BorrowManager {
    private Map<String, String> borrows = new HashMap<>();
    private Library library;

    public BorrowManager(Library library) {
        this.library = library;
    }

    public void borrow(String bookId, String userId) {
        if (isBorrowed(bookId)) {
            borrows.put(bookId, userId);
        } else {
            System.out.println("Ce livre n'est pas disponible pour l'emprunt.");
        }
    }

    public Boolean isBorrowed(String bookId) {
        int borrowedCount = countBorrowed(bookId);
        int exemplaryNumber = this.library.findById(bookId).examplaryNumber();

        return borrowedCount < exemplaryNumber;
    }

    public int countBorrowed(String bookId) {
        int count = 0;

        for (Map.Entry<String, String> entry : borrows.entrySet()) {
            if (entry.getKey().equals(bookId))
                count++;
        }

        return count;
    }

    public void displayBorrow(Map.Entry<String, String> entry) {
        String bookId = entry.getKey();
        String userId = entry.getValue();
        System.out.println("Livre emprunté - ID du livre: " + bookId + ", ID de l'utilisateur: " + userId);
    }

    public void displayBorrows() {
        System.out.println("Liste des emprunts :");
        for (Map.Entry<String, String> entry : borrows.entrySet())
            this.displayBorrow(entry);
    }
}