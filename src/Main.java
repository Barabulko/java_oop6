// Main
import java.util.Scanner;
public class Main {

    public static Double getUserNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        Double input = scanner.nextDouble();
        return input;
    }

    public static String getUserOperation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите операцию: ");
        String input = scanner.nextLine();
        return input;
    }

    public static void main(String[] args) {
        CalculatorView view = new CalculatorView() {
            @Override
            public void showResult(double result) {
                System.out.printf("Result: %2.3f",result);
            }
        };
        CalculatorModel model = new CalculatorModel();
        CalculatorPresenter presenter = new CalculatorPresenter(view, model);

//        double num1 = 10.5;
        double num1 = getUserNumber();
//        double num2 = 5.3;
        double num2 = getUserNumber();
//        String operator = "+";
        String operator = getUserOperation();
        presenter.calculate(num1, num2, operator);
    }
}
