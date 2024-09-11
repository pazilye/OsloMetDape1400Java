package ClassesAndObjects1.BookTask;
import static javax.swing.JOptionPane.*;


public class Library {
    public static void main(String[] args) {
        



        // get in data

        String title= showInputDialog("Enter title");
        String author = showInputDialog("Enter author");
        int price= Integer.parseInt(showInputDialog("Enter price"));
        String iSBN = showInputDialog("Enter isbn");

        // create the book
        Books book = new Books();

        book.title= title;
        book.author= author;
        book.price= price;
        book.iSBN= iSBN;

        book.showMessage();












    }
}
