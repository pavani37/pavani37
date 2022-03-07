class Ex8{
    
    public static void main(String args[]){
 
          try{
              System.out.println("outer try");
              try{
                  System.out.println(10/0);
              }
              catch(Exception e){
                  System.out.println("inner catch");
              }
          }
          catch(ArithmeticException e){
              System.out.println("outer catch");
          }
          System.out.println("Bye");
          
    }
}