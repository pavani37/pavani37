class Ex11{
    
    public static void main(String args[]){
 
          try{
              System.out.println(10/2);
              try{
                  System.out.println(10/0);
              }
              catch(Exception e){
                  System.out.println(10/0);
              }
          }
          catch(ArithmeticException e){
              System.out.println("outer catch");
          }
          System.out.println("Bye");
          
    }
}