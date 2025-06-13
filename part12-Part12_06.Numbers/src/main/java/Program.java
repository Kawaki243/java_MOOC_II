
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random randNumber = new Random();

        System.out.println("How many random numbers should be printed?");
        Integer inputNumber = Integer.valueOf(scanner.nextLine());

        for(int i = 0;i<inputNumber;i++){
            int randomNumber = randNumber.nextInt(11);
            System.out.println(randomNumber);
        }
        scanner.close();
    }

}
