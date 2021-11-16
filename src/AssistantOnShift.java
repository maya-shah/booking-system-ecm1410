//1. An assistant on shift is a volunteer already registered within the university that can be effectively allocated to a
//bookable room to perform a test.
//2. It refers to an assistant available to work in a specific time-slot. One assistant can only perform one test on one
//student at a time.
//3. The system can create an assistant on shift by identifying an assistant and a date (“dd/mm/yyyy”). The
//assistant is registered to shifts for the entire day (7 AM to 10 AM). Given the current 60-minute duration of a
//time-slot, when selecting a date, the system will be creating three assistant on shifts.
//4. The status of an assistant on shift depends on being allocated to a booking, therefore, its status can be:
//• FREE – when the assistant is available at a time-slot.
//• BUSY – when the assistant is booked for a test in a room.
//5. Only FREE assistants on shift can be removed from the system.
//6. Print template: | <dd/mm/yyyy HH:MM> | <status> | <assistant_email> |
public class AssistantOnShift {
    private String date;
    private String status;
    private Assistant assistant;

    public AssistantOnShift(String date, String status, Assistant assistant){
        this.date = date;
        this.status = status;
        this.assistant = assistant;
    }

    public String getStatus() {
        return status;
    }

    public String getDate() {
        return date;
    }

    public Assistant getAssistant() {
        return assistant;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setAssistant(Assistant assistant) {
        this.assistant = assistant;
    }

    @Override
    public String toString() {
        return "| " +
                date +
                " | " + status +
                " | " + assistant +
                " |";
    }
}
