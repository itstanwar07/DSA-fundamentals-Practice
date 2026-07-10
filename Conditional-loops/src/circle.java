import java.util.Scanner;

//This is the program to calculate the area and the perimeter of the circle
public class circle {
    static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle ");
        int r = sc.nextInt();
        double  p = 2 * 3.14 * r;
        double area = 3.14 * Math.pow(r,2);
        System.out.println("The area of the circle of radius r is "+area);
        System.out.println("The perimeter of the circle of radius r is "+p);
    }
}
