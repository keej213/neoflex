package task2;

/**
 * Created by roudder on 18.05.2014.
 */
public interface Figure {

    public double getA();
    public double getB();
    public abstract double getSquare();
    public void setColorRgb(int a, int b, int c);
    public int[] getColorRgb();

}
