import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;


public class Streams {

    public static List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10 ,11, 12);
    public static List<String> StringList = Arrays.asList("heloo", "Tere", "Strasti");
    public static List<Double> DoubleList = Arrays.asList(5.44 , 4.97 , 5.77 , 7.90 , 7.56 , 3.88);
    public static void main(String[] args) throws IOException  {

        //Teine tunnitoo
        //first();
        //Kolmas tunnitoo
        //second();
        //neljas tunnitoo
        //third();


        //Teine kodutoo
        PrintWriter pw = new PrintWriter(new FileWriter("final.txt"));

        Files.readAllLines(Paths.get("data.txt")).stream()
                    .map(e -> e.split(","))
                    .filter(e -> Integer.parseInt(e[1]) < 100000)
                    .map(e -> e[1] + " sammu kondis isik nimega " + e[0])
                    .forEach(pw::println);

        pw.close();
    }

    public static void first(){
        //Teine tunnitoo
        integerList.forEach(i -> System.out.println(i));
        StringList.forEach(i -> System.out.println(i));
        DoubleList.forEach(i -> System.out.println(i));
    }

    public static void second(){
        //Kolmas tunnitoo
        List<Integer> integerList3 = integerList.stream()
                                    .filter(element -> element <= 5)
                                    .map(element -> element * 8)
                                    .peek(System.out::println)
                                    .collect(Collectors.toList());

        System.out.println(integerList3.stream().skip(3).count());
    }

    public static void third(){
        //neljas tunnitoo
        IntStream.range(1, 20)
                .filter(e -> e % 2 == 0)
                .forEach(System.out::println);

        
        System.out.println(IntStream.range(1, 20).filter(e -> e % 2 == 0).allMatch(e -> e % 2 == 0));
        System.out.println(IntStream.of(1, 3, 5, 7, 9).anyMatch(e -> e % 2 != 0));
    }
}