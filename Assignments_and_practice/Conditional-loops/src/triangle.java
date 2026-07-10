import java.util.Scanner;

// This program is to calculate the area and perimeter of the triangle
public class triangle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the choice p to calculate the perimeter and a to calculate the area of triangle ");
        char ch = sc.next().charAt(0);

        if (ch=='a') {
            System.out.println("Enter the height and base of the triangle");
            double h = sc.nextDouble();
            double b = sc.nextDouble();
            double area = (b * h) /2;
            System.out.println("The area of the triangle is "+area);
        } else if (ch == 'p') {
            System.out.println("For perimeter Enter the sides length ");
            double s1 = sc.nextDouble();
            double s2 = sc.nextDouble();
            double s3 = sc.nextDouble();
            double p =  s1 + s2 +s3;
            System.out.println("The perimeter of the triangle is ");
        }
        else
            System.out.println("Invalid CHoice ");
    }
}
