package functions;

public class Tax {
    public static float calculatorTax(float salary) {
        if (salary <= 2000) {
            return 0;
        } else if (salary > 2000 && salary <= 3500) {
            return (float) (salary * 0.15);
        } else if (salary >3500 && salary <= 5000) {
            return (float) (salary * 0.22);
        } else {
            return (float) (salary * 0.30);
        }
    }
}
