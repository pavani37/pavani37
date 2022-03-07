import java.util.Scanner;
public class percentage{
    
     public static void main(String args[]){
         int s1=0, s2=0, s3=0,s4=0, s5=0, totalmarks=0, percentage=0;
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter s1, s2, s3, s4, s5 marks");
         int s1=sc.nextInt();
         int s2=sc.nextInt();
         int s3=sc.nextInt();
         int s4=sc.nextInt();
         int s5=sc.nextInt();
         
         totalmarks=s1+s2+s3+s4+s5;
         percentage=(totalmarks/500)*100;
         System.out.prntln("Total marks is: "+totalmarks);
         System.out.prntln("Percentage is: "+percentage);
     }
}
         