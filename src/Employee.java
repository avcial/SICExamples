import java.util.Date;

public class Employee extends Customer {
    public Date StartDate;

    public Employee() {
//        super();
        System.out.println("Employee ctr");
    }

    @Override
    public String toString() {
        return this.StartDate.toString();
    }

    @Override
    public String getDetail() {

        return super.getDetail() + "Baslangic Tarihi : " + this.toString();
    }
}
