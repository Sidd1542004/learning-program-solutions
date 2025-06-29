import java.util.Scanner;

public class NumberChecker{
    public static String checkSign(int number){
        if(number>0) return "Positive";
        else if(number<0) return "Negative";
        else return "Zero";
    }
    public static String checkEvenOdd(int number){
        return (number%2==0)?"Even":"Odd";
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number=scanner.nextInt();

        System.out.println("The number is"+checkSign(number)+".");
        System.out.println("The number is"+checkEvenOdd(number)+".");
    }
}
