//Pattern to print inverted pyramid(right angle triangle)

import java.util.Scanner;

public class pattern5 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int t=n;
        for(int i = 0;i<t;i++){
            for (int j=n;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
            n--;
        }
    }
}
