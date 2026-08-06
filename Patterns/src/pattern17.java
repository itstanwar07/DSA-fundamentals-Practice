//Program to Print the Alpha Hill pattern

import java.util.Scanner;

public class pattern17 {
    static void main() {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n-i-1; j++){
                System.out.print(" ");
            }
            char ch = 'A';
            int brk=(2*i+1)/2;
            for(int j = 1; j<=2*i+1; j++){
                System.out.print(ch);
                if(j<=brk){
                    ch++;
                }
                else{
                    ch--;
                }
            }
            System.out.println();
        }
    }
}
