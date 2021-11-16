import java.util.ArrayList;

//1. The University has a list of assistants and a list of rooms.
//2. You should implement functions to add, both assistants and rooms.
//3. Due to time constraints, you don’t need to develop screen to manage the university resources, but you need to
//pre-load the system with instances of rooms and assistants.
public class University {
    //hardcode university
    //room object and assistant object and have a a list of objects

    //array list of both rooms and assistants

    private ArrayList<Assistant> a = new ArrayList<>();
    private ArrayList<Room> r = new ArrayList<>();

    public void addAssistant(Assistant assistant){
        a.add(assistant);
    }

    public void addRoom(Room room){
        r.add(room);
    }

    public ArrayList<Assistant> getA() {
        return a;
    }

    public ArrayList<Room> getR() {
        return r;
    }

    public void setA(ArrayList<Assistant> a) {
        this.a = a;
    }

    public void setR(ArrayList<Room> r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "University{" +
                "a=" + a +
                ", r=" + r +
                '}';
    }
}
