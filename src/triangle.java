import java.util.Scanner;

import Classes.Triangle;

public class triangle {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
       
        System.out.println("Enter with the width of triangle: ");
        double width = sc.nextDouble();
        System.out.println("Enter with the height of triangle: ");
        double height = sc.nextDouble();

        Triangle triangle = new Triangle(width, height);

        double resultA = triangle.area();
        double resultP = triangle.perimeter();
        double resultD = triangle.diagonal();

        System.out.println("Area is: " + resultA);
        System.out.println("Perimeter is: " + resultP);
        System.out.println("Diagonal is: " + resultD);

    }
}