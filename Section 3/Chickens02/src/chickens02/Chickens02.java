
package chickens02;

public class Chickens02 {
    public static void main(String[] args) {
        int a = 100;
        int b = 121;
        int c = 117;
        int total;
        double dailyAverage, monthlyAverage, monthlyProfit;

        total = a + b + c;
        dailyAverage = total / 3;
        monthlyAverage = (total * 30) / 3;
        monthlyProfit = monthlyAverage * 0.18;
        System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);
    }
    
}
