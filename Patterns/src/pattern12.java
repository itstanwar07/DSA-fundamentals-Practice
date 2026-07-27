//Print Number crown pattern

import java.util.Scanner;

public class pattern12 {
    static void main() {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = sc.nextInt();
        int spaces = 2*(n-1);
        for(int i = 1; i<=n;i++){
            for(int j = 1; j<=i; j++)
                System.out.print(j);
            for(int j = 1; j<=spaces; j++)
                System.out.print(" ");
            for(int j = i;j>=1;j--)
                System.out.print(j);
            System.out.println();
            spaces-=2;
        }
    }
}
