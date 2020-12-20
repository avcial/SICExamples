import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {
        SampleProgram sp = new CalculatorWithArray();
        sp = new StarPrinter();
        sp = new  InheritanceSample();
        sp.Run();

    }


    public void Run() throws ParseException {

        Employee em = new Employee();


        if (true)
            return;

        Person p1 = new Person();
        p1.Yasi = 5;
        Person p2 = new Person();
        p2.Yasi = 6;

        p1 = p2;


        p2.Yasi = 7;


        System.out.println("p1.Yasi = " + p1.Yasi);
        System.out.println("p2.Yasi = " + p2.Yasi);


        int x = 5;
        int y = x;

        y = 6;
        System.out.println("y = " + y);
        System.out.println("x = " + x);


        Person p = new Person();

        ArrayList<Person> personList = new ArrayList<>();

        while (true) {
            System.out.println("İşlem yapmak istediğiniz tipi seçiniz");
            System.out.println("Customer : c ");
            System.out.println("Employee : e ");
            System.out.println("List : l ");
            System.out.println("Çıkmak için : x ");

            Scanner s = new Scanner(System.in);
            String type = s.next();

            if (type.equals("x")) {
                break;
            }
            switch (type) {
                case "c":
                    Customer c = new Customer();
                    System.out.println("Ad: ");
                    c.Name = s.next();
                    System.out.println("Soyad : ");
                    c.LastName = s.next();
                    personList.add(c);
                    //custoemr kaydet
                    break;
                case "e":

                    Employee e = new Employee();
                    System.out.println("Ad: ");
                    e.Name = s.next();
                    System.out.println("Soyad : ");
                    e.LastName = s.next();

                    System.out.println("Baslangic Tarihi (dd/MM/yyyy) : ");
                    String sDate = s.next();
                    e.StartDate = new SimpleDateFormat("dd/MM/yyyy").parse(sDate);
                    personList.add(e);
                    // employee kaydet
                    break;
                case "l":
                    listPerson(personList);
                    break;
                default:
                    //yanlış girdiniz
                    System.out.println("Yanlış bir işlem tipi girdiniz.  ( İşlem tipi = " + type + " bulunamadı ) Tekrar deneyiniz.");
                    s.next();
                    break;
            }
        }

//        Person p = new Person();
//        p.Name = "Ali Mert";
//        p.LastName = "Avcı";
//
//
//        Employee e = new Employee();
//        e.Name = "Aslı";
//        e.LastName = "Aykan";
//
//        Customer c = new Customer();
//        c.Name = "Atahan";
//        c.LastName = "Kalaycı";
//
//
//        System.out.println("Kişi : " + p.getFullName());
//        System.out.println("Çalışan : " + e.getFullName());
//        System.out.println("Müşteri : " + c.getFullName());
    }

    private void listPerson(ArrayList<Person> personList) {
        for (Person p :
                personList) {
            System.out.println(p.getDetail());
        }
    }
}
