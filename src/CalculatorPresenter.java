// Presenter
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
