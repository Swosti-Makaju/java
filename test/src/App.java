//Inter-thread communication in multithreading means a process by which threads coordinate and exchange information in a multithreaded program.

public class App {
    public static void main(String[] args) throws Exception {
       Customer c=new Customer();
       Thread t1 = new Thread()
       {
        public void run()
        {
            c.withdraw(15000);
        }
       };
       t1.start();
       Thread t2 = new Thread()
       {
        public void run()
        {
            c.deposit(200000);
        }
       };
       t2.start();
    }
}
class Customer{
    int amount=10000;
    synchronized void withdraw(int amount){
        System.out.println("going to withdraw......");
        if(this.amount<amount){
            System.out.println("less balance;waiting for deposit.....");
            try{
                wait();
            }
            catch(Exception e){}
         }
         this.amount-=amount;
         System.out.println("withdraw completed.........");
    }
    synchronized void deposit(int amount){
        System.out.println("going to deposit......");
        this.amount+=amount;
            System.out.println("deposit completed........");
        notify();
    }
}
