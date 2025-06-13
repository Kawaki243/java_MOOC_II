
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listInteger = new ArrayList<>();
        Boolean continueLoop = true;
        while(continueLoop){
            Integer input = Integer.valueOf(scanner.nextLine());
            if(input < 0){
                continueLoop = false;
            } else{
                listInteger.add(input);
            }
        }

        listInteger.stream().filter(num -> num>=1 && num <= 5).forEach(num -> System.out.println(num));
        scanner.close();
    }
}
