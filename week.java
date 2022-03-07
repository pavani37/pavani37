import java.util.Scanner;
public class week{
    public static void main(String args[]){
        int weeknum=0,weekday=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter week number");
        weeknum=sc.nextInt();
        System.out.println("Enter week day");
        weekday=sc.nextInt();
        if(weekday=1){
            System.out.println("Enter sunday");
        }else if(weekday=2){
            System.out.println("Enter monday");
        }else if(weekday=3){
            System.out.println("Enter tuesday");
        }else if(weekday=4){
            System.out.println("Enter wednesday");
        }else if(weekday=5){
            System.out.println("Enter thursday");
        }else if(weekday=6){
            System.out.println("Enter friday");
        }else if(weekday=7){
            System.out.println("Enter saturday");
        }else{
            System.out.println("Please enter weekday number between 1-7");
        }
    }    
}        