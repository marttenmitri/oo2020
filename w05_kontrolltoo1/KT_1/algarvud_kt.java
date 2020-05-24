import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class algarvud_kt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int input_int = Integer.parseInt(input);

        //2 TO 7
        if(input_int%2 == 0 || input_int%3 == 0 || input_int%5 == 0 || input_int%7 == 0){
            System.out.println("Valitud arv jagub 2,3,5 voi 7ga");
        }
        else{
            System.out.println("valitud arv ei jagu 2,3,5, ja 7ga");
        }

        //primary numbers
        String isPrim = "";

        if(input_int == 2){
            isPrim = "is primary number";
        }
        else if(input_int <= 1){
            isPrim ="is not primary number";
        }

        for(int i = 2; i < input_int; i++){

            if(input_int%i == 0){
                isPrim = "is not primary number";
                i = input_int;
            }
            else{
                isPrim = "is primary number";
            }
        }System.out.println(isPrim);


         //primary to 1k
        List<Integer> primaryList = new ArrayList<>();

        int a = 0;
        while(true){
            a++;
            input_int = a;

            isPrim = "";

            if(input_int == 2){
                isPrim = "is primary number";
            }
            else if(input_int <= 1){
                isPrim = "is not primary number";
            }

            for(int i = 2; i < input_int; i++){

                if(input_int%i == 0){
                    isPrim = "is not primary number";
                    i = input_int;
                }
                else{
                    isPrim = "is primary number";
                }
            }
            
            if(isPrim == "is primary number"){
                primaryList.add(a);
            }

            int length = primaryList.size();
            if(length == 1000){
                break;
            }
        }

        //System.out.println(primaryList);
        for(int i = 0; i<=10; i++){
            System.out.println("Vaiksemad: " + primaryList.get(i));
        }

        System.out.println(" ");

        for(int i = 999; i>=990; i--){
            System.out.println("Suuremad: " + primaryList.get(i));
        }
        
    }

    
}