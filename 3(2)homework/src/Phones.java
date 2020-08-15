
import java.util.HashMap;
import java.util.HashSet;

class MainPhoneBook {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Aramis", 4564587, 0, 0);
        phoneBook.add("Maria", 12547896, 12365478, 98563214);
        phoneBook.add("Peter", 12345678, 78953000, 45698521);


        System.out.println(phoneBook.phoneBook1);


        phoneBook.get("Peter");

    }
}

class PhoneBook {

    HashMap<String, HashSet<Integer>> phoneBook1;

    PhoneBook() {
        this.phoneBook1 = new HashMap<>();
    }

    void add(String name, int num1, int num2, int num3) {
        HashSet<Integer> phoneBook = phoneBook1.getOrDefault(name, new HashSet<>());
        phoneBook.add(num1);
        phoneBook.add(num2);
        phoneBook.add(num3);

        phoneBook1.put(name, phoneBook);
    }

    void get(String name) {

        System.out.println("Contact "+name+": "+ phoneBook1.getOrDefault(name, new HashSet<>()));
    }
}










//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.Map;
//import java.util.Set;
//
//public class Phones {
//
//    private Map<String, Set<String>> records;
//
//    public Phones() {
//        this.records = new HashMap<>();
//    }
//    public void add(String name, String number) {
//        if (records.containsKey(name)){
//            records.get(name).add(number);
//
//        }
//    }
//    public Set<String> get(String name, String number) {
//     if(records.containsKey(name)) {
//         return records.get(name);
//     }
//     else {
//         Set<String> numbers = new HashSet<>();
//        numbers.add(number);
//         records.put(name, numbers);
//     }
//     return new HashSet<>();
//    }
//}
