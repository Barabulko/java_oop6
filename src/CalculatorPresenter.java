// Presenter
/*Презентер в этом участке кода выполняет свою основную функцию и просто связывает модель с представлением.
Он может быть проконтролирован с использованием Mockito для тестирования.
Принципу единственности ответственности (Single Responsibility Principle) следует то,
что презентер занимается только координацией действий,
не выполняя математических операций или отображения результатов.*/

public class CalculatorPresenter {
    private CalculatorView view;
    private CalculatorModel model;

    public CalculatorPresenter(CalculatorView view, CalculatorModel model) {
        this.view = view;
        this.model = model;
    }

    public void calculate(double num1, double num2, String operator) {
        double result = model.performOperation(num1, num2, operator);
        view.showResult(result);
    }
}
