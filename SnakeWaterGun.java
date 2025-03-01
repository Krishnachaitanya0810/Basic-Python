
import java.util.*;

class SnakeWaterGun {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        LinkedList<String> a = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 's') {
                a.add(s.substring(i, i + 5));
                i += 4;
            } else if (s.charAt(i) == 'w') {
                a.add(s.substring(i, i + 5));
                i += 4;
            } else if (s.charAt(i) == 'g') {
                a.add(s.substring(i, i + 3));
                i += 2;
            }
        }
        // System.out.println(a);
        int count = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).equals("gun") && a.get(i + 1).equals("snake")) {
                count++;
            } else if (a.get(i).equals("snake") && a.get(i + 1).equals("water")) {
                count++;
            } else if (a.get(i).equals("water") && a.get(i + 1).equals("gun")) {
                count++;
            }
            i++;
        }
        System.out.println("Player 1 has won " + count + " times");
        sc.close();
    }
}
