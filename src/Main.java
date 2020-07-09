public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        float yourBmi = service.calculate(1.85F, 94.850F);
        System.out.println(yourBmi);

        float yourBmi2 = service.calculate(1.66F, 108F);
        System.out.println(yourBmi2);

        float yourBmi3 = service.calculate(2.24F, 135.980F);
        System.out.println(yourBmi3);

        float yourBmi4 = service.calculate(1.55F, 47.670F);
        System.out.println(yourBmi4);
    }
}
