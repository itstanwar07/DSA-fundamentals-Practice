// Program to check for armstrong number or not
import java.util.Scanner;


public class armstrong {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n= sc.nextInt();
        int n1 = n, n2=n, d;
        double sum = 0.0;
        int p = 0;
        while(n>0){
            n=n/10;
            p++;
        }
        while(n1>0){
            d=n1%10;
            sum = sum + Math.pow(d,p);
            n1/=10;
        }
        if(n2==sum)
            System.out.println("The number is armstrong");
        else
            System.out.println("the number is not armstrong");
        }
    }

