package task3.generic_task;


public class Main {
    public static void main(String[] args) {
        TestA testA = new TestA();
        TestB testB = new TestB();
        Printer<TestA,TestB> printer1 = new Printer<TestA, TestB>(testA, testB);
        printer1.print();
        Printer<TestA, TestA> printer2 = new Printer<TestA, TestA>(testA, testA);

        Printer<TestA,TestB> printer3 = new Printer<TestA, TestB>(testA, testB);
        printer1.print();



    }
}
