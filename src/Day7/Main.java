package Day7;

import java.util.Scanner;

// string is a sequence of character
// string is a non premitive data types
public class Main {
   public static void main(String[] args){
        String name = "i am java";
        name = "Jikesh";
        String name2 = new String("Jikesh");
        System.out.println(name+ " - "+ name2);
        // System.out.println(name == name2);
        System.out.println(name.equals(name2));


       // input method
       Scanner sc = new Scanner(System.in);
       String data = sc.nextLine();
       System.out.println(data);

       //length()
       System.out.println(data.length());
       //remove extra spaces from beginning and end of string trim()
       System.out.println(data.trim().length());

       // data.charAt(indexcalue)
       System.out.println(data.charAt(5));

       // toUpperCase toLowerCase
       String cases = "AbcdEf Ghijk";
       System.out.println(cases.toLowerCase());
       System.out.println(cases.toUpperCase());

       // contains()
       String case1 = "AbcdEf Ghijk";
       String case2 = "Ghijk";

       System.out.println("case 1 contains case 2: "+ case1.contains(case2));

       // subString  begingindex - inclusive, end index - exclusive
       String case3 = "java Programming";
       System.out.println(case3.substring(4, 8));
       System.out.println(case3.substring(1, 4));

       //replace()
       System.out.println(case3.replace('a' , '@'));

       // chech string empty wether not using isEmpty()
       String str = "";
       System.out.println(str.isEmpty());

       // concat
       String case4 = "Programming";
       System.out.println(case4.concat(case4).concat(case3));

       //split()

       String case5 = "Java, Program, react";
       String[] words = case5.split("\\|");
       for(String word: words){
           System.out.println(word);


           // Q. find the first  repeated character in a given String
           //ex - aabbccdeeff

           String str1 = "aabbccdeeff";
           for(int i=0; i<str1.length(); i++){
               for(int j=i+1; j<str1.length(); j++){

                   if(str1.charAt(i) == str1.charAt(j)){
                       System.out.println("First Repeated Character : "+ str1.charAt(i));
                       return;
                   }
               }
           }
           System.out.println("No Repeated Character");

           // check palindrome in a string - abcba

       }
    }
}
