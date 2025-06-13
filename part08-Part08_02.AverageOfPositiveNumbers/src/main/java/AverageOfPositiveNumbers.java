
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer sumInteger = 0;
        Integer countInteger = 0;
        Double averageInteger = -1.0;
        Boolean continueLoop = true;

        while(continueLoop){
            Integer number = Integer.valueOf(scanner.nextLine());
            if(number == 0){
                continueLoop = false;
            }
            if(number > 0){
                sumInteger = sumInteger + number;
                countInteger = countInteger + 1;
            }
        }
        if(countInteger == 0){
            System.out.println("Cannot calculate the average");
        } else{
            averageInteger = (double) sumInteger / countInteger;
            System.out.println(averageInteger);
        }
        scanner.close();
    }
}
