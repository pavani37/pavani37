import java.util.Scanner;
public class Leapyearornot{
    public  static void main(String args[]){
        int year;
        System.out.println("Enter year:");
        Scanner sc=new Scanner(System.in);
        year=sc.nextInt();  
        if(((year % 4 ==0) && (year % 100!=0)) || (year % 400 == 0))
            System.out.println("Given year is leap year: +leap");
            else
            System.out.println("Given year is not leap year: +not leap");
    }
}
            
        