// Q. infix

import java.util.*;

public class ExpressionEvaluation {

    public static double eval(double a, double b, char c) {
        switch (c) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b != 0) {
                    return a / b;
                }
            case '^':
                return Math.pow(a, b);
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> o = new Stack<>();
        Stack<Double> n = new Stack<>();
        String operators = "^/*+-";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*' || s.charAt(i) == '/' || s.charAt(i) == '^') {
                o.push(s.charAt(i));
                if (o.size() > 1) {
                    int c = operators.indexOf(String.valueOf(o.peek()));
                    if (c > operators.indexOf(String.valueOf(o.get(o.size() - 2)))) {
                        char op1 = o.pop();
                        char op2 = o.pop();
                        double num1 = n.pop();
                        double num2 = n.pop();
                        n.push(eval(num2, num1, op2));
                        o.push(op1);
                    }
                }
            } else {
                n.push(Double.valueOf(String.valueOf(s.charAt(i))));
            }
            if (i == s.length() - 1) {
                ListIterator<Character> iterator = o.listIterator(o.size());
                while (iterator.hasPrevious()) {
                    char c = iterator.previous();
                    double num1 = n.pop();
                    double num2 = n.pop();
                    n.push(eval(num2, num1, c));
                }
            }
        }
        System.out.println(n.get(0));
    }
}
