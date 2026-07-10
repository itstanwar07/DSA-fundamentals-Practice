import java.util.Scanner;

public class largest {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Two Numbers ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        if(n1>n2)
            System.out.println("The number n1 = "+n1+" is largest number");
        else
            System.out.println("The number n2 = "+n2+" is largest number");
    }
}
