import java.lang.Double;

public class QuadraticEquationResult {

    private Double positiveValue;
    private Double negativeValue;

    public QuadraticEquationResult(Double positiveValue, Double negativeValue) {
        this.positiveValue = positiveValue;
        this.negativeValue = negativeValue;
    }

    public Double getPositiveValue() {
        return positiveValue;
    }

    public void setPositiveValue(Double positiveValue) {
        this.positiveValue = positiveValue;
    }

    public Double getNegativeValue() {
        return negativeValue;
    }

    public void setNegativeValue(Double negativeValue) {
        this.negativeValue = negativeValue;
    }
}
