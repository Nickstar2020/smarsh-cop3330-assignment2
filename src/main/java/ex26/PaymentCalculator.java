package ex26;

import static java.lang.Math.log;

public class PaymentCalculator {
    public static double calculateMonthsUntilPaidOff(double b, double i, double p ) {

        //APR
        i = (i/100) / 365;

        //math for complex part
        double complex = (1 - Math.pow((1 + i), 30));

        double answer = Math.ceil(-(0.03333333) * (log(1 + (b/p) * (complex))) / (log(1 + i)));


       return answer;
    }
}
