import java.util.Scanner;
public class Primenum{
    public static void main(String args[]){
        int num=1,primenumber,count;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");

        while(num<100){
            count=0;
            primenumber=2;
            while(primenumber<=num/2){
                if(num%primenumber==0){
                    count++;
                    break;
                }
                primenumber++;
            }
            if(count==0 && num!=1){
                System.out.print(num+" ");
            }
                }
            }
}