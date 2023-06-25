import java.util.*;
class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        for(int i=n1; i<=n2; i++)
        {
            int c=i,rem,sum=0;
            while(c!=0)
            {
                rem = c%10;
                sum = sum + (rem*rem*rem);
                c /=10;
            }
            if(sum == i)
            {
                System.out.print(i + " " + "is an armstrong number");
            }
        }
    }
}
