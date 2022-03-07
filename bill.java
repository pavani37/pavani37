import java.util.Scanner;
public class bill{
    public static void main(String args[]){
        double units=0,bill=0,gst=0,finalbill=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.of units");
        units=sc.nextDouble();
        bill=units*34.56;
        gst=(bill*18)/100;
        finalbill=(bill+gst);
        System.out.println("The final bill is : "+finalbill);
    }
}