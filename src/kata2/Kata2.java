package kata2;

import java.util.HashMap;
import java.util.Map;


public class Kata2 {
    public static void main(String[] args) {
        int[] array = {2,2,11,4,2,6,11,2,3,5,11,5};
        Map<Integer,Integer> history = new HashMap<>();
        
        
        for (Integer number : array){
            history.put(number, getFrequency(number,history) + 1);
        }
        
        System.out.println(history.entrySet());
    }

    private static int getFrequency(Integer number, Map<Integer, Integer> history) {
        if(history.containsKey(number))
            return history.get(number);
        return 0;
    }
}
