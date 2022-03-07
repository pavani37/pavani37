import java.util.Scanner;
public class Numbers{
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int i=0;
        for(i=1;i<=num;i++){
         System.out.println(i+"");   
        }
    }
}