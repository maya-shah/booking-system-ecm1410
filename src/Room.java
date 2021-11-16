//1. The university has several rooms, and some of the rooms can be allocated to apply COVID tests.
//2. A room must have a string code (e.g., IC215) and a capacity.
//3. The code is used to identify the room and, therefore, must be unique.
//4. The capacity must be an integer value greater than zero. It represents the number of concurrent assistants that
//can be safely allocated in the room to perform tests.
//5. Print template: | <code> | capacity: <capacity> |

public class Room {
//getters, setters, constructors
    private String code;
    private int capacity;
    public Room(String code, int capacity){
        this.code = code;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getCode() {
        return code;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "| " +
                code +
                " | capacity: " + capacity +
                " |";
    }
}
