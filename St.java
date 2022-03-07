import java.util.Scanner;
public class St{
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter start and stop values");
        int start=sc.nextInt();
        int stop=sc.nextInt();
        if(start<stop){
          for(int i=start;i<=stop;i++){
            System.out.println(i+"");  
          }
        }
        else if(start>stop){
          for(int i=start;i>=stop;i--){
            System.out.println(i+"");
          }
        }
        else{
           System.out.println("Your start and stop values are same");     
        }
    }
}