
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        Boolean continueLoop = true;
        Double average = 0.0;
        Double sum = 0.0;
        Integer count = 0;

        System.out.println("Input numbers, type \"end\" to stop.");
        while(continueLoop){
            String message = scanner.nextLine();
            if(message.equals("end")){
                continueLoop = false;
            } else{
                Double number = Double.valueOf(message);
                sum = sum + number;
                count = count + 1;
            }
        }
        if(count == 0){
            System.out.println("average of the numbers: "+average);
        } else{
            average = sum / count;
            System.out.println("average of the numbers: " + average);
        }
        scanner.close();
    }
}
