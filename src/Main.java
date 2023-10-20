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