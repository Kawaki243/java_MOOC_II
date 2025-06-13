import java.util.ArrayList;

public class Herd implements Movable {
 
    private ArrayList<Movable> herd;
 
    public Herd() {
        this.herd = new ArrayList<>();
    }
 
    @Override
    public void move(int dx, int dy) {
        for (Movable h : herd) {
            h.move(dx, dy);
        }
    }
 
    public void addToHerd(Movable movable) {
        herd.add(movable);
    }
 
    public String toString() {
        String toPrint = "";
 
        for (Movable h : herd) {
            toPrint += h.toString() + "\n";
        }
 
        return toPrint;
    }
}
