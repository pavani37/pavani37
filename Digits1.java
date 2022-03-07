import java.util.Scanner;
public class Digits1{
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int count=0;
        for(int i=0;i<=num;i++){
          num=num/10;
          count=++count;
        }
        System.out.println("Number of digits: "+count);
    }
}
