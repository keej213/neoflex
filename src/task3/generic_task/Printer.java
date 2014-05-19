package task3.generic_task;


public class Printer<T,K extends T> {
    private T first;
    private T second;

    Printer(T first){
        this.first = first;
    }
    Printer(T first, T second){
        this(first);
        this.second = second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getObject(){
        return first;

    }
    public void print(){
        System.out.println("Printer" + first.toString());
        System.out.println("Printer" + second.toString());
    }
    public  Printer update(Printer p, T first) {
        p.setFirst(first);
        return p;
    }
}


