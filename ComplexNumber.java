public interface ComplexNumber {
    String getNumber();  // метод для получения числа в виде строки
    ComplexNumber add(ComplexNumber num);  // метод для сложения комплексных чисел
    ComplexNumber multiply(ComplexNumber num);  // метод для умножения комплексных чисел
    ComplexNumber divide(ComplexNumber num);  // метод для деления комплексных чисел
}
