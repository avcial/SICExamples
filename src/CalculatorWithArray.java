import java.util.Scanner;
import java.util.StringTokenizer;

public class CalculatorWithArray extends SampleProgram {
    public void Run() {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        StringTokenizer st = new StringTokenizer(str, " :,");
        String name = st.nextToken() + " " + st.nextToken();
        String subject1 = st.nextToken();
        String grade1 = st.nextToken();
        String subject2 = st.nextToken();
        String grade2 = st.nextToken();

        personScore a = new personScore(name, subject1, grade1, subject2, grade2);
        a.display();
    }

    private class personScore {
        // Instance variables
        String name;
        String subject[] = new String[2];
        String score[] = new String[2]; // score
        int sum;

        personScore(String name, String sub1, String score1, String sub2, String score2) {
            this.name = name;
            this.subject[0] = sub1;
            this.subject[1] = sub2;
            this.score[0] = score1;
            this.score[1] = score2;
            this.sum = Integer.parseInt(score1) + Integer.parseInt(score2);
        }

        void display() {
            System.out.println("\tName : " + name);
            System.out.println("----------------------------------------");
            System.out.println("\tSubject\t\tScore");
            System.out.println("----------------------------------------");
            for (int a = 0; a < subject.length; a++) {
                System.out.print("\t " + subject[a] + "\t");
                System.out.println("\t " + score[a]);
            }
            System.out.println("----------------------------------------");
            System.out.println("\tTotal : " + sum);
            System.out.println("----------------------------------------");
        }

    }
}
