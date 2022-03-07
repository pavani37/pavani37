import java.util.Scanner;
public class Evenoddsum{
    public static void main(String args[]){
        int sum=0,even=0,odd=0;
        int arr[]={21,46,65,79,10,54,98,78};
        for (int i=0;i<arr.length;i++){
            if(i%2==0)
            even +=arr[i];
            else
            odd +=arr[i];
        }
         System.out.println("sum of even array is: "+even);
         System.out.println("sum of odd array is: "+odd);
    }
}