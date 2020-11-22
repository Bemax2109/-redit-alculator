public class Main {
    public static void main(String[] args) {
        CalcService service = new CalcService();
        int payment = (int) service.calculate(1_000_000, (byte) 12);
        System.out.println(payment);
        int payment1 = (int) service.calculate(1_000_000, (byte) 24);
        System.out.println(payment1);
        int payment2 = (int) service.calculate(1_000_000, (byte) 36);
        System.out.println(payment2);

    }
}