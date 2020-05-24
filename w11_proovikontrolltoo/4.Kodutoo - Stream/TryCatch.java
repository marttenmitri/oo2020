import java.io.FileNotFoundException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class TryCatch {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(TryCatch.class.getName());
        FileHandler fh;
        SimpleFormatter sf = new SimpleFormatter();
        int i=50;  
        int j=0;  
        int data;  
        
        try {
            fh = new FileHandler("mylog.txt");
            fh.setFormatter(sf);
            logger.addHandler(fh);
        } catch (Exception e) {
            System.out.println("Shouldn't arrive here");
        } 

        try {
            int a[]=new int[7];
            a[4]=30/0;

        } catch (ArithmeticException e) {
            //logger.warning(e.getMessage());
            logger.warning("Code should never reach here " + e.getMessage());
        }

        try  
        {  
        data=i/j;
        }  
        catch(Exception e)  
        {  
            logger.warning("Code should never reach here " + e.getMessage());
        }  
    }
}