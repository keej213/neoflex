package task2;

/**
 * Created by roudder on 18.05.2014.
 */
public class Rectangle extends AbstractFigure {
    private double a;
    private double b;

    private static String type;



    public Rectangle(double a, double b){
        this.a = a;
        this.b = b;
            }

    public Rectangle(){
    }

    public double getSquare(){
        return a * b ;
    }

    public int[] getColorRgb(){
        return colorRgb ;
    }
    public void setColorRgb(int a, int b, int c){
        colorRgb[0] = a;
        colorRgb[1] = b;
        colorRgb[2] = c;

    }

    public double getA(){
        return a;}

    public double getB() {
        return b;
    }

    public static String getType(){
        return type;
    }
}
