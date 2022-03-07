public class Occurence{
    public static void main(String args[]){
        int count=1;
      int arr[]={45,23,56,87,45,23,90,56};
      
      for(int i=0;i<arr.length;i++){
          
          for(int j=i+1;j<arr.length;j++){
              
              if(arr[i]==arr[j]){
                  count++;
                  arr[j]=0;
              }
          }
          if(arr[i]!=0){
          System.out.println(arr[i]+" : "+count);
          }
          count=1;
      }
    }
}