package task2;

/**
 * Created by roudder on 18.05.2014.
 */
public class Box extends Rectangle {
    public Box(double a) {
        super(a, a);
    }

    public Box() {
        this(1);
    }

    @Override
    public double getSquare() {
        return super.getSquare();
    }

    private static String type;
    public static String getType(){
        return type;
    }
}
