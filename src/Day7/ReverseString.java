package Day7;

public class ReverseString {

    public static void main(String[] args) {

    String str = "abcba";

    int left = 0;
    int right = str.length()-1;

    while(left < right){
        if(str.charAt(left) != str.charAt(right)){
            System.out.println("Not Palindrome");
            return;
        }
        left++;
        right--;
    }
        System.out.println("Palindrome");

}
}
