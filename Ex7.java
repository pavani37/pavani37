class Ex7{
    
    public static void main(String args[]){
 
          try{
             String str=null;
             
             int l=str.length();
          }
          catch(ArithmeticException e){
             System.out.println("AE");   
          }
          catch(NumberFormatException e1){
             System.out.println("NFE");   
          }
          catch(Exception e){
              System.out.println("Exception");
          }
          
    }
}