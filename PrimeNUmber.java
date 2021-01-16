import java.util.Scanner;
public class PrimeNUmber {
    public static void main(String[] args) {
        int n;
        int count=0;
        Scanner sc=new Scanner(System.in);//Scanning initiates through this
        System.out.println("Enter a number to check whether it is prime or not: ");
        n=sc.nextInt();//scan of the number
        for(int i=1;i<=n;i++)//initiating loop till the number
        {
            if(n%i==0)//checking if the number is divisible by the loop variable i
            {
                count++;
            }
        }
        if(count==2)//asking if the count is 2 because this will mean that the number is divisible by 1 and itself
        {
            System.out.println(n+" is a prime number");
        }
        else{
            System.out.println(n+" is not a prime number");
        }/**Second Method(if you understand this please mail me what it is)
        int i;
        int j=2;
        int ch=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number: ");
        i=sc.nextInt();
        //check for 1
        if(i<=1)
            ch=1;
        while(j<=i/2)
        {
            if(i%j==0)
            {
                ch=1;
                break;
            }
            else
            {
                j++;
            }
        }
        if(ch==0)
        {
            System.out.println(i+" is prime number");
        }
        else
        {
            System.out.println(i+" is not a prime number");
        } */

    }
}
