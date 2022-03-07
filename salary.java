import java.util.*;
public class salary 
{

    public static void main(String args[])
    {
         float basic salary, hra, da, gross salary;
              
           Scanner scan= new Scanner(System.in);
           System.out.println("Enter the basic salary");
           basic salary=scan.nextFloat();
         
              hra=(float)(basic salary/100)*56;
              da=(float)(basic salary/100)*90;
              gross salary=(float)(basic salary+hra+da);
                   
              System.out.println("gross salary is "+grosssalary);
              
     }
}