
import java.util.Random;

public class Die {

    private Random random;
    private int numberOfFaces;

    public Die(int numberOfFaces) {
        this.random = new Random();
        // Initialize the value of numberOfFaces here
        this.numberOfFaces = numberOfFaces;
    }

    public int throwDie() {
        // generate a random number which may be any number
        // between one and the number of faces, and then return it
        int randomNumber = this.random.nextInt(this.numberOfFaces+1);
        if(randomNumber == 0){
            randomNumber = 1;
        }
        return randomNumber;
    }
}
