import java.util.*;

public class palindromeno {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int palindrome = sc.nextInt();

        if(isPalindrome(palindrome)){
            System.out.println("number:"+ palindrome+"is a palindrome");
        }else{
            System.out.println("number:" + palindrome+"is not a palindrome");
        }

}
//function for palindrome
public static boolean isPalindrome(int number){
    int palindrome = number;//copied number into variable
    int reverse = 0;
    while(palindrome !=0){
        //extracting last digit from the copied value and adding it to reversed value
        int remainder = palindrome%10;
        reverse = reverse * 10 + remainder;
        palindrome = palindrome/10;
    }
    //if original and the reverse of number is equal means 
    //number is palindrome in java
    if(number == reverse){
        return true ;
    }
    return false;
}
}
