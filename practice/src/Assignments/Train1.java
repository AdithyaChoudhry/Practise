package Assignments;

import java.util.HashMap;
import java.util.Map;

public class Train1 {
    String trainid;
    String trainname;
    String source;
    String destination;
    int totalseats;

    Map<Integer , Boolean> seats;

    public Train1(String trainid, String trainname, String source, String destination, int totalseats){
        this.trainid = trainid;
        this.trainname = trainname;
        this.source = source;
        this.destination = destination;
        this.totalseats = totalseats;
        this.seats = new HashMap<>();
        for (int i = 0; i <= totalseats; i++) {
            this.seats.put(i,true);
        }
    }
}
