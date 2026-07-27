//Printing rectangular star pattern


import java.util.Scanner;

public class pattern1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            for(int j =0; j<n ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
