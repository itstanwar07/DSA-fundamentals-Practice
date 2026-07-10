import java.util.Scanner;

// Program to take the input of the number till user enter 0 and then give the largest from those number
public class largest {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int n = 1;
        int max = 0;
        for(int i = 0;n >0; i++){
            n= sc.nextInt();
            if(n==0)
                break;
            if(n>max){
                max=n;
            }
        }
        System.out.println("The largest number from the user entered is"+max);
    }
}
