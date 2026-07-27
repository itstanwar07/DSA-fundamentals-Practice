//Printing the binary number right angle triangle

import java.util.Scanner;

public class pattern11 {
    static void main() {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int t=0;
        for(int i=0;i<n;i++){
            for(int j = 0; j<=i;j++){
                if(t%2==0)
                    System.out.print("1");
                else
                    System.out.print("0");
                t++;
            }
            System.out.println();
        }
    }
}
