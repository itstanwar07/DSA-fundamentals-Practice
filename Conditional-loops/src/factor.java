import java.util.Scanner;

//Program to print the factor of a number using loops
public class factor {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println("The Factor of number is ");
        for(int i =1;i <= n; i++){
            if(n%i==0)
                System.out.print(i+" ");
        }
    }
}
