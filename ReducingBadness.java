
import java.util.*;

public class ReducingBadness {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        int j;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'W') {
                j = 1;
                while (j < arr.length) {
                    if (arr[j] != 'W') {
                        arr[i] = arr[j];
                        break;
                    }
                    j++;
                }
            } else if (arr[i] == 'W') {
                arr[i] = arr[i - 1];
            }
        }
        int badness = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                badness++;
            }
        }
        System.out.println(badness);
        sc.close();
    }
}
