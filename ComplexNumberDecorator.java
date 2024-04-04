public abstract class ComplexNumberDecorator implements ComplexNumber {
    protected ComplexNumber decoratedNumber;

    public ComplexNumberDecorator(ComplexNumber decoratedNumber) {
        this.decoratedNumber = decoratedNumber;
    }

    @Override
    public String getNumber() {
        return decoratedNumber.getNumber();
    }

    // метод для вычисления модуля комплексного числа
    public double getMagnitude() {
        double real = Double.parseDouble(decoratedNumber.getNumber().split("\\s+")[0]);
        double imaginary = Double.parseDouble(decoratedNumber.getNumber().split("\\s+")[2].replace("i", ""));
        return Math.sqrt(real * real + imaginary * imaginary);
    }
}
