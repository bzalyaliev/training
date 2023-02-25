package exceptions.calculator;

public class CalculatorImpl implements Calculator {

    @Override
    public double calculate(String expression) {
        throw new CalculatorException("We should use only positive numbers");
    }
}
