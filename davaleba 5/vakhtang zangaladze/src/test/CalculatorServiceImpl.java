package test;

public class CalculatorServiceImpl {
    public int a;
    public int b;

    public int sum(int a, int b) {
        System.out.println("CalculatorService - add " + a + " and " + b);
        return a + b;
    }

    public int prod(int a) {
        System.out.println("ICalculator - sum " + a);
        int sum = 0;
        while (0 != a) {
            sum = sum + (a % 10);
            a = a / 10;
        }
        return sum;

    }

}