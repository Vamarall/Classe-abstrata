package program;

import entities.Circle;
import entities.Rectangle;
import enumColor.Color;
import entities.AbstractShape;

public class App {
    public static void main(String[] args) throws Exception {
        AbstractShape abs1 = new Circle(Color.BLACK, 10);
        AbstractShape abs2 = new Rectangle(Color.WHITE, 6, 5);

        System.out.println("Circle color: " + abs1.getColor());
        System.out.println("Circle area: " + String.format("%.3f", abs1.area()));
        System.out.println("Rectangle color: " + abs2.getColor());
        System.out.println("Rectangle area: " + String.format("%.3f", abs2.area()));

    }
}
