import papka.Point;
import papka.Shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C://Users//yesta//IdeaProjects//OOP_hw1//src//source");
        Scanner sc = new Scanner(file);
        Shape shape = new Shape();
        while (sc.hasNextLine()) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            Point point = new Point(x, y);
            shape.addPoint(point);
        }

        System.out.println(shape.Perimeter());
        System.out.println(shape.LongestSide());
        System.out.println(shape.AvgSide());
    }
}