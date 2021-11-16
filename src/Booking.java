//1. A booking consists of matching a bookable room and an assistant on shift at a specific time-slot to perform a
//COVID-19 test on a student. It is the main function of the system.
//2. A booking has a unique sequential number (identification code) and the email of the student being tested (enforce
//“*@uok.ac.uk”).
//3. To create a booking in a time-slot, the system must certify the availability of resources. That is, must have a
//bookable room not FULL and an assistant on shift which is FREE.
//4. Once a booking is created, the statuses of the bookable room and of the assistant on shift must be updated
//accordingly. The status of a booking can be:
//• SCHEDULED – the test has not been done yet.
//• COMPLETED – test completed.
//5. A booking not COMPLETED can be cancelled, i.e., deleted from the system. After cancellation, the resources
//(room and assistant) should be released for booking again, i.e., their statuses must be updated.
//6. A booking SCHEDULED can become COMPLETED. Once completed, the booking cannot be deleted due to
//audit processes.
//7. Print template: | <dd/mm/yyyy HH:MM> | <status> | <assistant_email> | <room_code> | <student_email> |
public class Booking {
    private String date;
    private String status;
    private Assistant assistant;
    private Room room;
    private String email;

    public Booking(String date, String status, Assistant assistant, Room room, String email){
        this.date = date;
        this.status = status;
        this.assistant = assistant;
        this.room = room;
        this.email = email;
    }

    public Assistant getAssistant() {
        return assistant;
    }

    public String getDate() {
        return date;
    }

    public String getStatus() {
        return status;
    }

    public String getEmail() {
        return email;
    }

    public Room getRoom() {
        return room;
    }

    public void setAssistant(Assistant assistant) {
        this.assistant = assistant;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "| " +
                date +
                " | " + status +
                " | " + assistant +
                " | " + room +
                " | " + email +
                " |";
    }
}
