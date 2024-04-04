public class ComplexNumberAdapter implements ComplexNumber {
    private ComplexNumber num1;
    private ComplexNumber num2;

    public ComplexNumberAdapter(ComplexNumber num1, ComplexNumber num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
@Override
    public String getNumber() {
        double real = Double.parseDouble(num1.getNumber().split("\\s+")[0]) - Double.parseDouble(num2.getNumber().split("\\s+")[0]);
        double imaginary = Double.parseDouble(num1.getNumber().split("\\s+")[2].replace("i", "")) - Double.parseDouble(num2.getNumber().split("\\s+")[2].replace("i", ""));
        return real + " + " + imaginary + "i";
    }

    @Override
    public ComplexNumber add(ComplexNumber num) {
        return null; // Не используется для вычитания
    }
@Override
    public ComplexNumber multiply(ComplexNumber num) {
        return null; // Не используется для вычитания
    }

    @Override
    public ComplexNumber divide(ComplexNumber num) {
        return null; // Не используется для вычитания
    }
}
