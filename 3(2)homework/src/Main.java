import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        doTask1();
    }
    static void doTask1(){
        String[] words = {"Hello", "hi", "Hey", "Hola", "halo", "Salut", "HEYY", "Hello", "hi", "Hey"};
        Set<String> specialWord = new HashSet<>();

        for (String w : words) {
            specialWord.add(w);

        }
        System.out.println(specialWord.toString());
    }
}
