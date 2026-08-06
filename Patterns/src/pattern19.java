//Code to print the symmetric void pattern

import java.util.Scanner;

public class pattern19 {
    static void main() {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = sc.nextInt();
        int s= 0;
        for(int i =0; i<n; i++){
            for(int j =1; j<=n-i; j++) System.out.print("*");
            for(int j =0; j<s; j++) System.out.print(" ");
            for(int j =1; j<=n-i; j++) System.out.print("*");
            s +=2;
            System.out.println();
        }
        for(int i =0; i<n; i++){
            for(int j=1; j<=i; j++) System.out.print("*");
            for(int j=0;j<s; j++) System.out.print(" ");
            for(int j=1; j<=i; j++) System.out.print("*");
            s -=2; // decreasing
            System.out.println();
        }
    }
}
