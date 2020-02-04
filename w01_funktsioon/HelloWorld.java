public class HelloWorld{

    
    public static void main(String[] arg){

        //print lause
        System.out.println("Hello Man");

        /*
        min value
        max value
        */
        byte minByte = Byte.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        // short, int, long, float, double, char, boolean

        Boolean flag = true;

        System.out.println(minByte + maxByte);

        // operaatorid * / - %

        int[] numberArray = new int[]{1, 2, 3, 4, 5};

        for(int element : numberArray){
            System.out.println(element);
        }

        //konstruktori valja kutsumine
        HelloWorld HelloWorld = new HelloWorld();

        //kutsub valja class printsomethin
        HelloWorld.printSomething();

    }

    //kui panna static ette siis ei pea seda HelloWorld.printSomething();, hellowordi ette kirjutama
    void printSomething(){
        for(int i = 0; i < 10; i++){
            System.out.print(i + ",");
        }   
    }
}