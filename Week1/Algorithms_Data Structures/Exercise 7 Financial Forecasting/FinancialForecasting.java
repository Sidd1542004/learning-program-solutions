import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class FinancialProjection{
    public static double futureValueRecursive(double principal,double rate,int years){
        if(years==0) return principal;
        return futureValueRecursive(principal,rate,years-1)*(1+rate);
    }

    public static double futureValueIterative(double principal,double rate,int years){
        double total=principal;
        for(int i=1;i<=years;i++){
            total*=(1+rate);
        }
        return total;
    }
    public static String formatMoney(double amount){
      Locale indianLocale=Locale.forLanguageTag("en-IN");
        return NumberFormat.getCurrencyInstance(indianLocale).format(amount);
    }

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Initial Investment Amount: ");
        double principal=input.nextDouble();

        System.out.print("Annual Interest Rate (%): ");
        double ratePercent=input.nextDouble();
        double rate=ratePercent/100.0;

        System.out.print("Investment Duration (in years): ");
        int years=input.nextInt();

        double resultRecursive=futureValueRecursive(principal,rate,years);
        double resultIterative=futureValueIterative(principal,rate,years);

        System.out.printf("\nProjected Amount (Recursive) after %d years: %s\n",years, formatMoney(resultRecursive));
        System.out.printf("Projected Amount (Iterative) after %d years: %s\n",years, formatMoney(resultIterative));
    }
}
