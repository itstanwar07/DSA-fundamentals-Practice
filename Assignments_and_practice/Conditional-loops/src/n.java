import java.util.Scanner;

// Program to print the number till it user enter 0
public class n {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=1,sum =0;
        while(n!=0){
            n= sc.nextInt();;
            sum += n;
        }
        System.out.println("The sum till user enter 0 is "+sum);
    }
}
