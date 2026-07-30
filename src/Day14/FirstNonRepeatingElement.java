package Day14;

import java.util.HashMap;

public class FirstNonRepeatingElement {
    public static void main(String[] args) {

        int arr[] = {2,3,4,2,3,5,4,6};

        HashMap<Integer, Integer> map = new HashMap<>();
         // count frequency
        for(int num : arr){
            map.put(num, map.getOrDefault(num , 0)+1);
        }
        // find first frequency = 1
        for(int num : arr){
            if(map.get(num) == 1){
                System.out.println("First Non Repeating : "+ num);
                break;
            }
        }
    }
}
