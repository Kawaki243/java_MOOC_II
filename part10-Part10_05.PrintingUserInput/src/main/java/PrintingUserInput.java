
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> listString = new ArrayList<>();

        Boolean continueLoop = true;
        while(continueLoop){
            String message = scanner.nextLine();
            if(message.equals("")){
                continueLoop = false;
            } else{
                listString.add(message);
            }
        }
        listString.stream().forEach(str -> System.out.println(str));
        scanner.close();

    }
}
