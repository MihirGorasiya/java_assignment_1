public class CheckIsosceles {
    double side1 = 0.0;
    double side2 = 0.0;
    double side3 = 0.0;

    public double calculatePerimeter(double[][] coord) {
        side1 = calculateSide(new double[][]{coord[0], coord[1]});
        side2 = calculateSide(new double[][]{coord[1], coord[2]});
        side3 = calculateSide(new double[][]{coord[0], coord[2]});

        return side1 + side2 + side3;
    }

    public boolean isIsosceles(double[][] coord) {
        side1 = calculateSide(new double[][]{coord[0], coord[1]});
        side2 = calculateSide(new double[][]{coord[1], coord[2]});
        side3 = calculateSide(new double[][]{coord[0], coord[2]});

        return side1 == side2 || side2 == side3 || side3 == side1;
    }

    public double calculateSide(double[][] coordinates) {
        double sideLength;
        double xCordDistance;
        double yCordDistance;

        xCordDistance = (coordinates[0][0] - coordinates[1][0]) * (coordinates[0][0] - coordinates[1][0]);
        yCordDistance = (coordinates[0][1] - coordinates[1][1]) * (coordinates[0][0] - coordinates[1][1]);

        sideLength = Math.sqrt(xCordDistance + yCordDistance);

        return sideLength;
    }
}
