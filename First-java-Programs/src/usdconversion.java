import java.util.Scanner;

// Program to convert the rupees to usd
public class usdconversion {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter currency in rupees");
        double r = sc.nextDouble();
        double usd = r * 0.010;
        System.out.println("The rupees into usd is $"+usd);
    }
}
