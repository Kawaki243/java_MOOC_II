
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Boolean continueLoop = true;
        Integer bookCount = 0;
        List<Book> bookList = new ArrayList<>();

        while(continueLoop){
            System.out.print("Input the name of the book, empty stops: ");
            String bookName = scanner.nextLine();
            if(bookName.length() == 0){
                continueLoop = false;
            } else{
                System.out.print("Input the age recommendation: ");
                Integer ageBook = Integer.valueOf(scanner.nextLine());
                Book book = new Book(bookName, ageBook);
                bookCount++;
                bookList.add(book);
            }
            System.out.println();
        }
        System.out.println(bookCount + " books in total.");
        System.out.println("Books:");
        bookList.stream().sorted((b1, b2) -> b1.compareTo(b2)).forEach(book -> System.out.println(book));
        scanner.close();
    }

}
