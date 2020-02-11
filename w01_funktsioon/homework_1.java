import java.util.Scanner;
import java.util.Random; 

class Homework_1 {
    public static void main(String[] args) {
        
        Random rand = new Random(); 

        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);

    	System.out.println("Vali raskustase 1,2,3 või 4");
        System.out.println("Kirjuta valitud number:");
        int level = input1.nextInt();
        int number1 = 0;
        int number2 = 0;

        if(level == 1){
            number1 = 5;
            number2 = 5;
        }else if(level == 2){
            number1 = 10;
            number2 = 10;
        }else if(level == 3){
            number1 = 20;
            number2 = 20;
        }else if(level == 4){
            number1 = 30;
            number2 = 30;
        }else if(level != 1 && level != 2 && level != 3 && level != 4){
            System.out.println("Kirjutatav number peab olema 1 ja 4 vahel");
            System.exit(0);
        }
        
        int min = 1;
        int max = number2;
        int max2 = number1;
        int random_int = rand.nextInt((max - min)+1)+min; 
        int random_int2 = rand.nextInt((max2 - min)+1)+min; 

        int num1_value = 0;
        int num2_value = 0;

        for(int i = 1; i <= number1; i++){

           for(int a = 1; a <= number2; a++){

               if(a == random_int && i == random_int2 ){
                num1_value += i;
                num2_value += a;
                int not_fake = num1_value * num2_value + 4;
                String fakeString = Integer.toString(not_fake); 
                System.out.printf("%-4s",fakeString);
    
               }else{
                int valueInt = a*i;
                String valueString = Integer.toString(valueInt); 
                System.out.printf("%-4s", valueString);
               }

           }System.out.println("");
        }

        long start = System.nanoTime();

        System.out.print("Mitmendas veerus on vale number: ");
        int number_column = input2.nextInt();
        System.out.print("Mitmendal reas on vale number: ");
        int number_row = input3.nextInt();

        if(number_column == num2_value && number_row == num1_value){
            long finish = System.nanoTime();
            long timeElapsed = finish - start;
            long score = timeElapsed/36000000;
            System.out.println("Sul läks aega " + timeElapsed/1000000000 + " sekundit" + "\nSu skoor on " + score);
        }else{
            System.out.println("vale!!!! \nÕige vastus oli rida number "+ num1_value +" ja veerg number "+ num2_value);
        }
        
    }
}