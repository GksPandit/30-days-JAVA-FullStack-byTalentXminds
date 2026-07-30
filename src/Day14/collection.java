package Day14;

// Frequency count using HashMap.
import java.util.HashMap;

public class collection {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 1, 4, 2};

        HashMap<Integer, Integer>map = new HashMap<>();

        /*
        for(int num : arr){
            if(map.containsKey(num)){
                map.put(num, map.get(num) + 1);
            }else{
                map.put(num, 1);
            }
        }
        for(int key : map.keySet()){
            System.out.println(key + "->" + map.get(key));
        }*/

        // ---------2nd Short Method----------

        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        System.out.println(map);
    }

}



/*

package day14;
import java.util.*;

public class DynamicDS {
    static void main() {
        //Q.increase the size of an array from 5 to 10
        int[] arr1 = {1,2,3,4,5};
        // store 6,7,8,9,10 in the same array
        int[] arr2 = new int[10];
        // copy our data arr1 to arr2
        // then we can store our new data
        // collection framework - is a set of classes and interfaces used to store and manipulate
        // groups of objects dynamically
        // dynamic size
        // easy data manipulation
        //ready made methods
        // better performance
        // reusability

        // arrays           collection
        //fixed size        dynamic
        //stores same type  stores objects
        // few methods      many built in methods
        //faster            more flexible

//        Collection framework architecture
//              Iterable
//                |
//                Collection
//         ----------------------------
//         |            |             |
//       List         Set          Queue
//      |
//  -------------------------
//    |          |            |
//  ArrayList LinkedList Vector
//
//        Map (Separate Interface)
//                |
//        -------------------------
//         |             |
//        HashMap    TreeMap
//

        //List- ordered
        //set-> unique
        // queue-> FIFO
        // Map-> Key - value pair
        //LIST INTERFACE- stores elements in insertion order and
        // allows duplicate values

//        ArrayList
        int[] arr = {1,2,3};
        ArrayList<String> students = new ArrayList<>(3);
        students.add("Rahul");
        students.add("Amit");
        students.add("Rahul");
        System.out.println(students);
        //add
        //size
        System.out.println(students.size());
        //remove
        students.remove(2);
        students.remove("Rahul");
        System.out.println(students);

        //[Amit]
        // set
        students.set(0,"Nikhil");
        System.out.println(students);
        students.addFirst("Name");
        System.out.println(students);
        students.add("last name");
        System.out.println(students);
        //get
        System.out.println(students.get(1)+" First - "+students.getFirst()+" Last- "+students.getLast());
        // contains- true/false
        System.out.println(students.contains("Nikh"));
        //clear
//        students.clear();
        //isEmpty()
        System.out.println("After clear is empty- "+ students.isEmpty());
        for(String student: students){
            System.out.println(student);
        }
//   arraylist-      10 20 30 40 50
        //Linked list- 10->20->30->40->50
        LinkedList<String> cities = new LinkedList<>();
        cities.add("Delhi");

//        difference
//        arraylist               linkedlilst
//        fast search               Fast insert/delete
//          uses array                uses nodes
//         more random access       sequential access


// set -unique
        HashSet<String> names = new HashSet<>();
        names.add("Rahul");
        names.add("Amit");
        names.add("Rahul");
        System.out.println("Set- "+ names);
        //Tree set - automatically sorts data and unique elements
        // Integer - it is an wrapper class
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(50);
        numbers.add(30);
        numbers.add(10);
        numbers.add(20);
        numbers.add(20);
        System.out.println("Tree set- "+numbers);
//        Queue - FIFO | LILO
//        remove at first and add at last
        Queue<String> queue = new LinkedList<>();
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        // a-> b-> c
        // poll -> it removes first data and return it
        // peek -> it just return the first element
        System.out.println(queue.poll());// A
        System.out.println(queue);//b->c
        System.out.println(queue.poll());// b
        System.out.println(queue.peek());//c

        // Map -> Key - value
        // example
        // Key    Value
        // 101 -> Rahul
        // 102 -> Amit
        // 103 -> Nikhil
        // HashMap , key should be unique
        // keys stores as a hash value to increase the speed of searching
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(101,"Rahul");
        hm.put(500,"Amit");
        hm.put(99776,"Nikhil");
        System.out.println(hm.get(500));
        for(Map.Entry<Integer,String> entry : hm.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }


    }
}
 */
