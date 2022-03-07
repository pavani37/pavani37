public class Firstlastdigit{
public static void main(String args[]){
int number=56238974;
int firstdigit=0;
int lastdigit=0;
lastdigit=number%10;
System.out.println("last digit:"+lastdigit);
while(number!=0){
firstdigit=number%10;
number=number/10;
}
System.out.println("first digit:"+firstdigit);
}
}