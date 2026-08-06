import java.util.Scanner;

public class max_min {
    
    void minmax(int n, int n1, int n2){
        if(n>n1){
            System.out.println("Number n is greater = "+n);
        } else if (n1>n2) {
            System.out.println("Number n1 is greater = "+n1);
        }
        else{
            System.out.println("number n2 is greater = "+n2);
        }
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three numbers ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        max_min ob = new max_min();
        ob.minmax(n1,n2,n3);
        
    }
}
