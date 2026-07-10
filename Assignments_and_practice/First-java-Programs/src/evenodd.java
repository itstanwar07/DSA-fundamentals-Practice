// Program to print the even or odd number
import java.util.Scanner;

public class evenodd{
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if(n%2==0)
            System.out.println("The number is even and the number is "+n);
        else
            System.out.println("The number is odd and the number is "+n);

    }
}