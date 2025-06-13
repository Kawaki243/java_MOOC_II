import java.util.Objects;

public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public boolean equals(Object object) {
        
        if (this == object) {
            return true;
        }
        
        if (!(object instanceof Item)) {
            return false;
        }
        
        Item compareItem = (Item) object;
        
        if (this.name.equals(compareItem.name)) {
            return true;
        }
        
        return false;
    }
    
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.name);
        return hash;
    }

}
