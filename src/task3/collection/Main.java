package task3.collection;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        //1
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        LinkedList<Integer> list2 = new LinkedList<Integer>();
        //3
        double dt1 = 0.0;
        double dt2 = 0.0;

        //2
        for (int i = 0; i < 10; i ++) {
            list1.add(i);
            dt1 += System.nanoTime();
        }

        for (int i = 0; i < 10; i ++) {
            list2.add(i);
            dt2 += System.nanoTime();
        }

        //4
        System.out.println("Отношение времени заполнения: " + dt1/dt2);

        dt1 = 0.0;
        dt2 = 0.0;

        //5
        for (Integer i: list1) {
            dt1 += System.nanoTime();
        }

        for (Integer i: list2) {
            dt2 += System.nanoTime();
        }

        System.out.println("Отношение времени выполнения: " + dt1/dt2);

        dt1 = 0.0;
        dt2 = 0.0;

        //6
        list1.add(2, 11);
        dt1 += System.nanoTime();
        list1.add(5, 12);
        dt1 += System.nanoTime();
        list1.add(7, 13);
        dt1 += System.nanoTime();
        list1.add(8, 14);
        dt1 += System.nanoTime();

        list2.add(2, 11);
        dt2 += System.nanoTime();
        list2.add(5, 12);
        dt2 += System.nanoTime();
        list2.add(7, 13);
        dt2 += System.nanoTime();
        list2.add(8, 14);
        dt2 += System.nanoTime();

        //7
        System.out.println("Отношение времени выполнения: " + dt1/dt2);

        dt1 = 0.0;
        dt2 = 0.0;

        //8
        for (int i = 0; i < list1.size()/2; i++) {
            list1.get((int)(Math.random()*list1.size()));
            dt1 += System.nanoTime();
        }

        for (int i = 0; i < list2.size()/2; i++) {
            list1.get((int)(Math.random()*list2.size()));
            dt2 += System.nanoTime();
        }

        //9
        System.out.println("Отношение времени выполнения: " + dt1/dt2);

        //13
        System.out.println("Тестируем MySortedList:");
        MySortedList sortedList = new MySortedList();

        for (int i = 0; i < 10; i++ ) {
            sortedList.add(new Test((int)(Math.random()*10)));
        }

        for (Object o: sortedList) {
            Test tmp = (Test)o;
            System.out.print(tmp.a + " ");
        }
        System.out.println();
        //сортировка
        MySortedList.sort(sortedList);

        for (Object o: sortedList) {
            Test tmp = (Test)o;
            System.out.print(tmp.a + " ");
        }
        System.out.println();

        //14
        System.out.println("Получаем Set<Test> из List<Test>:");
        List<Test> list = new ArrayList<Test>();

        for (int i = 0; i < 10; i++) {
            list.add(new Test((int)(Math.random()*10)));
        }

        for (Test t: list) {
            System.out.print(t.a + " ");
        }
        System.out.println();

        Set<Test> hashList  = new HashSet<Test>();

        for (Test t: list) {
            int i = 0;
            for (Test t2: hashList) {
                if (t2.compareTo(t) == 0) {
                    i++;
                }
            }
            if (i == 0) {
                hashList.add(t);
            }
        }

        //15
        System.out.println("Значения и set<Test>:");
        Iterator iterator = hashList.iterator();
        while(iterator.hasNext()){
            Test tmp = (Test)iterator.next();
            System.out.print(tmp.a + " ");
        }
        System.out.println();

        //16
        System.out.println("Получаем treeMap из Set<Test>:");
        TreeMap<Integer, Test> treeMap = new TreeMap<Integer, Test>();

        for (Test t: hashList) {
            treeMap.put(t.a, t);
        }

        //17
        System.out.println(treeMap.keySet());
        System.out.println(treeMap.values());

    }
}
