import java.util.Scanner;
class Uniquenum{
    
    public static void main(String args[]){
        int count=1;
      int arr[]={35,45,67,67,90,35,35,50};
      
      for(int i=0;i<arr.length;i++){
          
          for(int j=i+1;j<arr.length;j++){
              
              if(arr[i]==arr[j]){
                  count++;
                  arr[j]=0;
              }
          }
          if(arr[i]!=0 && count==1){
          System.out.println(arr[i]+" : "+count);
          }
          count=1;
      }
      
    
    
    }
}