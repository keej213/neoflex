package task3.collection;

public class Test implements Comparable {
    Integer a;

    public Test(Integer a) {
        this.a = a;
    }

    public int compareTo(Object obj) {
        {
            Test tmp = (Test)obj;
            if(this.a < tmp.a)
            {
                return -1;
            }
            else if(this.a > tmp.a)
            {
                return 1;
            }
            return 0;
        }
    }
}
