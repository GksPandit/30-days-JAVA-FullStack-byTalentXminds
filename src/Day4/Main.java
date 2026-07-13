package Day4;

public class Main {
    public static void main(String[] args) {
       // for(int i=1; i<10; i++){
        //    System.out.println(i);


       // for(int i=10; i>0; i--){
          //  System.out.println(i);


       /* int sum = 0;
        for(int i=1; i<=10; i++){
            System.out.println("i = " +i+ "sum = "+sum);
            sum = sum + i;
        }*/

        // while loop
      /*  int i =1;
        while(i <= 5){
            System.out.println(i);
            i++;
        }*/


      /*  boolean i = true;
        int j =1;
        while(i == true){
            System.out.println(j);
            if(j++== 5) i=false;
        }*/


        //------------Do while------

     /*   boolean i = false;
       // boolean i = true; --> infinity condition to overfollow condition

        while(i){
            System.out.println("Printed once");
        }
        do{
            System.out.println("Printed once");
        }while (i);
*/

        // ---------Nested Loop---------

        /*
         i = row
         j = column
         */
      /*  for(int i=1; i<=3; i++){
            for(int j=1; j<=3; j++){
                System.out.print("* ");
            }
            System.out.println();
        }*/

        // --------Break and continue condition-------
       /* int i=0;
        int sum = 0;
        while(i <=10){
            sum +=i;
            System.out.println(sum);
            if(i == 5) continue;
            else i++;
        }*/

        // Q 1. write a program to print first 20 even numbers
      /*  for(int i =0; i <=20; i++) {
            if (i % 2 == 0) {
                System.out.println("even " + i);
            } else {
                System.out.println("odd " + i);
            }

        }*/


      /*  int n = 4;
        for(int i=1; i<=4 ; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }*/


        /* Q. Print this Pattern
        A
        A B
        A B C
        A B C D
        A B C D E
         */

        for(char i='A'; i<='E'; i++){
            for(char j='A'; j<=i; j++){
                System.out.print(j +" ");
            }
            System.out.println();}


    }
}
