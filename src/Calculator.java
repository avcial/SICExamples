import java.util.StringTokenizer;
import java.util.Scanner;

public class Calculator extends SampleProgram {
    public  void  Run(){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        StringTokenizer st = new StringTokenizer(str," :");
        String name = st.nextToken() + " " +st.nextToken();
        String subject = st.nextToken();
        String grade = st.nextToken();
        System.out.println("Name : " + name);
        System.out.println("Subject : " + subject);
        System.out.println("Grade : " + grade);

    }
}
