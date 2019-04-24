package wqq.Thread;

/**
 *
 * 一个Thread对象只能创建一个线程，即使它调用多次的.start()也会只运行一个的线程。
 */
public class MyThreadMain {
    public static void main(String[] args) {
//        Thread myThread=new MyThread();
//        myThread.start();
//        myThread.start();


        //创建多个线程,各自执行互不影响
        new MyThread().start();
        new MyThread().start();
    }
}
