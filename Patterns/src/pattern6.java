//pattern to print the  inverted number pyramid


import java.util.Scanner;

public class pattern6 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int t= n;
        for(int i = 0;i<t;i++){
            for(int j =1;j<=n;j++){
                System.out.print(j);
            }
            System.out.println();
            n--;
        }
    }
}
