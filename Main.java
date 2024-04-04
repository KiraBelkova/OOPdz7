public class Main {
    public static void main(String[] args) {
        ConcreteComplexNumber num1 = new ConcreteComplexNumber(2, 3);
        ConcreteComplexNumber num2 = new ConcreteComplexNumber(1, 2);

        Logger logger = new ConsoleLogger();
        ComplexCalculator calculator = new ComplexCalculator(logger);

        ComplexNumber resultAdd = calculator.add(num1, num2);
        ComplexNumber resultMultiply = calculator.multiply(num1, num2);
        ComplexNumber resultDivide = calculator.divide(num1, num2);
    }
}
