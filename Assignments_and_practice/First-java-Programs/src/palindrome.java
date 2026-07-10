//To check number is palindrome or not-palindrome number is a number when number reversed then it is same as the given number
import java.util.Scanner;

public class palindrome {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to check palindrome or not");
        int n = sc.nextInt();
        int temp = n;
        int rem;
        int rn = 0;
        while(n>0){
            rem=n%10;
            rn=rn*10+rem;
            n=n/10;
        }
        if(temp==rn)
            System.out.println("The number is palindrome ");
        else
            System.out.println("The number is not palindrome ");
    }
}
