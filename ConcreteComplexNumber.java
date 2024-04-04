public class ConcreteComplexNumber implements ComplexNumber {
    private double real;
    private double imaginary;

    public ConcreteComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    @Override
    public String getNumber() {
        return real + " + " + imaginary + "i";
    }

    @Override
    public ComplexNumber add(ComplexNumber num) {
        ConcreteComplexNumber number = (ConcreteComplexNumber) num;
        return new ConcreteComplexNumber(this.real + number.real, this.imaginary + number.imaginary);
    }

    @Override
    public ComplexNumber multiply(ComplexNumber num) {
        ConcreteComplexNumber number = (ConcreteComplexNumber) num;
        double newReal = this.real * number.real - this.imaginary * number.imaginary;
        double newImaginary = this.real * number.imaginary + this.imaginary * number.real;
        return new ConcreteComplexNumber(newReal, newImaginary);
    }

@Override
    public ComplexNumber divide(ComplexNumber num) {
        ConcreteComplexNumber number = (ConcreteComplexNumber) num;
        double divisor = Math.pow(number.real, 2) + Math.pow(number.imaginary, 2);
        double newReal = (this.real * number.real + this.imaginary * number.imaginary) / divisor;
        double newImaginary = (this.imaginary * number.real - this.real * number.imaginary) / divisor;
        return new ConcreteComplexNumber(newReal, newImaginary);
    }
}
