import java.util.Scanner;
public class score{
    public static void main(String args[]){
        
        Scanner s=newScanner(System.in);
        System.out.println("Enter project marks");
        int pm=s.nextInt();
        System.out.println("Enter external marks");
        int em=s.nextInt();
        System.out.println("Enter internal marks");
        int im=s.nextInt();
        if(pm>=50 && em>=50 && im>=50){
        int total=pm+em+im;
        System.out.println("pass");
        }else{
            System.out.println("fail");
        }
     
        
