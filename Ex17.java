class Ex17 extends Thread {
    
    public void run(){
        for(int i=0;i<=25;i++){
            System.out.println("User thread");
        }
    }
    public static void main(String args[]){
        
        Ex17 obj=new Ex17();
                  obj.start();
        
        for(int i=0;i<=15;i++){
            System.out.println("Main thread");
        }
        
        
    }
}
