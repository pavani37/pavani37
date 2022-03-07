class Ex14{
    
    public static void main(String args[]){
              
              int age=12;
              
              if(age<18){
                  throw new ArithmeticException("Not Eligible for vote");
              }
              else{
                  System.out.println("Eligible for vote");
              }
              
    }
}