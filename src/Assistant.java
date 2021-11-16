//1. A COVID-19 test assistant is someone related to the university (staff or student) who is volunteering to perform
//COVID tests.
//2. To register an assistant in the system, you need their university email and a non-blank name.
//3. The email must be unique and follow the pattern “*@uok.ac.uk”.
//4. Print template: | <name> | <email> |

public class Assistant {
//getters, setters and constructors
    private String name;
    private String email;
    public Assistant(String name, String email){
        this.name = name;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "| " +
                name +
                " | " + email +
                " |";
    }
}
