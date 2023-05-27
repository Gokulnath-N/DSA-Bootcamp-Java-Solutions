import java.util.Scanner;

class EvenOrOdd{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to check even or odd: ");
        int checkNumber = input.nextInt();
        if(checkNumber % 2 == 0 ){
            System.out.println("Entered number is a even number");
        }else {
            System.out.println("Entered number ia  odd number.");
        }
    }
}