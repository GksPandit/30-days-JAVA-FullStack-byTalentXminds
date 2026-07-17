package Day6;

/*public class array {

    public static void main(String[] args) {

        int[] marks = new int[5];

        marks[0] = 10;
        marks[1] = 20;
        marks[2] = 30;
        marks[3] = 40;
        marks[4] = 50;

        for (int i = 0; i < marks.length; i++) {

            System.out.println(marks[i]);

        }
    }
}
*/

/*public class array{
    public static void main(String[] args) {

        //int[] names = new int[4];

        String[] names = new String[5];
        names[0] = "Nikhil";
        names[1] = "Shishir";
        names[2] = "Deepak";
        names[3] = "Jikesh";

        for(int i=1; i<names.length; i++){
            System.out.println(names[i]);
        }
    }
}*/

import java.util.Scanner;

public class array{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            int size = sc.nextInt();
            int arr[] = new int[size];

            //INPUT
            for(int i=0; i<size; i++){
                arr[i] = sc.nextInt();
            }
            //OUTPUT
            for(int i=0; i<size; i++){
                System.out.print(arr[i] + " ");
            }
        }
    }