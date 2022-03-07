import java.util.Scanner;
public class Reversenum{
    public static void main(String args[]){
        int num,reverse=0,rem;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        num=sc.nextInt();
        while(num>0){
            rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        System.out.println("Sum of digits of given number: "+sum);
        }
}