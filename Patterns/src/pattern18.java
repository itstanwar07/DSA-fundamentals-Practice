// To print the Alpha-Triangle Pattern

import java.util.Scanner;

public class pattern18 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = sc.nextInt();
        for(int i = 0;i<n; i++){
//            char ch= (char)(('A'+n-1)-i);
            for(char ch = (char)(('A'+n-1)-i);ch<=('A'+n-1); ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
