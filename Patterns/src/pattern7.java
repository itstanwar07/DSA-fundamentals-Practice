//pattern to print the pyramid
/* example
            *
          * * *
         * * * *
        * * * * *
 */

import java.util.Scanner;

public class pattern7 {
    static void main() {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        for(int i =0; i<n-1;i++){
            for(int j = 0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j =0; j< 2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
