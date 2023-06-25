import java.util.*;
class Greater {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNum = input.nextInt();
        System.out.print("Enter the second number: ");
        int secondNum = input.nextInt();
        if(firstNum == secondNum)
        {
            System.out.print("Both are equal");
        }
        else if(firstNum > secondNum)
        {
            System.out.print("First Number is greater than second number");
        }
        else if(firstNum < secondNum)
        {
            System.out.println("Second number is greater than first number");
        }else{System.out.print("Enter a valid number");}
    }
}
