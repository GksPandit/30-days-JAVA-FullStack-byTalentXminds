package Day14;

import java.util.HashSet;

public class FindDuplicate {
    public static void main(String[] args) {

        int[] arr = {1,2,3,2,4,5,1,6};

        HashSet<Integer> set = new HashSet<>();

        for(int num : arr){
            if(!set.add(num)){
                System.out.println("Duplicate : "+ num);
            }
        }
    }
}
