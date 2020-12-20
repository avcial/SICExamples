import java.util.Date;

public class Person {




    public Person() {
        System.out.println("Person ctr");
    }

    public int Yasi;
    public String Name;
    public String LastName;

    public String getFullName() {
        return Name + " - " + LastName;
    }

    public String getDetail() {
        return getFullName();
    }
}

