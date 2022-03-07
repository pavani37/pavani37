import java.util.Scanner;
public class Numreverse{
    public static void main(String args[]){
        int num,reverse=0,rem;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        num=sc.nextInt();
        while(num!=0){
            rem=num%10;
            reverse=reverse*10+rem;
            num/=10;
        }
        System.out.print("Reversed number: "+reverse);
        
        }
}