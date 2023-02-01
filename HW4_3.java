package chapter_09;
import java.util.*;

public class HW4_3 {

    public static void main(String[] args) {

        Map<Integer, Integer> tick = new HashMap<Integer, Integer>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 0 - 50 OR a negative to quit");
        while (scan.hasNext()) {

            int x = scan.nextInt();
            if (x >= 0 && x <= 50){
               Integer val = tick.get(x);
                if(val == null){
                    tick.put(x, 1);
                	} 
                else {
                	val = val +1;
                    tick.put(x, val);
                }
            	} 
            else if(x < 0){
                break;
          }
        
        }

        for(Integer key : tick.keySet()){System.out.println(key + " happened " + tick.get(key) + " times"); }
    }

}
