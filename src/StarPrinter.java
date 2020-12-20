import java.util.Scanner;

public class StarPrinter extends SampleProgram {
    public void Run() {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int det = num < 5 ? 1 : -1;
        int limit;
        if (num < 5)
            limit = 6;
        else limit = 4;
        while (num != limit) {
            int cnt = num;
            while (cnt > 0) {
                cnt--;
                System.out.print("*");
            }
            System.out.println();
            num += det;
        }
    }
}
