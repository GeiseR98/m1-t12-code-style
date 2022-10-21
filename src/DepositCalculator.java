import java.util.Scanner;

    public class DepositCalculator {

    double calculateComplexPercent(double amount, double yearRate, int depositPeriod) {
        double pay = amount * Math.pow((1 + yearRate / 12), 12 * depositPeriod);
        return valuePlaces(pay, 2);
    }

    double calculateSimplePercent(double amount, double yearRate, int depositPeriod) {
        return valuePlaces(amount + amount * yearRate * depositPeriod, 2);
    }

    double valuePlaces(double value, int places) {  // беда с english, назовем как видим :-)
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }

    void doImportantJob() {
        int period;
        int action;
            Scanner depositAmount = new Scanner(System.in);
            System.out.println("Введите сумму вклада в рублях:");
        int amount = depositAmount.nextInt();
            System.out.println("Введите срок вклада в годах:") ;
            period = depositAmount.nextInt( );
            System.out.println   ("Выберите тип вклада, 1 - вклад с обычным процентом, 2 - вклад с капитализацией:");
            action = depositAmount.nextInt();
        double outDoubleVar = 0;
            if (action ==1) {
                outDoubleVar = calculateSimplePercent(amount, 0.06, period);
        } else if (action == 2) {
                outDoubleVar = calculateComplexPercent(amount, 0.06, period);
        }
            System.out.println("Результат вклада: " + amount + " за " + period + " лет превратятся в " + outDoubleVar);
    }

    public static void main(String[] args) {
        new DepositCalculator().doImportantJob();
    }
}
