/*В данном участке кода можно применить принцип открытости/закрытости (Open/Closed Principle).
Вместо использования switch-case для определения оператора, можно создать отдельные классы для каждой математической операции,
которые реализуют интерфейс Operation, имеющий метод double performOperation(double num1, double num2).
Класс CalculatorModel будет оперировать не конкретными операторами, а объектами, реализующими этот интерфейс.
Таким образом, при добавлении новой операции необходимо будет только добавить новый класс,
реализующий интерфейс Operation, без изменения существующего кода.*/

public class CalculatorModel {
    public double performOperation(double num1, double num2, String operator) {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    throw new ArithmeticException("Can't divide by zero");
                }
            default:
                throw new IllegalArgumentException("Invalid operator");
        }
    }
}