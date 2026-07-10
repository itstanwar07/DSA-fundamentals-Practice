//fibonacci series
import java.util.Scanner;

public class fibonacci {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int s = 0,r;//s is starting number 0
        int s2 = 1;//s2 is starting second number 1 and r is the resultant sum of previous two number
        for(int i = 1; i<=n ;i++){
            System.out.println(s);
            r=s+s2;
            s2=s;
            s=r;
        }
    }
}
