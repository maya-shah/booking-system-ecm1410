import java.util.ArrayList;

//1. The booking system is responsible for most functionalities. It has a list of bookable rooms, a list of assistants on
//shift, and a list of bookings.
//2. This class must be able to manage general functionalities on these lists, i.e., you should implement functions to
//add, remove, and to show bookable rooms, assistants on shift, and bookings.
//3. There is a time-slot concept that will guide the booking system. For instance, rooms will be available, and
//assistants will work at a specific time-slot, i.e., date, time and duration. Hence, tests should be booked at
//available slots.
//4. Every time-slot has a fixed duration – a positive number representing the duration of a test, in minutes. This
//quantity includes the time spent doing the test and the time to sanitize the room. The current policy establishes
//this duration to be 60 minutes.
public class BookingSystem {

    private ArrayList<AssistantOnShift> AsstOnShift = new ArrayList<>();
    private ArrayList<BookableRoom> bookRoom = new ArrayList<>();
    private ArrayList<Booking> bookings = new ArrayList<>();

    public ArrayList<AssistantOnShift> getAsstOnShift() {
        return AsstOnShift;
    }

    public ArrayList<BookableRoom> getBookRoom() {
        return bookRoom;
    }

    public ArrayList<Booking> getBookings() {
        return bookings;
    }

    public void setAsstOnShift(ArrayList<AssistantOnShift> asstOnShift) {
        AsstOnShift = asstOnShift;
    }

    public void setBookings(ArrayList<Booking> bookings) {
        this.bookings = bookings;
    }

    public void setBookRoom(ArrayList<BookableRoom> bookRoom) {
        this.bookRoom = bookRoom;
    }



   // public addBookableRoom(){
      //  System.out.println(r.getCode());
        //function that lists the rooms
        //when the person adds a room
        //how to delete a room
        //make sure the room isnt in use
   // }
}
