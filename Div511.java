import java.util.Scanner;
public class Div511{
    public  static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number to check whether it is divisible by 5 and 11");
        n=sc.nextInt();
        if((n % 5 == 0) && (n % 11 == 0)){
        System.out.println("Given number is divisible by 5 and 11: + divisible");
        }
        else{
        System.out.println("Given number is not divisible by 5 and 11: + not divisible");
        }
    }
}