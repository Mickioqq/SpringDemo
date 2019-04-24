package wqq.Thread;

/**
 * 线程的5种状态
 *1. 新建状态(New): 线程对象被创建后，就进入了新建状态。此时它和其他Java对象一样，
 * 仅仅由Java虚拟机分配了内存，并初始化其成员变量值。
 *
 * 2. 就绪状态(Runnable): 也被称为“可执行状态”。线程对象被调用了该对象的start()方法，
 * 该线程处于就绪状态。Java虚拟机会为其创建方法调用栈和程序计数器。处于就绪状态的线程，随时可能被CPU调度执行
 * ，取决于JVM中线程调度器的调度。
 *
 * 3. 运行状态(Running) : 线程获取CPU权限进行执行。需要注意的是，线程只能从就绪状态进入到运行状态。
 *
 * 4. 阻塞状态(Blocked)  : 阻塞状态是线程因为某种原因放弃CPU使用权，暂时停止运行。直到线程进入就绪状态，才有机会转到运行状态。阻塞的情况分三种：
 *     (01) 等待阻塞 -- 通过调用线程的wait()方法，让线程等待某工作的完成。
 *     (02) 同步阻塞 -- 线程在获取synchronized同步锁失败(因为锁被其它线程所占用)，它会进入同步阻塞状态。
 *     (03) 其他阻塞 -- 通过调用线程的sleep()或join()或发出了I/O请求时，线程会进入到阻塞状态。当sleep()状态超时、join()等待线程终止或者超时、或者I/O处理完毕时，线程重新转入就绪状态。
 *
 * 5. 死亡状态(Dead)    : 线程执行完了、因异常退出了run()方法或者直接调用该线程的stop()方法（容易导致死锁，现在已经不推荐使用），该线程结束生命周期。
 *
 *
 *
 *
 *
 */
//一个Thread对象只能创建一个线程，即使它调用多次的.start()也会只运行一个的线程。
public class MyThread extends Thread {
    private  int ticketCount=20;

    public void run(){

        while (true){

            if(ticketCount>0){

                System.out.println(Thread.currentThread().getName()+"出售票"+ticketCount--);
            }else{
                System.exit(0);
            }
        }
    }

}
