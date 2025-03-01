
import java.util.*;

class iare {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 2;
        while (true) {
            float num = (n - (k - 1) * k / 2);
            float val = num / k;
            if (val <= 0) {
                break;
            }
            if (val - (int) val == 0) {
                for (int i = 0; i < k; i++) {
                    System.out.print((int) val + i + " ");
                }
                System.out.println();
            }
            k += 1;
        }
    }
}
// import java.util.*;

// public class KO {
//   public static void main(String[] args) {
//     int n = 30;
//     Queue<Integer> q = new LinkedList<>();
//     for(int i = 1;i<n;i++){
//       q.add(i);
//     }
//     LinkedList<LinkedList<Integer>> a = new LinkedList<>();
//     while(!q.isEmpty()){
//       LinkedList<Integer> b = new LinkedList<>();
//       int s = 0;
//       for(int i:q){
//         s+=i;
//         b.add(i);
//         if(s==n){
//           a.add(b);
//           break;
//         }
//         }
//       q.poll();
//     }
//     for(LinkedList<Integer> i:a){
//       System.out.println(i);
//     }
//   }
// }
