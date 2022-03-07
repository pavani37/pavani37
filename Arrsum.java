import java.util.Scanner;
public class Arrsum{
    public static void main(String args[]){
         
         int arr[]={23,45,67,67,90,23,23,50};
         for(int i=1;i<=arr.length;i++){
             for(int j=i+1;j<=arr.length;j++)
         if(arr[i]==arr[j]){
             count++;
             arr[j]=0;
         }
         }
    }
}