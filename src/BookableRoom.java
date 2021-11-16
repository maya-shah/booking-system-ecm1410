//1. A bookable room is a room registered by the university that can be effectively used for tests. As the name
//suggests, it is a room available for booking.
//2. A bookable room is a room allocated in a specific time-slot (dd/mm/yyyy HH:MM). Since rooms are available
//from 7 AM - 10 AM, the system will offer at most three bookable rooms (time-slots) per room per day.
//3. A bookable room has an occupancy and, depending on the room’s capacity, its status can be:
//• EMPTY – when occupancy is zero.
//• AVAILABLE – when occupancy is less than the room capacity.
//• FULL – when occupancy is equal to the room capacity.
//4. The occupancy can never be bigger than the room capacity.
//5. Only EMPTY bookable rooms can be removed from the system.
//6. The status of a bookable room must be updated whenever its occupancy changes.
//7. Print template: | <dd/mm/yyyy HH:MM> | <status> | <room_code> | occupancy: <occupancy> |
public class BookableRoom {
    private String date;
    private String status;
    private Room r;
    private int occupancy;

    public BookableRoom(String date, String status,Room r){
        this.date = date;
        this.status = status;
        this.r = r;
    }


    public int getOccupancy() {
        return occupancy;
    }

    public Room getR() {
        return r;
    }

    public String getDate() {
        return date;
    }

    public String getStatus() {
        return status;
    }

    public void setR(Room r) {
        this.r = r;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setOccupancy(int occupancy) {
        this.occupancy = occupancy;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "| " +
                date +
                " | " + status +
                " | " + r +
                " | occupancy: " + occupancy +
                " |";
    }
}
