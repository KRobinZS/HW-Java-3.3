public class CreditPaymentService {
    public int calculate(int years, int loanAmout, double percent) {
        int numberOfMonths;
        numberOfMonths = years * 12;
        double percentM;
        percentM = percent / 12 / 100;
        int monthlyPayment;
        monthlyPayment = (int) (loanAmout * (percentM + (percentM / (Math.pow(1 + percentM, numberOfMonths) - 1))));
        return monthlyPayment;
    }
}
