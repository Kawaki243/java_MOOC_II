
public class Human implements Comparable<Human>{

    private int wage;
    private String name;

    public Human(String name, int wage) {
        this.name = name;
        this.wage = wage;
    }

    public String getName() {
        return name;
    }

    public int getWage() {
        return wage;
    }

    public int compareTo(Human other){
        return  other.wage - this.wage;
    }


    @Override
    public String toString() {
        return name + " " + wage;
    }
}
