public class ComplexCalculator {
    private Logger logger;

    public ComplexCalculator(Logger logger) {
        this.logger = logger;
    }

    public ComplexNumber add(ComplexNumber num1, ComplexNumber num2) {
        ComplexNumber result = num1.add(num2);
        logger.log("Addition: " + num1.getNumber() + " + " + num2.getNumber() + " = " + result.getNumber());
        return result;
    }

    public ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2) {
        ComplexNumber result = num1.multiply(num2);
        logger.log("Multiplication: " + num1.getNumber() + " * " + num2.getNumber() + " = " + result.getNumber());
        return result;
    }

    public ComplexNumber divide(ComplexNumber num1, ComplexNumber num2) {
        ComplexNumber result = num1.divide(num2);
        logger.log("Division: " + num1.getNumber() + " / " + num2.getNumber() + " = " + result.getNumber());
        return result;
    }
}
