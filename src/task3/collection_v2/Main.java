package task3.collection_v2;

import java.util.*;

/**
 * Created by roudder on 19.05.2014.
 */
public class Main {

    public static void main(String[] args) {

        List<Passenger> passengers = new ArrayList<Passenger>();
        TreeMap<Integer,List<Passenger>> raseMap = new TreeMap<Integer, List<Passenger>>();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Введите имя, номер документа, номер рейса");
            passengers.add(new Passenger());
            passengers.get(i).setName(scanner.next());
            passengers.get(i).setDocumNumber(scanner.nextInt());
            passengers.get(i).setRaseNumber(scanner.nextInt());
            if (!raseMap.containsKey(passengers.get(i).getRaseNumber())) {
                raseMap.put(passengers.get(i).getRaseNumber(), new ArrayList<Passenger>());
                raseMap.get(passengers.get(i).getRaseNumber()).add(passengers.get(i));
            } else {
                raseMap.get(passengers.get(i).getRaseNumber()).add(passengers.get(i));
            }
        }

        System.out.println("Количество рейсов :" + raseMap.size());

        for(Map.Entry entry: raseMap.entrySet()) {
            //получить ключ
            Integer key = (Integer)entry.getKey();
            //получить значение
            ArrayList value = (ArrayList)entry.getValue();
            value.sort(new PassengerComp());
            System.out.println("Рейс № " + key + ". " + value.size() + " пассажиров:");
            for (Object obj: value) {
                Passenger p = (Passenger)obj;
                System.out.println("Имя: " + p.getName() + ". Документ: " + p.getDocumNumber());
            }
        }

    }
}
