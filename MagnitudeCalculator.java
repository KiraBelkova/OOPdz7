public class MagnitudeCalculator extends ComplexNumberDecorator {
    public MagnitudeCalculator(ComplexNumber decoratedNumber) {
        super(decoratedNumber);
    }

    @Override
    public String getNumber() {
        return decoratedNumber.getNumber() + ", Magnitude: " + getMagnitude();
    }

    @Override
    public ComplexNumber add(ComplexNumber num) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public ComplexNumber multiply(ComplexNumber num) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'multiply'");
    }

    @Override
    public ComplexNumber divide(ComplexNumber num) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'divide'");
    }
}
