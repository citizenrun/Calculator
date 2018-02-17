import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println("Type first number");
        Scanner str = new Scanner(System.in);
        int a = 0;
        int b = 0;
        boolean isNumber;
        do {
            if (str.hasNextInt()) {
                a = str.nextInt();
                System.out.println("Type second number");}

            if (str.hasNextInt()) {
                b = str.nextInt();
                isNumber = true;
            } else {
                System.out.println("Type number");
                isNumber = false;
                str.next();
            }
        } while (!(isNumber));

        System.out.println("Thank you!");

        System.out.println("Select operation type: sum, sub, mult, div");
        String operationType;
        boolean isOperation;
        if (str.hasNext()) {
            operationType = str.next();
            do {
                if (operationType.equals("sum")) {
                    int sum = Operation.sum(a, b);
                    System.out.println(sum);
                    isOperation=true;
                }
                else if (operationType.equals("sub")) {
                    int sub = Operation.sub(a, b);
                    System.out.println(sub);
                    isOperation = true;
                }
                else if (operationType.equals("mult")) {
                    int mult = Operation.mult(a, b);
                    System.out.println(mult);
                    isOperation = true;
                }
                else if (operationType.equals("div")) {
                    int div = Operation.div(a, b);
                    System.out.println(div);
                    isOperation = true;
                } else {
                    isOperation = false;
                    System.out.println("Select correct operation");
                }

            } while (!(isOperation));
        }
    }
}