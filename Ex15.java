class Ex15{

    public void add() throws Exception {
        
        System.out.println(10/2);  
    }
    
    public static void main(String args[]){
              
              Ex15 obj=new Ex15();
              try{
              obj.add();
              }
              catch(Exception e){
                  System.out.println("Catch block");
              }
    }
}