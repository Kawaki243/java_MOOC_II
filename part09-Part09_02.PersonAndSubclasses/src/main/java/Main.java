import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your test code here
        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(ollie);
        System.out.println("Study credits " + ollie.credits());
        ollie.study();
        System.out.println("Study credits "+ ollie.credits());
        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
        persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));
        printPersons(persons);
        Teacher t = new Teacher("Joel Kaasinen","Haagantie 123", 980); 
        System.out.print(t);
    }

    public static void printPersons(ArrayList<Person> persons){
        for (Person person : persons) {
            System.out.println(person);
        }
    }

}
