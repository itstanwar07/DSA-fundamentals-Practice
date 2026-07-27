import java.util.Scanner;

public class pattern14 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n= sc.nextInt();
        for(int i = 0; i<n; i++){
            for(char ch = 'A'; ch<='A'+i;ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
