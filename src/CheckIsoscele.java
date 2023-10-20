import java.util.Arrays;

public class CheckIsoscele {
    double side1 = 0.0;
    double side2 = 0.0;
    double side3 = 0.0;



    public double calculateSide(double[][] coordinates) {
        double sideLength = 0.0;
        double xCoordDistance = 0;
        double yCoordDistance = 0;

        xCoordDistance = (coordinates[0][0] - coordinates[1][0]) * (coordinates[0][0] - coordinates[1][0]);
        yCoordDistance = (coordinates[0][1] - coordinates[1][1]) * (coordinates[0][0] - coordinates[1][1]);

        sideLength = Math.sqrt(xCoordDistance + yCoordDistance);

        return sideLength;
    }
}
