
import java.util.ArrayList;

public class Name {

    private String name = " ";
    private String email = " ";

    private Education education;
    private Experience experience;
    private Skills skills;

    public Name() {

    }

    public Name(String name, String email) {
        this.name = name;
        this.email = email;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
