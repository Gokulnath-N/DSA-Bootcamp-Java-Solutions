import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float principle,time, rate, totalAmount;
        System.out.print("Enter the principle amount: ");
        principle = input.nextFloat();
        System.out.print("Enter the rate: ");
        rate = input.nextFloat();
        System.out.println("Enter the time: ");
        time = input.nextFloat();
        totalAmount= (principle*time*rate) /100;
        System.out.println("Simple interest is "+ totalAmount);
    }
}
