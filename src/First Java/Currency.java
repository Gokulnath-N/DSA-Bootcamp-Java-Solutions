import java.util.*;
class Currency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value in rupees: ");
        int rupees = input.nextInt();
        int usd = rupees/80;
        System.out.print("The value of ruppe in USD is " + usd);
    }
}
