import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

/**
 * test
 */
public class test {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("katki");
        list.add("Hey");
        list.add("Tere");
        list.add("Bonjur");

        list.remove(0);

        System.out.println(list.get(2));

        Map<String, Integer> numbers = new HashMap<>();

        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Four", 4);
        
        System.out.println(numbers.keySet());
    }
}