package task3.collection_v2;
import java.util.Comparator;

public class PassengerComp implements Comparator {
        public int compare(Object user1, Object user2) {
            return ((Passenger) user1).getName().compareTo(((Passenger) user2).getName());
        }
    }

