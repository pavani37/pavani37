class Ex16{
 
    public void vote() throws InvalidAgeException{
        int age=32;
        if(age<18){
            throw new InvalidAgeException("Not eligible for vote");
        }
        else{
            System.out.println("Eligible for vote");
        }
    }
    public static void main(String args[]){
              
   Ex16 obj=new Ex16();
            try{
                obj.vote();
                
            }
            catch(InvalidAgeException e){
                System.out.println(e);
            
            }
    } 
}