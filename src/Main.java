import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] coordinates = new double[3][2];

        Main main = new Main();
        coordinates = main.setCoordinates(scanner);

        CheckIsosceles checkIsosceles = new CheckIsosceles();
        System.out.print("\nPerimeter: " + checkIsosceles.calculatePerimeter(coordinates));

        String isosceles = checkIsosceles.isIsosceles(coordinates)
                ? "isosceles."
                : "Not isosceles.";

        System.out.println(". The triangle is " + isosceles);


        double[] pointToCheck = new double[2];
        System.out.println("\nEnter Point to check if the point is inside triangle or outside triangle.");
        System.out.print("Please enter x: ");
        pointToCheck[0] = scanner.nextDouble();
        System.out.print("Please enter y: ");
        pointToCheck[1] = scanner.nextDouble();

        PointLocationCheck pointLocationCheck = new PointLocationCheck();
        boolean isPointInside = pointLocationCheck.isPointInsideTriangle(new double[][]{coordinates[0], coordinates[1], coordinates[2], pointToCheck});


        System.out.println(isPointInside ? "The point is inside the triangle." : "The point is not inside the triangle.");


    }

    public double[][] setCoordinates(Scanner scan) {
        double[][] coordinates = new double[3][2];

        for (int i = 0; i < 3; i++) {
            System.out.println("Construction of a new point");
            System.out.print("Please enter x: ");
            coordinates[i][0] = scan.nextDouble();
            System.out.print("Please enter y: ");
            coordinates[i][1] = scan.nextDouble();
        }

        return coordinates;
    }
}