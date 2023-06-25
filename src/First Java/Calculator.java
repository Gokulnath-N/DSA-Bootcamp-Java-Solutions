import java.util.*;
class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNum = input.nextInt();
        System.out.print("Enter the second number: ");
        int secondNum = input.nextInt();
        System.out.print("Enter the operator: ");
        char op = input.next().charAt(0);
        if(op == '+'){
            System.out.println(firstNum + secondNum);
        }
        else if (op == '-')
        {
            System.out.println(firstNum - secondNum);
        }
        else if(op == '*')
        {
           System.out.println(firstNum * secondNum); 
        }
        else if(op == '/')
        {
            System.out.println(firstNum/secondNum);
        }else{System.out.println("Enter a valid operator");}
    }
}
