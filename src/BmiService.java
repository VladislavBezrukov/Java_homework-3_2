public class BmiService {
    public double calculate(double weight, double growth) {
        double bodyMassIndex = weight / square(growth);

        return bodyMassIndex;
    }

    static double square(double growth) {
        double result = growth * growth;
        return result;
    }
}
