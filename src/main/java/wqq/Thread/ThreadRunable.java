package wqq.Thread;

public class ThreadRunable implements Runnable {
    private  int ticketCount=100;
    @Override
    public void run() {
        while (true){

            if(ticketCount>0){

                System.out.println(Thread.currentThread().getName()+"出售票"+ticketCount--);
            }else{
                System.exit(0);
            }
        }
    }
}
