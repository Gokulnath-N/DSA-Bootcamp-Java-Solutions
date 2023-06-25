import java.util.*;
class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next(), revStr = "";
        str = str.toLowerCase();
        for(int i= str.length()-1 ;i>=0;i--)
        {
            revStr = revStr + str.charAt(i);
        }
        if(str.equals(revStr))
        {
            System.out.println("Given string is palindrome");
        }
        else
        {
            System.out.println("Not a palindrome");
        }
    }
}
