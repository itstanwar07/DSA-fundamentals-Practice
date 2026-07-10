//This program takes two number and check the operator and perform the operations between them

import java.util.*;


public class operation {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two numbers ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int result;
        System.out.println("Enter the operator - only +, -, /, *");
        char ch = sc.next().charAt(0);
        if(ch=='+'){
            result = n1 + n2;
            System.out.println("The sum is "+result);
        } else if (ch=='-') {
            result = n1 - n2;
            System.out.println("The difference is"+result);
        } else if (ch=='*') {
            result = n1 * n2;
            System.out.println("The Product is "+result);
        } else if (ch=='/') {
            result = n1/n2;
            System.out.println("the division is "+result);
        }else
            System.out.println("invalid Operator entered");
    }
}
