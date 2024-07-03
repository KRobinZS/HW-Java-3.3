public class CreditPaymentService {
    public int calculate(int numberOfMonths) {
        int monthlyPayment;
        monthlyPayment = (int) (1_000_000 * (0.008325 + (0.008325 / (Math.pow(1 + 0.008325, numberOfMonths) - 1))));
        return monthlyPayment;
    }
}
