public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double growth = 1.79;
        double weight = 69;
        double bodyMassIndex = service.calculate(weight, growth);
        System.out.printf("%.2f", bodyMassIndex);
    }
}
