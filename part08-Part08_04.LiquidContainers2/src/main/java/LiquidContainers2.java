
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container firstContainer = new Container();
        Container secondContainer = new Container();

        while (true) {
            System.out.println("First: "+firstContainer);
            System.out.println("Second: "+secondContainer);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            } else{
                String[] parts = input.split(" ");
                String command = parts[0];
                int amount = Integer.valueOf(parts[1]);

                if(command.equals("add")){
                    firstContainer.add(amount);
                } else if(command.equals("move")){
                    if(amount > firstContainer.contains()){
                        secondContainer.add(firstContainer.contains());
                        firstContainer.remove(firstContainer.contains());
                    } else{
                        secondContainer.add(amount);
                        firstContainer.remove(amount);
                    }
                } else if(command.equals("remove")){
                    secondContainer.remove(amount);
                } else{
                    System.out.println("Unknown command");
                }
            }
            System.out.println();
        }
        scan.close();
    }

}

