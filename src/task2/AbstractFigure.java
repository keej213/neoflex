package task2;

/**
 * Created by roudder on 18.05.2014.
 */
public abstract class AbstractFigure implements Figure, ColorFigure {
    protected int[] colorRgb = new int[3];

    public int[] getColorRgb(){
        return colorRgb;
    }
    public abstract double getSquare();

    public void printSquare(){
        getSquare();
    }


}
