
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        String fileName = "literacy.csv";
        List<Level> levels = readLevels(fileName);
        
        levels.stream().sorted((l1, l2) -> { return l1.compareTo(l2);}).forEach(level -> System.out.println(level.toSTring()));
    }

    public static List<Level> readLevels(String fileName){
        List<Level> levelList = new ArrayList<>();
        try{
            Files.lines(Paths.get(fileName)).map(row -> row.split(","))
            .map(parts -> new Level(parts[3], Integer.valueOf(parts[4]),parts[2].split(" ")[1],Double.valueOf(parts[5])))
            .forEach(level -> levelList.add(level));
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return levelList;
    }
}
