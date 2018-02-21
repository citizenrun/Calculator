public final class Operation {

    public static double sum (double a, double b){
        return a + b;
    }

    public static double substraction(double a, double b){
        return a - b;
    }
    public static double multiplication(double[]values){
        double result=1;
        for(double value : values) {
            result *= value;
        }
        return result;
    }
    public static double divsion(double a, double b){
        return a / b;
    }
}
