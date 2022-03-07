import java.util.Scanner;
public class Printnum{
    public static void main(String args[]){
        int i=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value n: ");
        int n=sc.nextInt();
        System.out.println(" The numbers are: ");
        while(i<=n){
            System.out.println(i);
            i++;
        }
    }
}