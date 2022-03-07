import java.util.Scanner;
public class Numpresent{
    public static void main(String args[]){
        int arr[]={21,46,65,79,10,54,98,78};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the search number");
        int key=sc.nextInt();
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                count++;
                break;
            }
        }
        if(count>0){
            System.out.println("Yes, the number is present in array");
        }
        else{
            System.out.println("No, the number is not present in array");
        }
    }
}