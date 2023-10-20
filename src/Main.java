import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[][] coordinates = new float[3][2];

        var main = new Main();

        coordinates = main.getCoordinates(scanner);





    }


    public float[][] getCoordinates(Scanner scan) {
        float[][] coordinates = new float[3][2];

        for (int i = 0; i < 3; i++) {
            System.out.println("Construction of a new point");
            System.out.print("Please enter x: ");
            coordinates[i][0] = scan.nextFloat();
            System.out.print("Please enter y: ");
            coordinates[i][1] = scan.nextFloat();
        }

        return coordinates;
    }
}