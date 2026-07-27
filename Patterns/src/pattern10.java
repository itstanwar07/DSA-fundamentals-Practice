//T Print the half diamond star pattern 
import java.util.Scanner;

public class pattern10 {
    static void main() {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        for(int i =0; i<n; i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i =0; i<n; i++){
            for(int j=n;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
