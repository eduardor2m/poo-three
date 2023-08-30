package functions;

public class CalculateVector {
    public static float calculateVector(float[] values) {
        float sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum;
    }
}
