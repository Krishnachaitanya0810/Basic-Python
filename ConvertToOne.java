
import java.util.Scanner;

public class ConvertToOne {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 4) {
            if (n % 2 == 0) {
                System.out.println("Number of operations: 2");
            } else {
                System.out.println("Number of operations: 3");
            }
        } else {
            System.out.println(n - 1);
        }
        sc.close();
    }
}
