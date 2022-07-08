import java.util.*;
import java.io.IOException;

public class DIO{
 
    public static void main(String[] args) throws IOException {
        //System.out.println("Input: ");
        String scan;
        scan = new Scanner(System.in).nextLine();
        
        String[] ary = scan.split(" ");
        
        double x1;
        double y1;
        double x2;
        double y2;
        
        x1 = Double.parseDouble(ary[0]); 
        y1 = Double.parseDouble(ary[1]);
        
//        System.out.println("Input2: ");
        String scan2;
        scan2 = new Scanner(System.in).nextLine();
        String[] ary2 = scan2.split(" ");
        
        x2 = Double.parseDouble(ary2[0]); 
        y2 = Double.parseDouble(ary2[1]); 
        
        System.out.println(x1);
        System.out.println(y1);
        System.out.println(x2);
        System.out.println(y2);

    }
    
}      
          