package task2;

/**
 * Created by roudder on 18.05.2014.
 */
public class CompoundFigure extends AbstractFigure {
    public double getSquare(){
        return 1;
    }
    private AbstractFigure abs;

    public double getA() {
        return abs.getA();
    }

    public double getB() {
        return abs.getB();
    }

    @Override
    public void setColorRgb(int a, int b, int c) {
        abs.setColorRgb(a,b,c);
    }
}

