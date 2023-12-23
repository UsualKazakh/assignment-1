package papka;

import java.util.ArrayList;

public class Shape {
    private static ArrayList<Point> points;

    public Shape() {
        points = new ArrayList<>();
    }

    public void addPoint(Point point) {
        points.add(point);
    }

    public double Perimeter() {
        double perimeter = 0;
        int size = points.size();
        for (int i = 0; i < size - 1; i++) {
            perimeter += points.get(i).getDistance(points.get(i + 1));
        }

        perimeter += points.get(size - 1).getDistance(points.get(0));

        return perimeter;
    }

    public double LongestSide() {
        double longSide = 0;
        int size = points.size();

        for (int i = 0; i < size - 1; i++) {
            int nextIndex = (i + 1) % size;
            double sideLength = points.get(i).getDistance(points.get(nextIndex));

            if (sideLength > longSide) {
                longSide = sideLength;
            }
        }

        return longSide;
    }

    public double AvgSide() {
        double all = 0;
        int size = points.size();

        for (int i = 0; i < size - 1; i++) {
            all += points.get(i).getDistance(points.get(i + 1));
        }

        all += points.get(size - 1).getDistance(points.get(0));

        return all / size;
    }
}
