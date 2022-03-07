public class Ex12{
    public static void main(String args[]){
        int i=1;
        while(i<=10){
             i++;
            if(i==5 || i==7) {
                continue;
            }
             System.out.print(i+" ");
        }
    }
}