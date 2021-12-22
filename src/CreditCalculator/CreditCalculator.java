package CreditCalculator;

public class CreditCalculator {
    public static double Dprincipal = 0, Dperiods = 0, Dinterest = 0;

    public static void main(String[] args) {
        try{
            String mode = args[0];
            Dprincipal = Double.parseDouble(args[1]);
            Dperiods = Double.parseDouble(args[2]);
            Dinterest = Double.parseDouble(args[3]);

            if(mode.equals("diff")){
                int overPayment = 0;
                for (int m = 1; m <= Dperiods; m++) {
                    int D = absoluteMonth(differentiatedPayment(Dprincipal, Dperiods, Dinterest, m));
                    System.out.println("Month " + m + ": payment is " + D);
                    overPayment += D;
                }
                System.out.println("Overpayment = " + (int)(overPayment - Dprincipal));
            }
            else if(mode.equals("annuity")){
                int A = absoluteMonth(annualPayment(Dprincipal, Dperiods, Dinterest));
                System.out.println("Your monthly payment = " + A + "! ");
            }
        }
        catch (Exception ex){
            System.out.println("Incorrect parameters ");
        }
    }

    private static double annualPayment(double P, double n, double i){
        i = procent(i);
        return (P * ((i * Math.pow(1 + i, n)) / (Math.pow(1 + i, n) - 1)));
    }
    private static double differentiatedPayment(double P, double n, double i, double m){
        i = procent(i);
        return (P / n) + (i * (P - ((P * (m - 1)) / n)));
    }

    private static double procent(double value){
        return (value / (1200));
    }

    private static int absoluteMonth(double month){
        return (month - (int)month) > 0.0? (int)month + 1: (int)month;
    }
}
