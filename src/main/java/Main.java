import java.io.IOException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println("Type first number");
        Scanner str = new Scanner(System.in);
        double a = 0;
        double b = 0;
        boolean isNumber;
        do {
            if (str.hasNextDouble()) {
                a = str.nextDouble();
                System.out.println("Type second number");}

            if (str.hasNextDouble()) {
                b = str.nextDouble();
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
                    double sum = Operation.sum(a, b);
                    System.out.println(sum);
                    isOperation=true;
                }
                else if (operationType.equals("sub")) {
                    double sub = Operation.sub(a, b);
                    System.out.println(sub);
                    isOperation = true;
                }
                else if (operationType.equals("mult")) {
                    double mult = Operation.mult(a, b);
                    System.out.println(mult);
                    isOperation = true;
                }
                else if (operationType.equals("div")) {
                    double div = Operation.div(a, b);
                    System.out.println(div);
                    isOperation = true;
                } else {
                    isOperation = false;
                    System.out.println("Select correct operation");
                    str.next();
                }


            } while (!(isOperation));
        }
    }
}