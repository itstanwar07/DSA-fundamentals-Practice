import java.util.Scanner;

//This Program to calculate the area and perimeter of the rectangle
public class rectangle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the choice to calculate the perimeter or the area of the rectangle");
        char ch = sc.next().charAt(0);
        System.out.println("Enter the length and base of the Rectangle ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();

        if (ch == 'a') {

            double area = (b * l);
            System.out.println("The area of the rectangle is " + area);
        } else if (ch == 'p') {

            double p = 2 * (l + b);
            System.out.println("The perimeter of the rectangle is ");
        }else
            System.out.println("Invalid choice");
    }
}
