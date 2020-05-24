import java.io.FileWriter;
import java.io.IOException;
import java.net.Socket;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.List;

public class TextManipulate {
    

    private List<String> words;
    private Map<String,Integer> endings = new HashMap<>();

    TextManipulate(String text){
       
        this.words = Arrays.asList(text.split(" "));
    }

    //Trüki välja sõnade viimased tähed
    public void printLastLetters(){


        for (String w : words) {
            w = w.toLowerCase().replaceAll("[-+.^:,]","");
            System.out.print(w);
            w = w.substring(w.length()-1, w.length());

            if(endings.keySet().contains(w)){
                endings.put(w, endings.get(w)+1);
            }else{
                endings.put(w, 1);
            }

            System.out.print(" - " +w);
            System.out.println("");
        }
    }

    void printMap(){

        Map<String, Integer> endings2 = endings.entrySet().stream()
                                                        .sorted(Map.Entry.<String, Integer>comparingByValue())
                                                        .collect(Collectors.toMap(e->e.getKey(), e->e.getValue(),(v1,v2)->v2,LinkedHashMap::new));

        String htmlText = "<html><table>";

        for (Map.Entry<String,Integer> element : endings2.entrySet()){
            htmlText += "<tr>";
            htmlText += "<th>" + element.getKey() + "</th><th>" + element.getValue()+"</th>";
            htmlText += "</tr>\n";
        }

        htmlText += "</table></html>";

        FileWriter fw = null;
        try {
            fw = new FileWriter("web.html");

            fw.write(htmlText);

            fw.close();
        } catch (IOException e) {
            System.out.println("Ei õnnestunud faili tekitada");
        }

    }


}