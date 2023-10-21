public class PointLocationCheck {
    public double calculateArea(double[][] coordinates) {

        double x = coordinates[0][1] * (coordinates[1][1] - coordinates[2][1]);
        double y = coordinates[1][1] * (coordinates[2][1] - coordinates[0][1]);
        double z = coordinates[2][1] * (coordinates[0][1] - coordinates[1][1]);


        return (x + y + z) / 2;
    }

    public boolean isPointInsideTriangle(double[][] coord){
        double triangleArea = calculateArea(new double[][]{coord[0],coord[1],coord[2]});

        double area1 = calculateArea(new double[][]{coord[3],coord[1],coord[2]});
        double area2 = calculateArea(new double[][]{coord[0],coord[3],coord[2]});
        double area3 = calculateArea(new double[][]{coord[0],coord[1],coord[3]});

        return triangleArea == area1 + area2 + area3;
    }
}
