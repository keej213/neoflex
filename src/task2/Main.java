package task2;

/**
 * Created by roudder on 18.05.2014.
 */
    public class Main {

        public static void main(String[] args) {
            Figure rectangle = new Rectangle(5.3, 4.2);
            rectangle.setColorRgb(255, 0, 0);
            Figure box = new Box(3.5);
            box.setColorRgb(255, 250, 250);

            System.out.println(box.getA());
            System.out.println(box.getColorRgb()[0] + ", " + box.getColorRgb()[1] + ", " + box.getColorRgb()[2]);
            System.out.println(rectangle.getColorRgb()[0] + ", " + rectangle.getColorRgb()[1] + ", " + rectangle.getColorRgb()[2]);
            System.out.println(rectangle.getA());
            System.out.println(rectangle.getB());


            System.out.println(Box.getType());
            System.out.println(Rectangle.getType());

            ColorFigure colorFigure = new Box();
            System.out.println(colorFigure.getColorRgb()[0] + ", " + colorFigure.getColorRgb()[1] + ", " + colorFigure.getColorRgb()[2]);

        }
    }
