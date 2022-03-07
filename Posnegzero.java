import java.util.Scanner;
public class Posnegzero{
    public  static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        n=sc.nextInt();
        if(n>0)
        System.out.println("The given number is positive: +positive");
        else if(n<0)
        System.out.println("The given number is negative: +negative");
        else
        System.out.println("The given number is zero: +zero");
    }
}