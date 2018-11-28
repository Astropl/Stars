package pl.astro;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Draw draw = new Draw();
        System.out.println("Draw Square: n = 3");
        System.out.println(draw.drawSquare(3));
        System.out.println("Draw Rectangle: n = 3, m = 4");
        System.out.println(draw.drawRectangle(3, 4));
        System.out.println("Draw Isosceles Triangle: n = 3");
        System.out.println(draw.drawIsoscelesTriangle(3));
        System.out.println("Draw Diamond: n = 5");
        System.out.println(draw.drawDiamond(5));
        System.out.println("Draw Rectangle Triangle: n = 4");
        System.out.println(draw.drawRectangleTriangle(4))   ;


    }
}
