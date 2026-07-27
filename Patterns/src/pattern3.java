//pattern to print right angle numbered triangle-1

import java.util.Scanner;

public class pattern3 {
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        for(int i= 1;i<=n;i++){
            for(int j=1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
