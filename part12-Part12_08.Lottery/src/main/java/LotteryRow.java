
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        // Implement the random number generation here
        // the method containsNumber is probably useful
        Random random = new Random();
        for(int i = 0;i<7;i++){
            int randomNumber = random.nextInt(40)+1;
            while(this.numbers.contains(randomNumber)){
                randomNumber = random.nextInt(40)+1;
            }
            this.numbers.add(randomNumber);
            
        }
        this.numbers.sort((a,b) -> a - b);
    }

    public boolean containsNumber(int number) {
        // Check here whether the number is among the drawn numbers
        return this.numbers.contains(number);
    }
}

