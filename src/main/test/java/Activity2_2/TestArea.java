package Activity2_2;

import Activity2_2.Rectangle;
import Activity2_2.Circle;
import Activity2_2.Square;
import Activity2_2.Shapes;
import Activity2_2.Area;
//import Activity2_2.Parallelogram;


import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestArea {

    @Test
    public void testRectangle(){
        System.out.println("TESTING RECTANGLE");
        Area instance = new Area();
        double expectedResult = 800;
        Rectangle rectangle = new Rectangle(20, 40);
        double result = instance.calculateArea(rectangle);
        assertEquals(expectedResult, result, 0.0);

    }

    @Test
    public void testCircle(){
        System.out.println("TESTING CIRCLE");
        Area instance = new Area();
        double expectedResult = 706.5;
        Circle circle = new Circle(15);
        double result = instance.calculateArea(circle);
        assertEquals(expectedResult, result, 0.0);

    }

    @Test
    public void testSquare(){
        System.out.println("TESTING SQUARE");
        Area instance = new Area();
        double expectedResult = 1225;
        Square square = new Square(35);
        double result = instance.calculateArea(square);
        assertEquals(expectedResult, result, 0.0);

    }

    @Ignore
    @Test
    public void testParallelogram(){
        System.out.println("TESTING PARALLELOGRAM");
        Area instance = new Area();
        double expectedResult = 84904.1088;
        Parallelogram parallelogram = new Parallelogram(210.0, 6);
        double result = instance.calculateArea((Shapes) parallelogram);
        assertEquals("Passed", expectedResult, result, 0.0);
    }

    @Test
    public void testingSquare(){
        double expectedResult = 4;
        Area instance = new Area();
        Square square = new Square(2);
        double squareResult = instance.calculateArea(square);
        assertEquals("Area Testing", expectedResult, squareResult, 0.0);

    }

}
