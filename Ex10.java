class Ex10{
    
    public static void main(String args[]){
 
          try{
              System.out.println(10/0);
              try{
                  System.out.println(10/2);
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