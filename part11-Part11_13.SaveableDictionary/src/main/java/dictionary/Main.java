package dictionary;

public class Main {
    public static void main(String[] args) {
        // You can test your dictionary here
        SaveableDictionary dictionary = new SaveableDictionary("C:\\Users\\ducpr\\AppData\\Local\\tmc\\vscode\\mooc-java-programming-ii\\part11-Part11_13.SaveableDictionary\\words.txt");
        boolean wasSuccessful = dictionary.load();
        
        if (wasSuccessful) {
            System.out.println("Successfully loaded the dictionary from file");
        }
        System.out.println(dictionary.translate("apina"));
        System.out.println(dictionary.translate("ohjelmointi"));
        System.out.println(dictionary.translate("alla oleva"));
    }
}
