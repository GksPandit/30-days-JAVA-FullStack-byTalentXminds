package Day15;

import java.util.HashMap;

public class Practice {
    public static void main(String[] args) {
        //Q. count frequency of number 0<=n<=100
        // 1,2,1,2,3,3 ,3,3,2,2,2
        // arraylist [ "1,2","2,5",....
        // 1 -> 2 times
        // 2 -> 5 times
        // 3 -> 4 times
        // arr size 101
        /// [0,1,2,3,....,100]
        int[] numbers = {1,2,1,2,3,3 ,3,3,2,2,2};
//        int ans[] = new int[101];
//        int maxx = numbers[0];// maxx is 3 in numbers
//        for(int i=0;i<numbers.length;i++){
//            // i =0  numbers[0]=1
//            int curr = numbers[i];
//            if(maxx< curr) maxx = curr;
//            //ans[1] = 0+1;
//            ans[curr] +=1;
//        }
//        for(int i=0;i<=maxx;i++){
//            if(ans[i]>0)
//                System.out.println(i+" -> "+ans[i]);
//        }
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int num : numbers){
//            if(hm.containsKey(num))
//                    hm.put(num,hm.get(num)+1);
//            else
//                hm.put(num,1);

//            hm.put(num ,hm.getOrDefault(num,0)+1);
        }
        System.out.println(hm);
    }
}