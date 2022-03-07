import java.util.Scanner;
public class num{
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int i=0;
        for(i=num;i>=1;i--){
         System.out.println(i+"");   
        }
    }
}