package Assignments;

//public class ques9 {
//
//    public static  class ListNode{
//        int val;
//
//        ListNode next;
//
//        ListNode(int val){
//            this.val=val;
//            this.next=null;
//        }
//    }
//
//    public boolean hascycle(ListNode head){
//        if(head == null || head.next == null){
//            return false;
//        }
//        ListNode slow = head , fast = head;
//
//        while(fast!=null && fast.next !=null){
//            fast=fast.next.next;
//            slow=slow.next;
//
//            if(slow == fast){
//                return true;
//            }
//
//
//        }
//        return false;
//    }
//    public static void main(String[] args) {
//        ques9 linkedListCycle = new ques9();
//
//        // Creating a linked list with a cycle
//        ListNode headWithCycle = new ListNode(1);
//        headWithCycle.next = new ListNode(2);
//        headWithCycle.next.next = new ListNode(3);
//        headWithCycle.next.next.next = headWithCycle.next; // Creating a cycle at the end
//
//        // Creating a linked list without a cycle
//        ListNode headWithoutCycle = new ListNode(1);
//        headWithoutCycle.next = new ListNode(2);
//        headWithoutCycle.next.next = new ListNode(3);
//
//        // Testing hasCycle method
//        System.out.println("LinkedList with cycle: " + linkedListCycle.hascycle(headWithCycle)); // Output: true
//        System.out.println("LinkedList without cycle: " + linkedListCycle.hascycle(headWithoutCycle)); // Output: false
//    }
//}
import java.util.*;

class User {
    private String id;
    private String name;
    private String email;
    private String password;

    public User(String id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}

class Train {
    private String trainId;
    private String trainName;
    private String source;
    private String destination;
    private int totalSeats;
    private Map<Integer, Boolean> seats; // Seat number and availability

    public Train(String trainId, String trainName, String source, String destination, int totalSeats) {
        this.trainId = trainId;
        this.trainName = trainName;
        this.source = source;
        this.destination = destination;
        this.totalSeats = totalSeats;
        this.seats = new HashMap<>();
        for (int i = 1; i <= totalSeats; i++) {
            this.seats.put(i, true); // All seats are initially available
        }
    }

    public String getTrainId() {
        return trainId;
    }

    public String getTrainName() {
        return trainName;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public Map<Integer, Boolean> getSeats() {
        return seats;
    }

    public int getTotalSeats() {
        return totalSeats;
    }
}

class Booking {
    private String bookingId;
    private String userId;
    private String trainId;
    private int seatNumber;

    public Booking(String bookingId, String userId, String trainId, int seatNumber) {
        this.bookingId = bookingId;
        this.userId = userId;
        this.trainId = trainId;
        this.seatNumber = seatNumber;
    }

    public String getBookingId() {
        return bookingId;
    }

    public String getUserId() {
        return userId;
    }

    public String getTrainId() {
        return trainId;
    }

    public int getSeatNumber() {
        return seatNumber;
    }
}

public class RailwayReservationSystem {
    private Map<String, User> users = new HashMap<>();
    private Map<String, Train> trains = new HashMap<>();
    private Map<String, Booking> bookings = new HashMap<>();

    // User Registration
    public void registerUser(String id, String name, String email, String password) {
        if (users.containsKey(id)) {
            System.out.println("User already exists with ID: " + id);
            return;
        }
        User user = new User(id, name, email, password);
        users.put(id, user);
        System.out.println("User registered successfully.");
    }

    // Add Train
    public void addTrain(String trainId, String trainName, String source, String destination, int totalSeats) {
        if (trains.containsKey(trainId)) {
            System.out.println("Train already exists with ID: " + trainId);
            return;
        }
        Train train = new Train(trainId, trainName, source, destination, totalSeats);
        trains.put(trainId, train);
        System.out.println("Train added successfully.");
    }

    // Book a Seat
    public void bookSeat(String userId, String trainId, int seatNumber) {
        if (!users.containsKey(userId)) {
            System.out.println("User does not exist.");
            return;
        }
        if (!trains.containsKey(trainId)) {
            System.out.println("Train does not exist.");
            return;
        }
        Train train = trains.get(trainId);
        if (!train.getSeats().get(seatNumber)) {
            System.out.println("Seat is already booked.");
            return;
        }
        String bookingId = UUID.randomUUID().toString();
        Booking booking = new Booking(bookingId, userId, trainId, seatNumber);
        bookings.put(bookingId, booking);
        train.getSeats().put(seatNumber, false); // Mark seat as booked
        System.out.println("Seat booked successfully.");
    }

    // Display Train Information
    public void displayTrainInfo(String trainId) {
        if (!trains.containsKey(trainId)) {
            System.out.println("Train does not exist.");
            return;
        }
        Train train = trains.get(trainId);
        System.out.println("Train ID: " + train.getTrainId());
        System.out.println("Train Name: " + train.getTrainName());
        System.out.println("Source: " + train.getSource());
        System.out.println("Destination: " + train.getDestination());
        System.out.println("Seats: " + train.getSeats());
    }

    public static void main(String[] args) {
        RailwayReservationSystem system = new RailwayReservationSystem();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Register User");
            System.out.println("2. Add Train");
            System.out.println("3. Book Seat");
            System.out.println("4. Display Train Info");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter User ID: ");
                    String userId = scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter Password: ");
                    String password = scanner.nextLine();
                    system.registerUser(userId, name, email, password);
                    break;
                case 2:
                    System.out.print("Enter Train ID: ");
                    String trainId = scanner.nextLine();
                    System.out.print("Enter Train Name: ");
                    String trainName = scanner.nextLine();
                    System.out.print("Enter Source: ");
                    String source = scanner.nextLine();
                    System.out.print("Enter Destination: ");
                    String destination = scanner.nextLine();
                    System.out.print("Enter Total Seats: ");
                    int totalSeats = scanner.nextInt();
                    system.addTrain(trainId, trainName, source, destination, totalSeats);
                    break;
                case 3:
                    System.out.print("Enter User ID: ");
                    userId = scanner.nextLine();
                    System.out.print("Enter Train ID: ");
                    trainId = scanner.nextLine();
                    System.out.print("Enter Seat Number: ");
                    int seatNumber = scanner.nextInt();
                    system.bookSeat(userId, trainId, seatNumber);
                    break;
                case 4:
                    System.out.print("Enter Train ID: ");
                    trainId = scanner.nextLine();
                    system.displayTrainInfo(trainId);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
