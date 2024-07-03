package Arrays;

import Assignments.Train1;
import Assignments.User1;
import java.util.Map;
import java.util.HashMap;
import java.util.UUID;

public class railwaysys {

    Map<String , User1> users = new HashMap<>();
    Map<String , Train1> trains = new HashMap<>();

    public void registeruser(String id, String name,String email , String password){
        if(users.containsKey(id)){
            System.out.println("exists");
            return;
        }

        User1 user = new User1(id,name,email,password);
            users.put(id,user);
        }
    public void bookseat(String userid,String trainid ){
        Train1 train = trains.get(trainid);

        String bookngid = UUID.randomUUID().toString();

    }
}
