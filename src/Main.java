public class Main {
    public static void main(String[] args) {
        BmiService service= new BmiService();
        int weight = 52;
        double height = 1.60;
        double bmi = service.calculate(weight, height);
        System.out.println("Индекс массы тела:" + bmi);
    }
}