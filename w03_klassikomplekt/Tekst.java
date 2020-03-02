import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Tekst {

    public static void main(String[] args) {
        
        //letter stuff
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sisesta lause:");
        String first = scanner.nextLine();

        int count = 0;

        List<Integer> symbols = new ArrayList<>();
        List<Integer> onlyone = new ArrayList<>();
        List<Integer> howmany = new ArrayList<>();

        for(int i = 0; i < first.length(); i++){

            //convert to char and add to list
            char character_name =  first.charAt(i);
            int character_number = (int) character_name;       
            symbols.add(character_number);

            //check if already in list
            int checkdup = symbols.get(i);

            if(!onlyone.contains(checkdup)){
                onlyone.add(checkdup);
                howmany.add(1);
                count=count + 1;
            }
            else{ 
                int indexat = onlyone.indexOf(checkdup);
                int valueatindex = howmany.get(indexat);
                int newvalue = valueatindex + 1;

                howmany.set(indexat, newvalue);
            }
        }
        //print out
        for(int i = 0; i < count; i++){
            int howMany = howmany.get(i);
            int whatSymbol = onlyone.get(i);
            char charToString = (char)whatSymbol;

            System.out.println(charToString + " on " + howMany + " tki");
        }

    }


}