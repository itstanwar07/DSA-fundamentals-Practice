//program to calculate the Simple Intrest when Principal TIme and Rate is given as user input
import java.util.Scanner;

public class simpleintrest {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principal, Time and Rate ");
        int p = sc.nextInt();
        int t = sc.nextInt();
        int r = sc.nextInt();
        int si = (p*r*t)/100;
        System.out.println("The simple intrest is "+si);
    }
}
