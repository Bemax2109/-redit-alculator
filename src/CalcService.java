public class CalcService {
    public float calculate(long summ, byte term) {
        int degree;
        double rate = 9.99;
        float rateMonth = (float) (rate / 100 / 12);
        float degreeRes = (1 + rateMonth);
        double result = Math.pow(degreeRes, term);
        int payment = (int) (summ * ((rateMonth * result) / (result - 1)));
        return payment;
    }

}

