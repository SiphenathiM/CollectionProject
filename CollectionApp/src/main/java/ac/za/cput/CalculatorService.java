package ac.za.cput;

public class CalculatorService implements CalculatorInterface {

    @Override
    public int multiply(int a, int b) {
        return a*b;
    }
}
