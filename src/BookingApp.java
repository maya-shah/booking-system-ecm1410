public class BookingApp {
    private University uni;
    //private BookingSystem bS;

    public static void main(String args[]){
        University uni = new University();
        uni.addAssistant(new Assistant("Priya","123@uok.ac.uk"));
        uni.addAssistant(new Assistant("Jenni","331@uok.ac.uk"));
        uni.addAssistant(new Assistant("Tom","981@uok.ac.uk"));
        uni.addAssistant(new Assistant("Lisa","412@uok.ac.uk"));
        uni.addRoom(new Room("H1",2));
        uni.addRoom(new Room("H4",3));
        uni.addRoom(new Room("H8",4));

        System.out.println(uni.toString());
        BookingApp bA = new BookingApp(uni);

       // bA.setUni();

    }

    public BookingApp(University uni){
        this.uni = uni;
    }

    public University getUni() {
        return uni;
    }

    public void setUni(University uni) {
        this.uni = uni;
    }
}
