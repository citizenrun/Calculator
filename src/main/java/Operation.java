import java.util.ArrayList;

public final class Operation {

    public static double sum (ArrayList<Double> values){
        double result = 0;
        for(Double d : values)
            result += d;
        return result;
    }

    public static double substraction(ArrayList<Double> values){
        for (int i = 0; i<values.size(); ++i){
            double result = values.get(i)/values.get(i+1);
        }
return 0;
    }
    public static double multiplication(ArrayList<Double> values){
        double result = 1;
        for(Double d : values)
            result *= d;
        return result;
    }
    public static double division(ArrayList<Double> values){
        double result = 1;
        for(Double d : values)
            result *= d;
        return result;
    }
}
